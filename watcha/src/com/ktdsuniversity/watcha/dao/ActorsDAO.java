package com.ktdsuniversity.watcha.dao;

import com.ktdsuniversity.watcha.util.DBSupporter;
import com.ktdsuniversity.watcha.vo.ActorsVO;

public class ActorsDAO {
//배우 추가 , 캐스트 추가

	public String makeNextValue(DBSupporter dbSupporter) {
		StringBuffer query = new StringBuffer();
		query.append("SELECT 'AC-' || TO_CHAR(SYSDATE, 'YYYYMMDD') || LPAD(SEQ_MOVIES_PK.NEXTVAL, 6, '0') FROM DUAL");

		return dbSupporter.selectOne(query.toString(), null, String.class);
	}

	public int insertNewActor(DBSupporter dbSupporter, ActorsVO actorsVO) {
		StringBuffer query = new StringBuffer();
		query.append(" INSERT INTO");
		query.append(" WATCHA.ACTORS");
		query.append(" (ACTOR_ID");
		query.append(" , PROFILE");
		query.append(" , NAME)");
		query.append(" VALUES(");
		query.append(" ?");
		query.append(" , ?");
		query.append(" , ?");
		query.append(" )");

		return dbSupporter.insert(query.toString(),
				new Object[] { actorsVO.getActorId(), actorsVO.getProfile(), actorsVO.getName() });
	}
}
