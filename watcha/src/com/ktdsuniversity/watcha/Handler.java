package com.ktdsuniversity.watcha;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ktdsuniversity.watcha.service.ActorsService;
import com.ktdsuniversity.watcha.service.DirectorsService;
import com.ktdsuniversity.watcha.service.MoviesService;
import com.ktdsuniversity.watcha.service.RatingsService;
import com.ktdsuniversity.watcha.service.UsersService;
import com.ktdsuniversity.watcha.vo.CastsVO;
import com.ktdsuniversity.watcha.vo.DirectorsVO;
import com.ktdsuniversity.watcha.vo.MoviesVO;
import com.ktdsuniversity.watcha.vo.UsersVO;

public class Handler {
	private Scanner keyboard;

	private DirectorsService directorsService = new DirectorsService();
	private MoviesService moviesService = new MoviesService();
	private ActorsService actorsService = new ActorsService();
	private UsersService usersService = new UsersService();
	private RatingsService ratingService = new RatingsService();

	public Handler() {
		this.keyboard = new Scanner(System.in);

		this.directorsService = new DirectorsService();
		this.moviesService = new MoviesService();
		this.actorsService = new ActorsService();
		this.usersService = new UsersService();
		this.ratingService = new RatingsService();
		// printMainMenus();
	}

	private void printMainMenus() {
		System.out.println("=".repeat(30));
		System.out.println("1. 영화 관리");
		System.out.println("2. 감독 관리");
		System.out.println("3. 배우 관리");
		System.out.println("4. 평점 관리");
		System.out.println("5. 회원 관리");
		System.out.println("=".repeat(30));
		System.out.println("메뉴를 선택하세요.");
	}

	private void printMovieMenus() {
		System.out.println("=".repeat(30));
		System.out.println("\t 1. 전체 영화 조회");
		System.out.println("\t 2. 영화 조회");
		System.out.println("\t 3. 영화 수정 ");
		System.out.println("\t 4. 영화 삭제");
		System.out.println("\t 5. 영화 등록");
		System.out.println("=".repeat(30));
	}

	private void printDirectorMenus() {
		System.out.println("=".repeat(30));
		System.out.println("\t 1. 전체 감독 조회");
		System.out.println("\t 2. 감독 조회");
		System.out.println("\t 3. 감독 수정 ");
		System.out.println("\t 4. 감독 삭제");
		System.out.println("=".repeat(30));
	}

	private void printActorMenus() {
		System.out.println("=".repeat(30));
		System.out.println("\t 1. 전체 배우 조회");
		System.out.println("\t 2. 배우 조회");
		System.out.println("\t 3. 배우 수정 ");
		System.out.println("\t 4. 배우 삭제");
		System.out.println("=".repeat(30));
	}

	private void printRatingMenus() {
		System.out.println("=".repeat(30));
		System.out.println("\t 1. 전체 평점 조회");
		System.out.println("\t 2. 평점 조회");
		System.out.println("\t 3. 평점 수정 ");
		System.out.println("\t 4. 평점 삭제");
		System.out.println("=".repeat(30));
	}

	private void printUsersMenus() {
		System.out.println("=".repeat(30));
		System.out.println("\t 1. 전체 회원 조회");
		System.out.println("\t 2. 회원 조회");
		System.out.println("\t 3. 회원 수정 ");
		System.out.println("\t 4. 회원 삭제");
		System.out.println("=".repeat(30));
	}

	private void movieMeneHandler() {
		int movieMenu = this.keyboard.nextInt();
		this.keyboard.nextLine();

		if (movieMenu == 1) {
			// 전체 영화 조회
			List<MoviesVO> movies = this.moviesService.findAllMovies();
			movies.forEach(movie -> {
				movie.printSimpleDescription();
			});
		} else if (movieMenu == 2) {
			// 영화 조회

			System.out.println("조회하려는 영화의 이름을 입력하세요.");
			String movieTitle = this.keyboard.nextLine();

			List<MoviesVO> movies = this.moviesService.findMoviesByTitle(movieTitle);
			if (movies.size() == 0) {
				System.out.println("찾으시는 영화는 없습니다.");
			} else if (movies.size() == 1) {
				System.out.println(movies.get(0).toString());
			} else {
				System.out.println(movies.size() + "건의 영화가 검색되었습니다.");
				for (int i = 0; i < movies.size(); i++) {
					System.out.println(movies.get(0).toString());
				}

				System.out.println("원하는 영화의 번호를 입력하세요.");
				int movieIndex = this.keyboard.nextInt();
				this.keyboard.nextLine();

				System.out.println(movies.get(movieIndex));
			}

		} else if (movieMenu == 3) {
			// 영화 수정
			// 전체 영화 조회
			List<MoviesVO> movies = this.moviesService.findAllMovies();
			movies.forEach(movie -> {
				movie.printSimpleDescription();
			});

			System.out.println("수정하려는 영화의 번호를 입력하세요.");
			String movieIndex = this.keyboard.nextLine();
			this.keyboard.nextLine();

			MoviesVO moviesVO = this.moviesService.findMovieById(movieIndex);

			// TODO 영화 수정 로직 작성해야 함
			System.out.print("제목(" + moviesVO.getTitle() + "): ");
			String newTitle = this.keyboard.nextLine();
			if (newTitle != null && newTitle.trim().length() > 0) {
				moviesVO.setTitle(newTitle);
			}

			System.out.println("관람등급(" + moviesVO.getMinimumAge() + "): ");
			String newMinimumAge = this.keyboard.nextLine();
			if (newMinimumAge != null && newMinimumAge.trim().length() > 0) {
				moviesVO.setMinimumAge(Integer.parseInt(newMinimumAge));
			}

			System.out.println("개봉연도(" + moviesVO.getOpenYear() + "): ");
			String newOpenYear = this.keyboard.nextLine();
			if (newOpenYear != null && newOpenYear.trim().length() > 0) {
				moviesVO.setOpenYear(newOpenYear);
			}

			System.out.println("상영시간(" + moviesVO.getRunningTime() + "): ");
			String newRunningTime = this.keyboard.nextLine();
			if (newMinimumAge != null && newMinimumAge.trim().length() > 0) {
				moviesVO.setRunningTime(Integer.parseInt(newRunningTime));
			}

			System.out.println("장르(" + moviesVO.getGenre() + "): ");
			String newGenre = this.keyboard.nextLine();
			if (newGenre != null && newGenre.trim().length() > 0) {
				moviesVO.setGenre(newGenre);
			}

			System.out.println("분위기 (" + moviesVO.getAtmosphere() + "): ");
			String newAtmosphere = this.keyboard.nextLine();
			if (newAtmosphere != null && newAtmosphere.trim().length() > 0) {
				moviesVO.setAtmosphere(newAtmosphere);
			}

			System.out.println("제작국가(" + moviesVO.getLocation() + "): ");
			String newLocation = this.keyboard.nextLine();
			if (newLocation != null && newLocation.trim().length() > 0) {
				moviesVO.setLocation(newLocation);
			}

			System.out.println("줄거리(" + moviesVO.getSummary() + "): ");
			String newSummary = this.keyboard.nextLine();
			if (newSummary != null && newSummary.trim().length() > 0) {
				moviesVO.setSummary(newSummary);
			}

			System.out.println("포스터" + moviesVO.getPoster() + "): ");
			String newPoster = this.keyboard.nextLine();
			if (newPoster != null && newPoster.trim().length() > 0) {
				moviesVO.setPoster(newPoster);
			}

			boolean updatedResult = this.moviesService.modifyOneMovie(moviesVO);
			if (updatedResult) {
				System.out.println("영화 수정이 완료되었습니다.");
			} else {
				System.out.println("영화 수정을 할 수 없습니다.");
			}

		} else if (movieMenu == 4) {
			// 영화 삭제
			List<MoviesVO> movies = this.moviesService.findAllMovies();
			movies.forEach(movie -> {
				System.out.println("MovieId:" + movie.getMovieId());
				System.out.println("Title:" + movie.getTitle());
				System.out.println("개봉년도:" + movie.getOpenYear());
			});

			System.out.println("삭제하려는 영화의 번호를 입력하세요.");
			String movieId = this.keyboard.nextLine();

			boolean updatedResult = this.moviesService.deleteOneMovieById(movieId);
			if (updatedResult) {
				System.out.println("영화 삭제를 완료되었습니다.");
			} else {
				System.out.println("영화 삭제를 할 수 없습니다.");
			}

		} else if (movieMenu == 5) {
			System.out.print("제목: ");
			String newTitle = this.keyboard.nextLine();

			System.out.print("관람등급: ");
			int newMinimumAge = this.keyboard.nextInt();
			this.keyboard.nextLine();

			System.out.print("개봉연도: ");
			String newOpenYear = this.keyboard.nextLine();

			System.out.print("상영시간: ");
			int newRunningTime = this.keyboard.nextInt();
			this.keyboard.nextLine();

			System.out.print("장르: ");
			String newGenre = this.keyboard.nextLine();

			System.out.print("분위기: ");
			String newAtmosphere = this.keyboard.nextLine();

			System.out.print("제작국가: ");
			String newLocation = this.keyboard.nextLine();

			System.out.print("줄거리: ");
			String newSummary = this.keyboard.nextLine();

			System.out.print("포스터: ");
			String newPoster = this.keyboard.nextLine();

			boolean isCreate = this.moviesService.createNewMovie(newTitle, newMinimumAge, newOpenYear, newRunningTime,
					newGenre, newAtmosphere, newLocation, newSummary, newPoster, null);

			if (isCreate) {
				System.out.println("영화 등록을 성공했습니다.");
			} else {
				System.out.println("영화 등록을 실패했습니다.");
			}
		}
	}

	private void mainMenuHandler() {
		int mainMenu = this.keyboard.nextInt();
		this.keyboard.nextLine();

		if (mainMenu == 1) {
			// 영화관리
			this.printMovieMenus();
			this.movieMeneHandler();
		} else if (mainMenu == 2) {
			// 감독관리
			this.printDirectorMenus();
		} else if (mainMenu == 3) {
			// 배우관리
			this.printActorMenus();
		} else if (mainMenu == 4) {
			// 평점관리
			this.printRatingMenus();
		} else if (mainMenu == 5) {
			// 회원관리
			this.printUsersMenus();
		} else {
			// 그 외 번호
			System.out.println("잘못된 번호입니다.");
		}
	}

	public void directorMenuHandler() {
		int directorMenu = this.keyboard.nextInt();
		this.keyboard.nextLine();

		if (directorMenu == 1) {
			// 전체 감독
			List<DirectorsVO> directors = this.directorsService.findAllDirectors();
			directors.forEach(director -> {
				System.out.println(director.getName());
			});
		} else if (directorMenu == 2) {
			// 감독 조회
			System.out.println("조회하려는 감독의 이름을 입력하세요: ");
			String name = this.keyboard.nextLine();

			List<DirectorsVO> directors = this.directorsService.findAllDirectorsByName(name);
			if (directors.size() == 0) {
				System.out.println("조회된 감독이 없습니다.");
			} else {
				directors.forEach(director -> {
					System.out.println(director.getName());
				});
			}
		} else if (directorMenu == 3) {
			// 감독 수정
			List<DirectorsVO> directors = this.directorsService.findAllDirectors();
			directors.forEach(director -> {
				System.out.println(director.getDirectorId());
			});
			System.out.println("수정하려는 감독의 아이디를 입력하세요: ");
			String directorsId = this.keyboard.nextLine();
			DirectorsVO directorsVO = this.directorsService.findDirectorsById(directorsId);
			// 수정로직 추가
			boolean isModified = this.directorsService.modifyOneDirector(directorsVO);
			if (isModified) {
				System.out.println("감독 수정이 완료되었습니다.");
			} else {
				System.out.println("감독 수정이 실패했습니다..");
			}
		} else if (directorMenu == 4) {
			// 감독 삭제
			List<DirectorsVO> directors = this.directorsService.findAllDirectors();
			directors.forEach(director -> {
				System.out.println(director.getDirectorId());
			});
			System.out.println("삭제하려는 감독의 아이디를 입력하세요: ");
			String directorsId = this.keyboard.nextLine();

			boolean isDeleted = this.directorsService.deleteOneDirectorById(directorsId);
			if (isDeleted) {
				System.err.println("감독이 삭제되었습니다.");
			} else {
				System.err.println("감독이 삭제되지 않았습니다.");
			}
		} else if (directorMenu == 5) {
			System.out.println("추가하려는 감독의 이름을 입력하세요.");
			String name = this.keyboard.nextLine();
			System.out.println("추가하려는 감독의 프로필사진 경로를 입력하세요.");
			String profile = this.keyboard.nextLine();

			boolean isCreated = this.directorsService.createNewDirector(name, profile);
			if (isCreated) {
				System.out.println("감독이 등록되었습니다.");
			} else {
				System.out.println("감독이 등록되지 않았습니다.");
			}
		} else {
			System.out.println("존재하지 않는 번호입니다.");
		}
	}

	public static void main(String[] args) {
		Handler handler = new Handler();
		handler.printMainMenus();
		handler.mainMenuHandler();

		// 감독생성코드
//		boolean wasCreate = directorsService.createNewDirector("장항준", "장항준.png");
//
//		if(wasCreate) {
//			System.out.println("감독을 잘 생성했습니다.");
//		}
//		else {
//			System.out.println("감독 생성에 실패했습니다.");
//		}

//		List<DirectorsVO> directors = directorsService.findDirectorsWithMovies();
//		directors.forEach(director -> {
//			System.out.println("감독명: " + director.getName());
//
//			List<MoviesVO> movies = director.getMovies();
//			movies.forEach(movie -> {
//				System.out.println("영화명: " + movie.getTitle());
//			});
//		});

//		boolean movieIsCreate =
//		moviesService.createNewMovie(
//				"열한시"
//				, 15
//				, "2013"
//				, 98
//				, "스릴러"
//				, "추리"
//				, "한국"
//				, "투자 기업으로부터 이동을 감행한다."
//				, "열한시.png"
//				, List.of("DR-20240228-000001")); //변경 불가능한 리스트(자바 9부터 사용가능)
//
//		if(movieIsCreate) {
//			System.out.println("영화 등록 성공");
//		}else {
//			System.out.println("영화 등록 실패");
//		}

//		List<CastsVO> castList = new ArrayList<CastsVO>();
//		CastsVO castsVO = new CastsVO();
//		castsVO.setMovieId("MV-20240229000050");
//		castsVO.setCharacterName("우석");
//		castsVO.setMainActorYn("Y");
//		castList.add(castsVO);
//
//		boolean actorsIsCreate = actorsService.createNewActor("정재영.png", "정재영", castList);
//		if(actorsIsCreate) {
//			System.out.println("배우 등록 성공");
//		}else {
//			System.out.println("배우 등록 실패");
//		}

//		boolean userIsCreate = usersService.createNewUser("testuser", "테스트사용자", "", "");
//
//		if(userIsCreate) {
//			System.out.println("사용자 등록 성공");
//		}else {
//			System.out.println("사용자 등록 실패");
//		}

//		boolean ratingIsCreate = ratingService.createNewRating("MEMBER_5", 3.5, "좋아요", "MV-20240228-000003");
//		if (ratingIsCreate) {
//			System.out.println("평점 등록 성공");
//		} else {
//			System.out.println("평점 등록 실패");
//		}
//
	}
}
