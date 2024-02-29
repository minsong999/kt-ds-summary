package com.ktdsuniversity.gogang.service;

import com.ktdsuniversity.gogang.dao.UsersDAO;
import com.ktdsuniversity.gogang.util.DBSupporter;
import com.ktdsuniversity.gogang.vo.UsersVO;

public class UsersService {
	private UsersDAO usersDAO;

	public UsersService() {
		usersDAO = new UsersDAO();
	}

	public boolean createNewActor(String nickName, String email, String emailAuth, String pwd, String regdate) {
		DBSupporter dbSupporter = new DBSupporter("gogang", "gogang");
		dbSupporter.open();
		UsersVO userVO = new UsersVO();
		userVO.setNickname(nickName);
		userVO.setEmail(email);
		userVO.setEamilAuth(emailAuth);
		userVO.setPwd(pwd);
		userVO.setRegDate(regdate);

		int insertUsersCount = 0;
		try {
			insertUsersCount = usersDAO.insertUsers(dbSupporter, userVO);
		} catch (RuntimeException re) {
			re.printStackTrace();
			dbSupporter.rollback();
			return false;
		}

		dbSupporter.close();
		return insertUsersCount > 0;
	}
}
