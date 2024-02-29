package com.ktdsuniversity.watcha.dao;

import com.ktdsuniversity.watcha.util.DBSupporter;
import com.ktdsuniversity.watcha.vo.DirectorsVO;

import java.util.List;


public class DirectorDAO {

	/**
	 * DIRECTORS 테이블에 새로운 감독 정보를 INSERT 하는 역할
	 *
	 * @return DIRECTORS 테이블에 INSERT를 한 갯수
	 */

	public int insertNewDirector(DBSupporter dbSupporter, DirectorsVO newDirectorsVO) {

		StringBuffer query = new StringBuffer();

		query.append("INSERT INTO WATCHA.DIRECTORS");
		query.append(" (DIRECTOR_ID, NAME, PROFLE)");
		query.append(
				" VALUES('DR-' || TO_CHAR(SYSDATE ,'YYYYMMDD') || '-' || LPAD(SEQ_DIRECTORS_PK.NEXTVAL, 6, '0'), ?, ?)");

		return dbSupporter.insert(query.toString()
				, new Object[] { newDirectorsVO.getName(),
						 newDirectorsVO.getProfle() });
	}

	public List<DirectorsVO> selectAllDirectors(DBSupporter dbSupporter){
	StringBuffer query = new StringBuffer();

	query.append(" SELECT * ");
	query.append("FROM DIRECTORS");

	return dbSupporter.selectList(query.toString(), null, DirectorsVO.class);
	}

}
