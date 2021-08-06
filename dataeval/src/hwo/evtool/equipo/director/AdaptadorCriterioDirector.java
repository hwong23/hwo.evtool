package hwo.evtool.equipo.director;

import java.util.HashMap;
import java.util.Map;

import hwo.evtool.dataeval.DataEvaluacion;

public class AdaptadorCriterioDirector implements DataEvaluacion {
	Map<String, String> dataDirector = new HashMap<String, String>();
	String name; 
	
	public AdaptadorCriterioDirector() {
		this.name = "AdaptadorCriterioDirector";
	}

	@Override
	public String leerEvaluacion() {
		return
			dataDirector.get("i0") + ", " + 
			dataDirector.get("i1") + ", " +
			dataDirector.get("i2");
	}

	@Override
	public DataEvaluacion escribirEvaluacion(String[] dataeval) {
		return this; 
	}
}
