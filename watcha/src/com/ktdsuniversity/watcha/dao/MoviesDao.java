package com.ktdsuniversity.watcha.dao;

import java.util.ArrayList;
import java.util.List;

import javax.management.Query;

import com.ktdsuniversity.watcha.util.DBSupporter;
import com.ktdsuniversity.watcha.vo.MoviesVO;

public class MoviesDAO {

	/**
	 * 다음 pk값을 만들어준다
	 */
	public String makeNextValue(DBSupporter dbSupporter) {
		StringBuffer query = new StringBuffer();
		query.append("SELECT 'MV-' || TO_CHAR(SYSDATE, 'YYYYMMDD') || LPAD(SEQ_MOVIES_PK.NEXTVAL, 6, '0') FROM DUAL");

		return dbSupporter.selectOne(query.toString(), null, String.class);
	}

	public List<MoviesVO> selectMoviesByDirectorId(DBSupporter dbSupporter, String directorId) {

		StringBuffer query = new StringBuffer();
		query.append(" SELECT * ");
		query.append("   FROM MOVIES ");
		query.append("  WHERE MOVIE_ID IN (SELECT MOVIE_ID ");
		query.append("                       FROM PRODUCINGS ");
		query.append("                      WHERE DIRECTOR_ID = ?) ");

		return dbSupporter.selectList(query.toString(), new Object[] { directorId }, MoviesVO.class);
	}

	public int insertNewMovies(DBSupporter dbSupporter, MoviesVO moviesVO) {

		StringBuffer query = new StringBuffer();
		query.append("INSERT INTO WATCHA.MOVIES");
		query.append(" (MOVIE_ID");
		query.append(" , TITLE");
		query.append(" , MINIMUM_AGE");
		query.append(" , OPEN_YEAR");
		query.append(" , RUNNING_TIME");
		query.append(" , GENRE");
		query.append(" , ATMOSPHERE");
		query.append(" , LOCATION");
		query.append(" , SUMMARY");
		query.append(" , POSTER)");
		query.append(" VALUES(");
		query.append(" ?");
		query.append(" , ?");
		query.append(" , ?");
		query.append(" , ?");
		query.append(" , ?");
		query.append(" , ?");
		query.append(" , ?");
		query.append(" , ?");
		query.append(" , ?");
		query.append(" , ?");
		query.append(" ) ");

		System.out.println(query);
		return dbSupporter.insert(query.toString(), new Object[] { moviesVO.getMovieId(), moviesVO.getTitle(),
				moviesVO.getMinimumAge(), moviesVO.getOpenYear(), moviesVO.getRunningTime(), moviesVO.getGenre(),
				moviesVO.getAtmosphere(), moviesVO.getLocation(), moviesVO.getSummary(), moviesVO.getPoster() });
	}

	public List<MoviesVO> selectAllMovies(DBSupporter dbSupporter) {
		StringBuffer query = new StringBuffer();

		query.append(
				"SELECT MOVIE_ID, TITLE, MINIMUM_AGE, OPEN_YEAR, RUNNING_TIME, GENRE, ATMOSPHERE, LOCATION, SUMMARY, POSTER FROM WATCHA.MOVIES ORDER BY MOVIE_ID DESC");

		return dbSupporter.selectList(query.toString(), null, MoviesVO.class);
	}

	public List<MoviesVO> selectMoviesByTitle(DBSupporter dbSupporter, String movieTitle) {
		StringBuffer query = new StringBuffer();

		query.append(
				"SELECT MOVIE_ID, TITLE, MINIMUM_AGE, OPEN_YEAR, RUNNING_TIME, GENRE, ATMOSPHERE, LOCATION, SUMMARY, POSTER FROM WATCHA.MOVIES WHERE TITLE LIKE '%' || ? || '%' ORDER BY MOVIE_ID DESC");
		return dbSupporter.selectList(query.toString(), new Object[] { movieTitle }, MoviesVO.class);
	}

	public MoviesVO selectMoviesById(DBSupporter dbSupporter, String movieId) {
		StringBuffer query = new StringBuffer();

		query.append(
				"SELECT MOVIE_ID, TITLE, MINIMUM_AGE, OPEN_YEAR, RUNNING_TIME, GENRE, ATMOSPHERE, LOCATION, SUMMARY, POSTER FROM WATCHA.MOVIES WHERE MOVIE_ID = ? ORDER BY MOVIE_ID DESC");

		return dbSupporter.selectOne(query.toString(), new Object[] { movieId }, MoviesVO.class);
	}

	public int updateOneMovie(DBSupporter dbSupporter, MoviesVO moviesVO) {
		StringBuffer query = new StringBuffer();

		query.append("UPDATE WATCHA.MOVIES");
		query.append("SET TITLE=?");
		query.append(", MINIMUM_AGE=?");
		query.append(", OPEN_YEAR=?");
		query.append(", RUNNING_TIME=?");
		query.append(", GENRE=?");
		query.append(", ATMOSPHERE=?");
		query.append(", LOCATION=?");
		query.append(", SUMMARY=?");
		query.append(", POSTER=?");
		query.append("WHERE MOVIE_ID= ?");

		return dbSupporter.update(query.toString(),
				new Object[] { moviesVO.getTitle(), moviesVO.getMinimumAge(), moviesVO.getOpenYear(),
						moviesVO.getRunningTime(), moviesVO.getGenre(), moviesVO.getAtmosphere(),
						moviesVO.getLocation(), moviesVO.getSummary(), moviesVO.getPoster(), moviesVO.getMovieId() });
	}

	public int deleteOneMovie(DBSupporter dbSupporter, String movieId) {
		StringBuffer query = new StringBuffer();

		query.append("delete from WATCHA.MOVIES ");
		query.append("WHERE MOVIE_ID= ?");
		return dbSupporter.delete(query.toString(), new Object[] { movieId });
	}
}
