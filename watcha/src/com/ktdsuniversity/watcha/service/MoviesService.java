package com.ktdsuniversity.watcha.service;

import java.util.List;

import com.ktdsuniversity.watcha.dao.MoviesDAO;
import com.ktdsuniversity.watcha.dao.ProducingDAO;
import com.ktdsuniversity.watcha.util.DBSupporter;
import com.ktdsuniversity.watcha.vo.MoviesVO;

/**
 * DB의 트렌젝션을 관리.
 */
public class MoviesService {

	private MoviesDAO moviesDAO;
	private ProducingDAO producingDAO;

	public MoviesService() {
		this.moviesDAO = new MoviesDAO();
		this.producingDAO = new ProducingDAO();
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

			for(String directorId : directorsId) {
				try {
				insertDirectorsCount += this.producingDAO.insertNewProducing(dbSupporter, directorId, newMoviePk);
				}catch (RuntimeException re) {
						re.printStackTrace();
						dbSupporter.rollback();
						dbSupporter.close();
						return false;
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
		return insertDirectorsCount > 0;
	}

}
