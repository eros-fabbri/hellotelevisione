package it.prova.hellotelevisione.service.televisore;

import java.util.List;

import it.prova.hellotelevisione.dao.MyDaoFactory;
import it.prova.hellotelevisione.dao.televisore.TelevisoreDAO;
import it.prova.hellotelevisione.model.Televisore;

public class TelevisoreServiceImpl implements TelevisoreService {

	private TelevisoreDAO abitanteDAO;

	public void setTelevisoreDAO(TelevisoreDAO abitanteDAO) {
		this.abitanteDAO = abitanteDAO;
	}

	@Override
	public List<Televisore> cercaPerMarcaEModello(String nome, String cognome) {
		// abitanteDAO.setConnection(MyConnection.getConnection());
		return abitanteDAO.findByMarcaEModello(nome, cognome);
	}

	public Televisore getSingoloTelevisore(Long id) throws Exception {

		return abitanteDAO.get(id);

	}

	@Override
	public void inserisciTelevisore(Televisore abitante) throws Exception {
		TelevisoreDAO abitanteDAOInstance = MyDaoFactory.getTelevisoreDAOInstance();
		abitanteDAOInstance.insert(abitante);
	}

	@Override
	public List<Televisore> listaTelevisori() throws Exception {
		
		TelevisoreDAO abitanteDAOInstance = MyDaoFactory.getTelevisoreDAOInstance();
		return abitanteDAOInstance.list();
	}

}
