package it.prova.hellotelevisione.dao;

import it.prova.hellotelevisione.dao.televisore.TelevisoreDAO;
import it.prova.hellotelevisione.dao.televisore.TelevisoreDAOImpl;

public class MyDaoFactory {

	private static TelevisoreDAO TELEVISORE_DAO_INSTANCE = null;

	public static TelevisoreDAO getAbitanteDAOInstance() {
		if (TELEVISORE_DAO_INSTANCE == null)
			TELEVISORE_DAO_INSTANCE = new TelevisoreDAOImpl();

		return TELEVISORE_DAO_INSTANCE;
	}

}
