package it.prova.hellotelevisione.dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import it.prova.hellotelevisione.model.Televisore;


public class DB_Mock {
	public static final List<Televisore> LISTA_TELEVISORI = new ArrayList<>();

	static {

		LISTA_TELEVISORI.add(new Televisore(1L,"samsung", "ssungtv", 460, 40, "A0000"));
		LISTA_TELEVISORI.add(new Televisore(2L,"elleggi", "lgtv", 420, 45, "A0001"));
		LISTA_TELEVISORI.add(new Televisore(3L,"miia", "tvmia", 75, 20, "A001"));
		LISTA_TELEVISORI.add(new Televisore(4L,"samsung", "ssungtv", 460, 40, "A0000"));

	}

	public static Long getNexIdAvailable() {
		Long resultId = null;
		if (LISTA_TELEVISORI == null || LISTA_TELEVISORI.isEmpty()) {
			resultId = 1L;
		}
		resultId=LISTA_TELEVISORI.stream().max(Comparator.comparing(Televisore::getIdTelevisore)).get().getIdTelevisore();
		return ++resultId;
	}

}
