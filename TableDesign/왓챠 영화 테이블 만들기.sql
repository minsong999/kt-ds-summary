-- ��ȭ
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

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('MOVIES', '*', '��ȭ�� ���� ������ ������', systimestamp, CURRENT_USER);

-- ��ȭ
ALTER TABLE "MOVIES"
	ADD CONSTRAINT "PK_MOVIES" -- ��ȭ �⺻Ű
	PRIMARY KEY (
	"MOVIE_ID" -- ��ȭ���̵�
	);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('MOVIES', 'MOVIE_ID', '��ȭ�� ���� ��ȣ', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('MOVIES', 'TITLE', '��ȭ�� ����', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('MOVIES', 'MINIMUM_AGE', '������ ����', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('MOVIES', 'OPEN_YEAR', '������ ����', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('MOVIES', 'RUNNING_TIME', '�󿵽ð�(�д���)', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('MOVIES', 'GENRE', '�帣��', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('MOVIES', 'ATMOSPHERE', '��ȭ�� ������', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('MOVIES', 'LOCATION', '��ȭ ���� ����', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('MOVIES', 'SUMMARY', '������ �ٰŸ�', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('MOVIES', 'POSTER', '������ URL', systimestamp, CURRENT_USER);

-- ����
CREATE TABLE "DIRECTORS" (
	"DIRECTOR_ID" VARCHAR2(20 CHAR) NOT NULL,
	"NAME" VARCHAR2(20 CHAR) NOT NULL,
	"PROFILE" VARCHAR2(4000 CHAR) NOT NULL
);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('DIRECTORS', '*', '��ȭ ������ ������ ����', systimestamp, CURRENT_USER);

-- ����
ALTER TABLE "DIRECTORS"
	ADD CONSTRAINT "PK_DIRECTORS" -- ���� �⺻Ű
	PRIMARY KEY (
	"DIRECTOR_ID" -- ���� ���̵�
	);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('DIRECTORS', 'DIRECTOR_ID', '��ȭ ������ ���� ��ȣ', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('DIRECTORS', 'NAME', '������', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('DIRECTORS', 'PROFILE', '������ ������ ���� URL', systimestamp, CURRENT_USER);

-- ����
CREATE TABLE "PRODUCING" (
	"PRODUCING_ID" VARCHAR2(20 CHAR) NOT NULL,
	"DIRECTOR_ID" VARCHAR2(20 CHAR) NOT NULL,
	"MOVIE_ID" VARCHAR2(20 CHAR) NOT NULL
);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('PRODUCING', '*', '���� ������ ���� ����								
', systimestamp, CURRENT_USER);

-- ����
ALTER TABLE "PRODUCING"
	ADD CONSTRAINT "PK_PRODUCING" -- ���� �⺻Ű
	PRIMARY KEY (
	"PRODUCING_ID" -- ����ID
	);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('PRODUCING', 'PRODUCING_ID', '�����ǰ��� ��ȣ', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('PRODUCING', 'DIRECTOR_ID', '��ȭ ������ ���� ��ȣ', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('PRODUCING', 'MOVIE_ID', '��ȭ�� ���� ��ȣ', systimestamp, CURRENT_USER);

-- ���
CREATE TABLE "ACTORS" (
	"ACTOR_ID" VARCHAR2(20 CHAR) NOT NULL,
	"PROFILE" VARCHAR2(4000 CHAR) NULL,
	"NAME" VARCHAR2(20 CHAR) NOT NULL
);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('ACTORS', '*', '����� ������ ����', systimestamp, CURRENT_USER);

-- ���
ALTER TABLE "ACTORS"
	ADD CONSTRAINT "PK_ACTORS" -- ��� �⺻Ű
	PRIMARY KEY (
	"ACTOR_ID" -- ��� ���̵�
	);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('ACTORS', 'ACTOR_ID', '����� ���� ��ȣ', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('ACTORS', 'PROFILE', '����� ������ ���� URL', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('ACTORS', 'NAME', '����� �̸�', systimestamp, CURRENT_USER);

-- �⿬
CREATE TABLE "CASTS" (
	"CAST_ID" VARCHAR2(20 CHAR) NOT NULL,
	"ACTOR_ID" VARCHAR2(20 CHAR) NOT NULL,
	"MOVIE_ID" VARCHAR2(20 CHAR) NOT NULL,
	"CHARATER_NAME" VARCHAR2(20 CHAR) NULL,
	"MAIN_ACTOR_YN" CHAR(1 CHAR) DEFAULT 'N'
);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('CASTS', '*', '��ȭ�� �⿬�� ����� ����', systimestamp, CURRENT_USER);

-- �⿬
ALTER TABLE "CASTS"
	ADD CONSTRAINT "PK_CASTS" -- �⿬ �⺻Ű
	PRIMARY KEY (
	"CAST_ID" -- �⿬ ���̵�
	);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('CASTS', 'CAST_ID', '�⿬�� ���� ��ȣ', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('CASTS', 'ACTOR_ID', '����� ���� ��ȣ', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('CASTS', 'MOVIE_ID', '��ȭ�� ���� ��ȣ', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('CASTS', 'CHARATER_NAME', '��ȭ ���� ��� ���Ҹ�', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('CASTS', 'MAIN_ACTOR_YN', 'Y:�ֿ� N:����', systimestamp, CURRENT_USER);

-- ����
CREATE TABLE "RATINGS" (
	"RATING_ID" VARCHAR2(20 CHAR) NOT NULL,
	"USER_ID" VARCHAR2(30 CHAR) NOT NULL,
	"RATING" VARCHAR2(30 CHAR) NOT NULL,
	"DESCRIPTION" VARCHAR2(300 CHAR) NULL,
	"MOVIE_ID" VARCHAR2(20 CHAR) NOT NULL
);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('RATINGS', '*', '��ȭ�� ���� ����', systimestamp, CURRENT_USER);

-- ����
ALTER TABLE "RATINGS"
	ADD CONSTRAINT "PK_RATINGS" -- ���� �⺻Ű
	PRIMARY KEY (
	"RATING_ID" -- ���� ���̵�
	);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('RATINGS', 'RATING_ID', '���� ���� ��ȣ', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('RATINGS', 'USER_ID', 'ȸ���� ���̵�', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('RATINGS', 'RATING', '�� ����', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('RATINGS', 'DESCRIPTION', '�� ����', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('RATINGS', 'MOVIE_ID', '��ȭ�� ���� ��ȣ', systimestamp, CURRENT_USER);

-- �����
CREATE TABLE "USERS" (
	"USER_ID" VARCHAR2(30 CHAR) NOT NULL,
	"NAME" VARCHAR2(25 CHAR) NOT NULL,
	"BACKGROUND" VARCHAR2(4000 CHAR) NULL,
	"PROFILE" VARCHAR2(4000 CHAR) NULL
);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('USERS', '*', 'ȸ�� ����', systimestamp, CURRENT_USER);

-- �����
ALTER TABLE "USERS"
	ADD CONSTRAINT "PK_USERS" -- ����� �⺻Ű
	PRIMARY KEY (
	"USER_ID" -- ����� ���̵�
	);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('USERS', 'USER_ID', 'ȸ���� ���̵�', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('USERS', 'NAME', '������� Ȱ����(�г���)', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('USERS', 'BACKGROUND', '�������������� ���� �������� URL', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('USERS', 'PROFILE', '������ ������ URL', systimestamp, CURRENT_USER);

-- �ȷο�
CREATE TABLE "FOLLOWS" (
	"FOLLOW_ID" VARCHAR2(20 CHAR) NOT NULL,
	"USER_ID" VARCHAR2(30 CHAR) NOT NULL,
	"FOLLOW_USER_ID" VARCHAR2(30 CHAR) NOT NULL
);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('FOLLOWS', '*', 'ȸ���� �ȷο� ����', systimestamp, CURRENT_USER);

-- �ȷο�
ALTER TABLE "FOLLOWS"
	ADD CONSTRAINT "PK_FOLLOWS" -- �ȷο� �⺻Ű
	PRIMARY KEY (
	"FOLLOW_ID" -- �ȷο� ���̵�
	);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('FOLLOWS', 'FOLLOW_ID', '�ȷο� ���� ��ȣ', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('FOLLOWS', 'USER_ID', 'ȸ���� ���̵�', systimestamp, CURRENT_USER);

INSERT INTO _cub_schema_comments (table_name, column_name, description, last_updated, last_updated_user) VALUES ('FOLLOWS', 'FOLLOW_USER_ID', '�ȷο� ��� ȸ�� ���̵�', systimestamp, CURRENT_USER);

-- ����
ALTER TABLE "PRODUCING"
	ADD CONSTRAINT "FK_DIRECTORS_TO_PRODUCING" -- ���� -> ����
	FOREIGN KEY (
	"DIRECTOR_ID" -- ���� ���̵�
	)
	REFERENCES "DIRECTORS" ( -- ����
	"DIRECTOR_ID" -- ���� ���̵�
	);

-- ����
ALTER TABLE "PRODUCING"
	ADD CONSTRAINT "FK_MOVIES_TO_PRODUCING" -- ��ȭ -> ����
	FOREIGN KEY (
	"MOVIE_ID" -- ��ȭ���̵�
	)
	REFERENCES "MOVIES" ( -- ��ȭ
	"MOVIE_ID" -- ��ȭ���̵�
	);

-- �⿬
ALTER TABLE "CASTS"
	ADD CONSTRAINT "FK_ACTORS_TO_CASTS" -- ��� -> �⿬
	FOREIGN KEY (
	"ACTOR_ID" -- ��� ���̵�
	)
	REFERENCES "ACTORS" ( -- ���
	"ACTOR_ID" -- ��� ���̵�
	);

-- �⿬
ALTER TABLE "CASTS"
	ADD CONSTRAINT "FK_MOVIES_TO_CASTS" -- ��ȭ -> �⿬
	FOREIGN KEY (
	"MOVIE_ID" -- ��ȭ���̵�
	)
	REFERENCES "MOVIES" ( -- ��ȭ
	"MOVIE_ID" -- ��ȭ���̵�
	);

-- ����
ALTER TABLE "RATINGS"
	ADD CONSTRAINT "FK_MOVIES_TO_RATINGS" -- ��ȭ -> ����
	FOREIGN KEY (
	"MOVIE_ID" -- ��ȭ���̵�
	)
	REFERENCES "MOVIES" ( -- ��ȭ
	"MOVIE_ID" -- ��ȭ���̵�
	);

-- ����
ALTER TABLE "RATINGS"
	ADD CONSTRAINT "FK_USERS_TO_RATINGS" -- ����� -> ����
	FOREIGN KEY (
	"USER_ID" -- ����� ���̵�
	)
	REFERENCES "USERS" ( -- �����
	"USER_ID" -- ����� ���̵�
	);

-- �ȷο�
ALTER TABLE "FOLLOWS"
	ADD CONSTRAINT "FK_USERS_TO_FOLLOWS" -- ����� -> �ȷο�
	FOREIGN KEY (
	"USER_ID" -- ����� ���̵�
	)
	REFERENCES "USERS" ( -- �����
	"USER_ID" -- ����� ���̵�
	);

-- �ȷο�
ALTER TABLE "FOLLOWS"
	ADD CONSTRAINT "FK_USERS_TO_FOLLOWS2" -- ����� -> �ȷο�2
	FOREIGN KEY (
	"FOLLOW_USER_ID" -- �ȷο��ϴ� ���̵�
	)
	REFERENCES "USERS" ( -- �����
	"USER_ID" -- ����� ���̵�
	);