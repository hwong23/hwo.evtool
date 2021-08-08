package hwo.evtool.equipo.educacion;

import java.util.HashMap;
import java.util.Map;

public class AdaptadorCriterioEducacion {
	Map<String, String> dataEvaluacion = new HashMap<String, String>();
	String name; 
	
	public AdaptadorCriterioEducacion() {
		this.name = "AdaptadorCriterioEducacion";
	}

	public String leerEvaluacion() {
		return 
			dataEvaluacion.get("i0") + ", " + 
			dataEvaluacion.get("i1") + ", " +
			dataEvaluacion.get("i2");
	}

	public Map<String, String> escribirEvaluacion(String[] dataeval) {
		return dataEvaluacion;
	}
}
