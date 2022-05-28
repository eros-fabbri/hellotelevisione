package it.prova.hellotelevisione.service;

import it.prova.hellotelevisione.dao.MyDaoFactory;
import it.prova.hellotelevisione.service.televisore.TelevisoreService;
import it.prova.hellotelevisione.service.televisore.TelevisoreServiceImpl;

public class MyServiceFactory {
	private static TelevisoreService TELEVISORE_SERVICE_INSTANCE;

	public static TelevisoreService getAbitanteServiceInstance() {
		if (TELEVISORE_SERVICE_INSTANCE == null)
			TELEVISORE_SERVICE_INSTANCE = new TelevisoreServiceImpl();

		TELEVISORE_SERVICE_INSTANCE.setTelevisoreDAO(MyDaoFactory.getAbitanteDAOInstance());

		return TELEVISORE_SERVICE_INSTANCE;
	}
}
