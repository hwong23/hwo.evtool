package hwo.evtool.equipo.educacion;

import java.util.HashMap;
import java.util.Map;

import hwo.evtool.dataeval.DataEvaluacion;

public class AdaptadorCriterioEducacion implements DataEvaluacion {
	Map<String, String> dataEvaluacion = new HashMap<String, String>();
	String name; 
	
	public AdaptadorCriterioEducacion() {
		this.name = "AdaptadorCriterioEducacion";
	}

	@Override
	public String leerEvaluacion() {
		return 
			dataEvaluacion.get("i0") + ", " + 
			dataEvaluacion.get("i1") + ", " +
			dataEvaluacion.get("i2");
	}

	@Override
	public DataEvaluacion escribirEvaluacion(String[] dataeval) {
		return this; 
	}
}
