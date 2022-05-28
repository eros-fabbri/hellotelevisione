package it.prova.hellotelevisione.service.televisore;

import java.util.List;

import it.prova.hellotelevisione.dao.televisore.TelevisoreDAO;
import it.prova.hellotelevisione.model.Televisore;

public interface TelevisoreService {

	public void setTelevisoreDAO(TelevisoreDAO televisoreDAO);

	public List<Televisore> cercaPerMarcaEModello(String nome, String cognome);

	public Televisore getSingoloTelevisore(Long id) throws Exception;

	public void inserisciTelevisore(Televisore televisore) throws Exception;

	public List<Televisore> listaTelevisori() throws Exception;

}
