package it.prova.hellotelevisione.dao;

import java.sql.Connection;
import java.util.List;

import it.prova.hellotelevisione.model.Televisore;

public interface IBaseDAO<T> {
	
	public List<Televisore> list() throws Exception;

	public T get(Long id) throws Exception;

	public int update(T input) throws Exception;

	public int insert(T input) throws Exception;

	public int delete(T input) throws Exception;

	// questo mi serve per la injection della connection
	public void setConnection(Connection connection);

}
