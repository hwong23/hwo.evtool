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
			dataDirector.get("item") + ", " +
			dataDirector.get("formacion") + ", " +
			dataDirector.get("experiencia") + ", " +
			dataDirector.get("certificacion") + ", " +
			dataDirector.get("tipo");
	}

	public Map<String, String> escribirEvaluacion(String[] evaldata) {
		dataDirector.put("item", evaldata[0]);
		dataDirector.put("formacion", evaldata[2]);
		dataDirector.put("experiencia", evaldata[3]);
		dataDirector.put("certificacion", evaldata[4]);
		dataDirector.put("tipo", evaldata[evaldata.length - 1]);
		
		return dataDirector;
	}
}
