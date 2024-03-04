package com.ktdsuniversity.watcha.service;

import com.ktdsuniversity.watcha.dao.UserDAO;
import com.ktdsuniversity.watcha.util.DBSupporter;
import com.ktdsuniversity.watcha.vo.UsersVO;

public class UsersService {
	private UserDAO userDAO;

	public UsersService() {
		this.userDAO = new UserDAO();
	}

	public boolean createNewUser(String userId, String name, String background, String profile) {
		DBSupporter dbSupporter = new DBSupporter("WATCHA", "WATCHA");
		dbSupporter.open();

		UsersVO usersVO = new UsersVO();
		usersVO.setName(name);
		usersVO.setProfile(profile);
		usersVO.setUserId(userId);
		usersVO.setBackground(background);

		int insertedCount = 0;
		try {
			insertedCount = this.userDAO.insertNewUser(dbSupporter, usersVO);
		} catch (RuntimeException re) {
			re.printStackTrace();
			dbSupporter.close();
			return false;
		}

		dbSupporter.close();

		return insertedCount > 0;

	}

}
