package it.prova.hellotelevisione.dao.televisore;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import it.prova.hellotelevisione.dao.DB_Mock;
import it.prova.hellotelevisione.model.Televisore;

public class TelevisoreDAOImpl implements TelevisoreDAO {

	@Override
	public List<Televisore> list() throws Exception {

		return DB_Mock.LISTA_TELEVISORI;
	}

	@Override
	public Televisore get(Long id) throws Exception {

		return (Televisore) DB_Mock.LISTA_TELEVISORI.stream().filter(obj -> obj.getIdTelevisore() == id);
//		 for (Abitante abitanteItem : DB_Mock.LISTA_ABITANTI) {
//		        if (abitanteItem.getIdAbitante() == id) {
//		            return abitanteItem;
//		        }
//		    }
//		    return null;
	}

	@Override
	public int update(Televisore input) throws Exception {

		for (Televisore televisoreItem : DB_Mock.LISTA_TELEVISORI) {
			if (televisoreItem.getIdTelevisore() == input.getIdTelevisore()) {
				televisoreItem.setMarca(input.getMarca());
				televisoreItem.setModello(input.getModello());
				televisoreItem.setCodice(input.getCodice());
				televisoreItem.setNumeroPollici(input.getNumeroPollici());
				televisoreItem.setPrezzo(input.getPrezzo());
				return 0;
			}
		}
		return 1;
	}

	@Override
	public int insert(Televisore input) throws Exception {

		input.setIdTelevisore(DB_Mock.getNexIdAvailable());
		return DB_Mock.LISTA_TELEVISORI.add(input) ? 1 : 0;

	}

	@Override
	public int delete(Televisore input) throws Exception {

		return DB_Mock.LISTA_TELEVISORI.removeIf(tv -> tv.getIdTelevisore() == input.getIdTelevisore()) ? 1 : 0;
	}

	@Override
	public void setConnection(Connection connection) {
	}

	@Override
	public List<Televisore> findByMarcaEModello(String marca, String modello) {

		List<Televisore> result = new ArrayList<>();

		for (Televisore abitanteItem : DB_Mock.LISTA_TELEVISORI) {
			if (abitanteItem.getMarca().startsWith(marca) && abitanteItem.getModello().startsWith(modello))
				result.add(abitanteItem);
		}
		return result;
	}

}
