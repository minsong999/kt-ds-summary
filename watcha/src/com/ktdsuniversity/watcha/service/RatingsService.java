package com.ktdsuniversity.watcha.service;

import com.ktdsuniversity.watcha.dao.RatingsDAO;
import com.ktdsuniversity.watcha.util.DBSupporter;
import com.ktdsuniversity.watcha.vo.RatingVO;

public class RatingsService {
	private RatingsDAO ratingDAO;

	public RatingsService() {
		this.ratingDAO = new RatingsDAO();
	}

	public boolean createNewRating(String userId, Double rating, String description, String movieId) {
		DBSupporter dbSupporter = new DBSupporter("WATCHA", "WATCHA");
		dbSupporter.open();

		RatingVO ratingVO = new RatingVO();
		ratingVO.setUserId(userId);
		ratingVO.setRating(rating);
		ratingVO.setDescription(description);
		ratingVO.setMovieId(movieId);
		int insertRatingCount = 0;

		try {
			insertRatingCount = ratingDAO.createNewRating(dbSupporter, ratingVO);
		} catch (RuntimeException re) {
			re.printStackTrace();
			dbSupporter.rollback();
			return false;
		}

		return insertRatingCount > 0;
	}
}
