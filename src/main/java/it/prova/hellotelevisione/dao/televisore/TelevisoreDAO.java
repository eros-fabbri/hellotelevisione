package it.prova.hellotelevisione.dao.televisore;

import java.sql.Connection;
import java.util.List;

import it.prova.hellotelevisione.dao.IBaseDAO;
import it.prova.hellotelevisione.model.Televisore;

public interface TelevisoreDAO extends IBaseDAO<Televisore> {

	public void setConnection(Connection connection);

	public List<Televisore> findByMarcaEModello(String marca, String modello);

}
