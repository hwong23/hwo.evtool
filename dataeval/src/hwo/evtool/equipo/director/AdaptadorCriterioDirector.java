package hwo.evtool.equipo.director;

import java.util.HashMap;
import java.util.Map;

class AdaptadorCriterioDirector {
	Map<String, String> dataDirector = new HashMap<String, String>();
	String name; 
	
	public AdaptadorCriterioDirector() {
		this.name = "AdaptadorCriterioDirector";
	}

	public String leerEvaluacion() {
		return
			dataDirector.get("i0") + ", " + 
			dataDirector.get("i1") + ", " +
			dataDirector.get("i2");
	}

	public Map<String, String> escribirEvaluacion(String[] dataeval) {
		return dataDirector;
	}
}
