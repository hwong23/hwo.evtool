package hwo.evtool.equipo.educacion;

import java.util.HashMap;
import java.util.Map;

class AdaptadorCriterioEducacion {
	Map<String, String> dataEducacion = new HashMap<String, String>();
	String name; 
	
	public AdaptadorCriterioEducacion() {
		this.name = "AdaptadorCriterioEducacion";
	}

	public String leerEvaluacion() {
		return
			dataEducacion.get("item") + ", " +
			dataEducacion.get("formacion") + ", " +
			dataEducacion.get("experiencia") + ", " +
			dataEducacion.get("certificacion") + ", " +
			dataEducacion.get("tipo");
	}

	public Map<String, String> escribirEvaluacion(String[] evaldata) {
		dataEducacion.put("item", evaldata[0]);
		dataEducacion.put("formacion", evaldata[2]);
		dataEducacion.put("experiencia", evaldata[3]);
		dataEducacion.put("certificacion", evaldata[4]);
		dataEducacion.put("tipo", evaldata[evaldata.length - 1]);
		
		return dataEducacion;
	}
}
