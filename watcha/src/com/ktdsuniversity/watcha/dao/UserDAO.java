package com.ktdsuniversity.watcha.dao;

import com.ktdsuniversity.watcha.util.DBSupporter;
import com.ktdsuniversity.watcha.vo.UsersVO;

public class UserDAO {
	public int insertNewUser(DBSupporter dbSupporter, UsersVO usersVO) {
		StringBuffer query = new StringBuffer();

		query.append("INSERT INTO USERS ");
		query.append(" (USER_ID, NAME, BACKGROUND, PROFLE)");
		query.append(" VALUES");
		query.append(" (");
		query.append(" ?");
		query.append(" ,?");
		query.append(" ,?");
		query.append(" ,?");
		query.append(")");
		return dbSupporter.insert(query.toString(),
				new Object[] { usersVO.getUserId(), usersVO.getName(), usersVO.getBackground(), usersVO.getProfile() });
	}
}
