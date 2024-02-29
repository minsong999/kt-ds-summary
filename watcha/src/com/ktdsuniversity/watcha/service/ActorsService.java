package com.ktdsuniversity.watcha.service;

import com.ktdsuniversity.watcha.dao.ActorsDAO;
import com.ktdsuniversity.watcha.dao.CastsDAO;
import com.ktdsuniversity.watcha.util.DBSupporter;
import com.ktdsuniversity.watcha.vo.ActorsVO;
import com.ktdsuniversity.watcha.vo.CastsVO;

import java.util.List;

public class ActorsService {
	private ActorsDAO actorsDAO;
	private CastsDAO castsDAO;

	public ActorsService() {
		this.actorsDAO = new ActorsDAO();
		this.castsDAO = new CastsDAO();
	}

	public boolean createNewActor(String profile, String name, List<CastsVO> casts) {
		DBSupporter dbSupporter = new DBSupporter("WATCHA", "WATCHA");
		dbSupporter.open();

		String newActorPk = this.actorsDAO.makeNextValue(dbSupporter);

		ActorsVO actorsVO = new ActorsVO();
		actorsVO.setActorId(newActorPk);
		actorsVO.setName(name);
		actorsVO.setProfile(profile);

		int insertActorsCount = 0;
		int insertCastsCount = 0;

		try {
			insertActorsCount = this.actorsDAO.insertNewActor(dbSupporter, actorsVO);
		} catch (RuntimeException re) {
			re.printStackTrace();
			dbSupporter.rollback();
			return false;
		}

		if (insertActorsCount > 0) {
			for (CastsVO castsVO : casts) {
				castsVO.setActorId(newActorPk);
				try {
					insertCastsCount += this.castsDAO.insertNewCasts(dbSupporter, castsVO);
				} catch (RuntimeException re) {
					re.printStackTrace();
					dbSupporter.rollback();
					return false;
				}
			}
		}

		dbSupporter.close();
		return insertCastsCount > 0;
	}
}
