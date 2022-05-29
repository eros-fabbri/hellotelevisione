package it.prova.hellotelevisione.service.televisore;

import java.util.ArrayList;
import java.util.List;


import it.prova.hellotelevisione.dao.DB_Mock;
import it.prova.hellotelevisione.dao.MyDaoFactory;
import it.prova.hellotelevisione.dao.televisore.TelevisoreDAO;
import it.prova.hellotelevisione.model.Televisore;

public class TelevisoreServiceImpl implements TelevisoreService {

	private TelevisoreDAO televisoreDAO;

	public void setAbitanteDAO(TelevisoreDAO televisoreDAO) {
		this.televisoreDAO = televisoreDAO;
	}

	@Override
	public void setTelevisoreDAO(TelevisoreDAO televisoreDAO) {
	}

	@Override
	public List<Televisore> cercaPerMarcaEModello(String marca, String modello) {

		List<Televisore> result = new ArrayList<Televisore>();
		for (Televisore abitanteItem : DB_Mock.LISTA_TELEVISORI) {
			if (abitanteItem.getModello().startsWith(modello) && abitanteItem.getMarca().startsWith(marca))
				result.add(abitanteItem);
		}
		return result;
	}

	@Override
	public Televisore getSingoloTelevisore(Long id) throws Exception {

		return televisoreDAO.get(id);
	}

	@Override
	public void inserisciTelevisore(Televisore televisore) throws Exception {
		int result = televisoreDAO.insert(televisore);
	}

	@Override
	public List<Televisore> listaTelevisori() throws Exception {
		TelevisoreDAO televisoreDAOInstance = MyDaoFactory.getTelevisoreDAOInstance();
		return televisoreDAOInstance.list();
	}

}
