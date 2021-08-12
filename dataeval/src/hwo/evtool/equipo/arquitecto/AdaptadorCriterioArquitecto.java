package hwo.evtool.equipo.arquitecto;

import java.util.HashMap;
import java.util.Map;


class AdaptadorCriterioArquitecto {
	Map<String, String> dataArquitecto = new HashMap<String, String>(); 
	String name; 
	
	public AdaptadorCriterioArquitecto() {
		this.name = "AdaptadorCriterioArquitecto";
	}

	public String leerEvaluacion() {
		return
			dataArquitecto.get("item") + ", " +
			dataArquitecto.get("formacion") + ", " +
			dataArquitecto.get("experiencia") + ", " +
			dataArquitecto.get("certificacion") + ", " +
			dataArquitecto.get("tipo");
	}

	public Map<String, String> escribirEvaluacion(String[] evaldata) {
		dataArquitecto.put("item", evaldata[0]);
		dataArquitecto.put("formacion", evaldata[2]);
		dataArquitecto.put("experiencia", evaldata[3]);
		dataArquitecto.put("certificacion", evaldata[4]);
		dataArquitecto.put("tipo", evaldata[evaldata.length - 1]);
		
		return dataArquitecto;
	}
}
