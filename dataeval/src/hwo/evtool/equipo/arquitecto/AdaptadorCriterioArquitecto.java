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
			dataArquitecto.get("i0") + ", " + 
			dataArquitecto.get("i1") + ", " +
			dataArquitecto.get("i2");
	}

	public Map<String, String> escribirEvaluacion(String[] dataeval) {
		dataArquitecto.put("i0", dataeval[0]);
		dataArquitecto.put("i1", dataeval[1]);
		dataArquitecto.put("i2", dataeval[2]);
		
		return dataArquitecto;
	}
}
