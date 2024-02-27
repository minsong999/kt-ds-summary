-- 영화
CREATE TABLE "MOVIES" (
	"MOVIE_ID" VARCHAR2(20 CHAR) NOT NULL,
	"TITLE" VARCHAR2(100 CHAR) NOT NULL,
	"MINIMUM_AGE" NUMBER NOT NULL,
	"OPEN_YEAR" VARCHAR2(4 CHAR) NULL,
	"RUNNING_TIME" NUMBER NULL,
	"GENRE" VARCHAR2(10 CHAR) NOT NULL,
	"ATMOSPHERE" VARCHAR2(10 CHAR) NULL,
	"LOCATION" VARCHAR2(20 CHAR) NOT NULL,
	"SUMMARY" CLOB NOT NULL,
	"POSTER" VARCHAR2(4000 CHAR) NULL
);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('MOVIES', '*', '영화에 대한 간략한 정보들', systimestamp, CURRENT_USER);

-- 영화
ALTER TABLE "MOVIES"
	ADD CONSTRAINT "PK_MOVIES" -- 영화 기본키
	PRIMARY KEY (
	"MOVIE_ID" -- 영화아이디
	);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('MOVIES', 'MOVIE_ID', '영화의 고유 번호', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('MOVIES', 'TITLE', '영화의 제목', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('MOVIES', 'MINIMUM_AGE', '관람가 정보', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('MOVIES', 'OPEN_YEAR', '개봉한 연도', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('MOVIES', 'RUNNING_TIME', '상영시간(분단위)', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('MOVIES', 'GENRE', '장르명', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('MOVIES', 'ATMOSPHERE', '영화의 분위기', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('MOVIES', 'LOCATION', '영화 제작 국가', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('MOVIES', 'SUMMARY', '간략한 줄거리', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('MOVIES', 'POSTER', '포스터 URL', systimestamp, CURRENT_USER);

-- 감독
CREATE TABLE "DIRECTORS" (
	"DIRECTOR_ID" VARCHAR2(20 CHAR) NOT NULL,
	"NAME" VARCHAR2(20 CHAR) NOT NULL,
	"PROFILE" VARCHAR2(4000 CHAR) NOT NULL
);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('DIRECTORS', '*', '영화 감독의 간략한 정보', systimestamp, CURRENT_USER);

-- 감독
ALTER TABLE "DIRECTORS"
	ADD CONSTRAINT "PK_DIRECTORS" -- 감독 기본키
	PRIMARY KEY (
	"DIRECTOR_ID" -- 감독 아이디
	);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('DIRECTORS', 'DIRECTOR_ID', '영화 감독의 고유 번호', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('DIRECTORS', 'NAME', '감독명', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('DIRECTORS', 'PROFILE', '감독의 프로필 사진 URL', systimestamp, CURRENT_USER);

-- 제작
CREATE TABLE "PRODUCING" (
	"PRODUCING_ID" VARCHAR2(20 CHAR) NOT NULL,
	"DIRECTOR_ID" VARCHAR2(20 CHAR) NOT NULL,
	"MOVIE_ID" VARCHAR2(20 CHAR) NOT NULL
);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('PRODUCING', '*', '제작 정보에 관한 정보								
', systimestamp, CURRENT_USER);

-- 제작
ALTER TABLE "PRODUCING"
	ADD CONSTRAINT "PK_PRODUCING" -- 제작 기본키
	PRIMARY KEY (
	"PRODUCING_ID" -- 제작ID
	);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('PRODUCING', 'PRODUCING_ID', '제작의고유 번호', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('PRODUCING', 'DIRECTOR_ID', '영화 감독의 고유 번호', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('PRODUCING', 'MOVIE_ID', '영화의 고유 번호', systimestamp, CURRENT_USER);

-- 배우
CREATE TABLE "ACTORS" (
	"ACTOR_ID" VARCHAR2(20 CHAR) NOT NULL,
	"PROFILE" VARCHAR2(4000 CHAR) NULL,
	"NAME" VARCHAR2(20 CHAR) NOT NULL
);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('ACTORS', '*', '배우의 간략한 정보', systimestamp, CURRENT_USER);

-- 배우
ALTER TABLE "ACTORS"
	ADD CONSTRAINT "PK_ACTORS" -- 배우 기본키
	PRIMARY KEY (
	"ACTOR_ID" -- 배우 아이디
	);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('ACTORS', 'ACTOR_ID', '배우의 고유 번호', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('ACTORS', 'PROFILE', '배우의 프로필 사진 URL', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('ACTORS', 'NAME', '배우의 이름', systimestamp, CURRENT_USER);

-- 출연
CREATE TABLE "CASTS" (
	"CAST_ID" VARCHAR2(20 CHAR) NOT NULL,
	"ACTOR_ID" VARCHAR2(20 CHAR) NOT NULL,
	"MOVIE_ID" VARCHAR2(20 CHAR) NOT NULL,
	"CHARATER_NAME" VARCHAR2(20 CHAR) NULL,
	"MAIN_ACTOR_YN" CHAR(1 CHAR) DEFAULT 'N'
);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('CASTS', '*', '영화에 출연한 배우의 정보', systimestamp, CURRENT_USER);

-- 출연
ALTER TABLE "CASTS"
	ADD CONSTRAINT "PK_CASTS" -- 출연 기본키
	PRIMARY KEY (
	"CAST_ID" -- 출연 아이디
	);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('CASTS', 'CAST_ID', '출연의 고유 번호', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('CASTS', 'ACTOR_ID', '배우의 고유 번호', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('CASTS', 'MOVIE_ID', '영화의 고유 번호', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('CASTS', 'CHARATER_NAME', '영화 내의 배우 역할명', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('CASTS', 'MAIN_ACTOR_YN', 'Y:주연 N:조연', systimestamp, CURRENT_USER);

-- 평점
CREATE TABLE "RATINGS" (
	"RATING_ID" VARCHAR2(20 CHAR) NOT NULL,
	"USER_ID" VARCHAR2(30 CHAR) NOT NULL,
	"RATING" VARCHAR2(30 CHAR) NOT NULL,
	"DESCRIPTION" VARCHAR2(300 CHAR) NULL,
	"MOVIE_ID" VARCHAR2(20 CHAR) NOT NULL
);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('RATINGS', '*', '영화의 평점 정보', systimestamp, CURRENT_USER);

-- 평점
ALTER TABLE "RATINGS"
	ADD CONSTRAINT "PK_RATINGS" -- 평점 기본키
	PRIMARY KEY (
	"RATING_ID" -- 평점 아이디
	);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('RATINGS', 'RATING_ID', '평점 고유 번호', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('RATINGS', 'USER_ID', '회원의 아이디', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('RATINGS', 'RATING', '평가 점수', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('RATINGS', 'DESCRIPTION', '평가 내용', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('RATINGS', 'MOVIE_ID', '영화의 고유 번호', systimestamp, CURRENT_USER);

-- 사용자
CREATE TABLE "USERS" (
	"USER_ID" VARCHAR2(30 CHAR) NOT NULL,
	"NAME" VARCHAR2(25 CHAR) NOT NULL,
	"BACKGROUND" VARCHAR2(4000 CHAR) NULL,
	"PROFILE" VARCHAR2(4000 CHAR) NULL
);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('USERS', '*', '회원 정보', systimestamp, CURRENT_USER);

-- 사용자
ALTER TABLE "USERS"
	ADD CONSTRAINT "PK_USERS" -- 사용자 기본키
	PRIMARY KEY (
	"USER_ID" -- 사용자 아이디
	);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('USERS', 'USER_ID', '회원의 아이디', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('USERS', 'NAME', '사용자의 활동명(닉네임)', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('USERS', 'BACKGROUND', '마이페이지에서 사용될 배경사진의 URL', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('USERS', 'PROFILE', '프로필 사진의 URL', systimestamp, CURRENT_USER);

-- 팔로우
CREATE TABLE "FOLLOWS" (
	"FOLLOW_ID" VARCHAR2(20 CHAR) NOT NULL,
	"USER_ID" VARCHAR2(30 CHAR) NOT NULL,
	"FOLLOW_USER_ID" VARCHAR2(30 CHAR) NOT NULL
);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('FOLLOWS', '*', '회원의 팔로우 정보', systimestamp, CURRENT_USER);

-- 팔로우
ALTER TABLE "FOLLOWS"
	ADD CONSTRAINT "PK_FOLLOWS" -- 팔로우 기본키
	PRIMARY KEY (
	"FOLLOW_ID" -- 팔로우 아이디
	);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('FOLLOWS', 'FOLLOW_ID', '팔로우 고유 번호', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('FOLLOWS', 'USER_ID', '회원의 아이디', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('FOLLOWS', 'FOLLOW_USER_ID', '팔로우 대상 회원 아이디', systimestamp, CURRENT_USER);

-- 제작
ALTER TABLE "PRODUCING"
	ADD CONSTRAINT "FK_DIRECTORS_TO_PRODUCING" -- 감독 -> 제작
	FOREIGN KEY (
	"DIRECTOR_ID" -- 감독 아이디
	)
	REFERENCES "DIRECTORS" ( -- 감독
	"DIRECTOR_ID" -- 감독 아이디
	);

-- 제작
ALTER TABLE "PRODUCING"
	ADD CONSTRAINT "FK_MOVIES_TO_PRODUCING" -- 영화 -> 제작
	FOREIGN KEY (
	"MOVIE_ID" -- 영화아이디
	)
	REFERENCES "MOVIES" ( -- 영화
	"MOVIE_ID" -- 영화아이디
	);

-- 출연
ALTER TABLE "CASTS"
	ADD CONSTRAINT "FK_ACTORS_TO_CASTS" -- 배우 -> 출연
	FOREIGN KEY (
	"ACTOR_ID" -- 배우 아이디
	)
	REFERENCES "ACTORS" ( -- 배우
	"ACTOR_ID" -- 배우 아이디
	);

-- 출연
ALTER TABLE "CASTS"
	ADD CONSTRAINT "FK_MOVIES_TO_CASTS" -- 영화 -> 출연
	FOREIGN KEY (
	"MOVIE_ID" -- 영화아이디
	)
	REFERENCES "MOVIES" ( -- 영화
	"MOVIE_ID" -- 영화아이디
	);

-- 평점
ALTER TABLE "RATINGS"
	ADD CONSTRAINT "FK_MOVIES_TO_RATINGS" -- 영화 -> 평점
	FOREIGN KEY (
	"MOVIE_ID" -- 영화아이디
	)
	REFERENCES "MOVIES" ( -- 영화
	"MOVIE_ID" -- 영화아이디
	);

-- 평점
ALTER TABLE "RATINGS"
	ADD CONSTRAINT "FK_USERS_TO_RATINGS" -- 사용자 -> 평점
	FOREIGN KEY (
	"USER_ID" -- 사용자 아이디
	)
	REFERENCES "USERS" ( -- 사용자
	"USER_ID" -- 사용자 아이디
	);

-- 팔로우
ALTER TABLE "FOLLOWS"
	ADD CONSTRAINT "FK_USERS_TO_FOLLOWS" -- 사용자 -> 팔로우
	FOREIGN KEY (
	"USER_ID" -- 사용자 아이디
	)
	REFERENCES "USERS" ( -- 사용자
	"USER_ID" -- 사용자 아이디
	);

-- 팔로우
ALTER TABLE "FOLLOWS"
	ADD CONSTRAINT "FK_USERS_TO_FOLLOWS2" -- 사용자 -> 팔로우2
	FOREIGN KEY (
	"FOLLOW_USER_ID" -- 팔로우하는 아이디
	)
	REFERENCES "USERS" ( -- 사용자
	"USER_ID" -- 사용자 아이디
	);