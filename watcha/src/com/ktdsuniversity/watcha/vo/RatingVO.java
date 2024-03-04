package com.ktdsuniversity.watcha.vo;

public class RatingVO {
	String ratingId;
	String userId;
	Double rating;
	String description;
	String movieId;

	// 하나의 평점에는 하나의 사용자가 작성한다.
	/**
	 * 평점을 남긴 사용자
	 */
	private UsersVO usersVO;

	// 한 평점은 하나의 영화에 작성한다.
	/**
	 * 평점을 남긴 영화
	 */
	private MoviesVO movies;

	public String getRatingId() {
		return ratingId;
	}

	public void setRatingId(String ratingId) {
		this.ratingId = ratingId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public UsersVO getUsersVO() {
		return usersVO;
	}

	public void setUsersVO(UsersVO usersVO) {
		this.usersVO = usersVO;
	}

	public MoviesVO getMoviesVO() {
		return movies;
	}

	public void setMoviesVO(MoviesVO movies) {
		this.movies = movies;
	}

}
