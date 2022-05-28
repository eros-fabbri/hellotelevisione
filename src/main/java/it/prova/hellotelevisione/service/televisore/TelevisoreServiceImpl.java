package it.prova.hellotelevisione.service.televisore;

import java.util.List;

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

		return televisoreDAO.findByMarcaEModello(marca, modello);
	}

	@Override
	public Televisore getSingoloTelevisore(Long id) throws Exception {

		return televisoreDAO.get(id);
	}

	@Override
	public void inserisciTelevisore(Televisore televisore) throws Exception {
		televisoreDAO.insert(televisore);
	}

	@Override
	public List<Televisore> listaTelevisori() throws Exception {
		return televisoreDAO.list();
	}

}
