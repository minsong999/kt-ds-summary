package com.ktdsuniversity.watcha.service;

import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.watcha.dao.CastsDAO;
import com.ktdsuniversity.watcha.dao.MoviesDAO;
import com.ktdsuniversity.watcha.dao.ProducingDAO;
import com.ktdsuniversity.watcha.dao.RatingsDAO;
import com.ktdsuniversity.watcha.util.DBSupporter;
import com.ktdsuniversity.watcha.vo.MoviesVO;

/**
 * DB의 트렌젝션을 관리.
 */
public class MoviesService {

	private MoviesDAO moviesDAO;
	private ProducingDAO producingDAO;
	private RatingsDAO ratingsDAO;
	private CastsDAO castsDAO;

	public MoviesService() {
		this.moviesDAO = new MoviesDAO();
		this.producingDAO = new ProducingDAO();
		this.ratingsDAO = new RatingsDAO();
		this.castsDAO = new CastsDAO();
	}

	public boolean createNewMovie(String title, int minimumAge, String openYear, int runningTime, String genre,
			String athmosphere, String location, String summary, String poster, List<String> directorsId) {
		DBSupporter dbSupporter = new DBSupporter("WATCHA", "WATCHA");
		dbSupporter.open();

		// 영화의 새로운 pk값을 받아온다.
		String newMoviePk = moviesDAO.makeNextValue(dbSupporter);

		MoviesVO moviesVO = new MoviesVO();
		moviesVO.setMovieId(newMoviePk);
		moviesVO.setTitle(title);
		moviesVO.setMinimumAge(minimumAge);
		moviesVO.setOpenYear(openYear);
		moviesVO.setRunningTime(runningTime);
		moviesVO.setGenre(genre);
		moviesVO.setAtmosphere(athmosphere);
		moviesVO.setLocation(location);
		moviesVO.setSummary(summary);
		moviesVO.setPoster(poster);

		int insertMovieCount = 0;
		try {
			insertMovieCount = this.moviesDAO.insertNewMovies(dbSupporter, moviesVO);
		} catch (RuntimeException re) {
			re.printStackTrace();
			dbSupporter.rollback();
		}

		int insertDirectorsCount = 0;

		// 영화등록에 성공했다면
		if (insertMovieCount > 0) {
			// 제작 정보를 insert 한다.
			// 영화 1----n 감독
//			for(int i =0; i<directorsId.size(); i++) {
//				insertDirectorsCount += this.producingDAO.insertNewProducing(dbSupporter, directorsId.get(i), newMoviePk);
//			}

			if (directorsId != null) {
				for (String directorId : directorsId) {
					try {
						insertDirectorsCount += this.producingDAO.insertNewProducing(dbSupporter, directorId,
								newMoviePk);
					} catch (RuntimeException re) {
						re.printStackTrace();
						dbSupporter.rollback();
						dbSupporter.close();
						return false;
					}
				}
			}

//			directorsId.forEach((directorId) -> {
//				insertDirectorsCount += this.producingDAO.insertNewProducing(dbSupporter, directorId, newMoviePk);
//			});
		}
		// 영화등록에 실패했다면
		else {

		}

		dbSupporter.close();
		return insertMovieCount > 0 || insertDirectorsCount >0;
	}

	public List<MoviesVO> findAllMovies() {
		DBSupporter dbSupporter = new DBSupporter("WATCHA", "WATCHA");
		dbSupporter.open();
		List<MoviesVO> movies = new ArrayList<>();
		try {

			movies = this.moviesDAO.selectAllMovies(dbSupporter);
		} catch (RuntimeException re) {
			re.printStackTrace();
			dbSupporter.close();
			return new ArrayList<>();
		}
		dbSupporter.close();
		return movies;
	}

	public List<MoviesVO> findMoviesByTitle(String movieTitle) {
		DBSupporter dbSupporter = new DBSupporter("WATCHA", "WATCHA");
		dbSupporter.open();
		List<MoviesVO> movies = new ArrayList<>();
		try {
			movies = this.moviesDAO.selectMoviesByTitle(dbSupporter, movieTitle);
		} catch (RuntimeException re) {
			re.printStackTrace();
			dbSupporter.close();
			return null;
		}
		dbSupporter.close();
		return movies;
	}

	public MoviesVO findMovieById(String movieId) {
		DBSupporter dbSupporter = new DBSupporter("WATCHA", "WATCHA");
		dbSupporter.open();
		MoviesVO movies = new MoviesVO();
		try {
			movies = this.moviesDAO.selectMoviesById(dbSupporter, movieId);
		} catch (RuntimeException re) {
			re.printStackTrace();
			dbSupporter.close();
			return null;
		}
		dbSupporter.close();
		return movies;
	}

	public boolean modifyOneMovie(MoviesVO moviesVO) {
		DBSupporter dbSupporter = new DBSupporter("WATCHA", "WATCHA");
		dbSupporter.open();

		int updatedCount = 0;
		try {
			updatedCount = this.moviesDAO.updateOneMovie(dbSupporter, moviesVO);
		} catch (RuntimeException re) {
			re.printStackTrace();
			dbSupporter.rollback();
			return false;
		}
		dbSupporter.close();
		return updatedCount > 0;
	}

	public boolean deleteOneMovieById(String movieId) {
		DBSupporter dbSupporter = new DBSupporter("WATCHA", "WATCHA");
		dbSupporter.open();

		int deletedRatingsCount = 0;
		try {
			deletedRatingsCount = this.ratingsDAO.deleteRatingsByMovieId(dbSupporter, movieId);
			System.out.println(deletedRatingsCount + "건의 평점을 삭제했습니다.");
		} catch (RuntimeException re) {
			re.printStackTrace();
			dbSupporter.rollback();
			return false;
		}

		int deletedCastsCount = 0;
		try {
			deletedCastsCount = this.castsDAO.deleteCastsByMovieId(dbSupporter, movieId);
			System.out.println(deletedRatingsCount + "건의 출연배우를 삭제했습니다.");
		} catch (RuntimeException re) {
			re.printStackTrace();
			dbSupporter.rollback();
			return false;
		}

		int deletedProducingCount = 0;
		try {
			deletedProducingCount = this.producingDAO.deleteProducingByMovieId(dbSupporter, movieId);
			System.out.println(deletedRatingsCount + "건의 제작자를 삭제했습니다.");
		} catch (RuntimeException re) {
			re.printStackTrace();
			dbSupporter.rollback();
			return false;
		}

		int deletedCount = 0;
		try {
			deletedCount = this.moviesDAO.deleteOneMovie(dbSupporter, movieId);
		} catch (RuntimeException re) {
			re.printStackTrace();
			dbSupporter.rollback();
			return false;
		}
		dbSupporter.close();
		return deletedCount > 0;
	}

}
