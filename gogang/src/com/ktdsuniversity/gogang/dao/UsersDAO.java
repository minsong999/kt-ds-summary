package com.ktdsuniversity.gogang.dao;

import com.ktdsuniversity.gogang.util.DBSupporter;
import com.ktdsuniversity.gogang.vo.UsersVO;

public class UsersDAO {

	public int insertUsers(DBSupporter dbSupporter, UsersVO userVO) {
		StringBuffer query = new StringBuffer();

		query.append("INSERT INTO GOGANG.USERS");
		query.append(" (USER_ID");
		query.append(" , NICKNAME");
		query.append(" , EMAIL");
		query.append(" , EAMIL_AUTH");
		query.append(" , PWD");
		query.append(" , REG_DATE)");
		query.append(" VALUES(");
		query.append(" 'USER-' || TO_CHAR(SYSDATE, 'YYYYMMDD') || '-' || LPAD(SEQ_USERS_PK.NEXTVAL, 6, '0')");
		query.append(" , ?");
		query.append(" , ?");
		query.append(" , ?");
		query.append(" , ?");
		query.append(" , ?)");

		System.out.println(query);
		return dbSupporter.insert(query.toString(), new Object[] {
				userVO.getNickname()
				, userVO.getEmail()
				, userVO.getEamilAuth()
				, userVO.getPwd()
				, userVO.getRegDate() });

	}
}
