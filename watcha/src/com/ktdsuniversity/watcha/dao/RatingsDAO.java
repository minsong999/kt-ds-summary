package com.ktdsuniversity.watcha.dao;

import com.ktdsuniversity.watcha.util.DBSupporter;
import com.ktdsuniversity.watcha.vo.RatingVO;

public class RatingsDAO {
	public int createNewRating(DBSupporter dbSupporter, RatingVO ratingVO) {

		StringBuffer query = new StringBuffer();

		query.append("INSERT INTO WATCHA.RATINGS");
		query.append(" (RATING_ID, USER_ID, RATING, DESCRIPTION, MOVIE_ID)");
		query.append(
				" VALUES('CT-' || TO_CHAR(SYSDATE, 'YYYYMMDD') || LPAD(SEQ_RATINGS_PK.NEXTVAL, 6, '0'), ?, ?, ?, ?)");

		return dbSupporter.insert(query.toString(), new Object[] { ratingVO.getUserId(), ratingVO.getRating(),
				ratingVO.getDescription(), ratingVO.getMovieId() });
	}

	public int deleteRatingsByMovieId(DBSupporter dbSupporter, String movieId) {
		StringBuffer query = new StringBuffer();

		query.append("DELETE FROM WATCHA.RATINGS ");
		query.append("WHERE MOVIE_ID= ?");

		return dbSupporter.delete(query.toString(), new Object[] { movieId });
	}
}
