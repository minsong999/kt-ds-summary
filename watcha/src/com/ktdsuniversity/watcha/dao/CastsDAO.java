package com.ktdsuniversity.watcha.dao;

import com.ktdsuniversity.watcha.util.DBSupporter;
import com.ktdsuniversity.watcha.vo.CastsVO;

public class CastsDAO {

	public int insertNewCasts(DBSupporter dbSupporter, CastsVO castsVO) {
		StringBuffer query = new StringBuffer();

		query.append("INSERT INTO WATCHA.CASTS");
		query.append(" (CAST_ID");
		query.append(" , ACTOR_ID");
		query.append(" , MOVIE_ID");
		query.append(" , CHARACTER_NAME");
		query.append(" , MAIN_ACTOR_YN)");
		query.append(" VALUES(");
		query.append(" 'CT-' || TO_CHAR(SYSDATE, 'YYYYMMDD') || LPAD(SEQ_CASTS_PK.NEXTVAL, 6, '0')");
		query.append(" , ?");
		query.append(" , ?");
		query.append(" , ?");
		query.append(" , ? )");

		return dbSupporter.insert(query.toString(), new Object[] { castsVO.getActorId(), castsVO.getMovieId(),
				castsVO.getCharacterName(), castsVO.getMainActorYn() });
	}
}
