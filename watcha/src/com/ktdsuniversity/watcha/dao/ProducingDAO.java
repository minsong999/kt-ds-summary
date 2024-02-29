package com.ktdsuniversity.watcha.dao;

import com.ktdsuniversity.watcha.util.DBSupporter;

public class ProducingDAO {

	/**
	 * 감독의 PK 영화의 PK
	 *
	 * @param dbSupporter
	 * @return
	 */
	public int insertNewProducing(DBSupporter dbSupporter, String directorId, String movieId) {

		StringBuffer query = new StringBuffer();
		query.append("INSERT INTO WATCHA.PRODUCINGS ");
		query.append("(PRODUCING_ID  ");
		query.append(", DIRECTOR_ID  ");
		query.append(", MOVIE_ID)    ");
		query.append("VALUES(");
		query.append("'PR-' || TO_CHAR(SYSDATE, 'YYYYMMDD') || '-' || LPAD(SEQ_MOVIES_PK.NEXTVAL, 6, '0') ");
		query.append(", ?                                                                                  ");
		query.append(", ?)");

		return dbSupporter.insert(query.toString(), new Object[] { directorId, movieId });
	}
}
