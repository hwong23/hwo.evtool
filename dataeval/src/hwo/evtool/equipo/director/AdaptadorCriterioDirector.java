package hwo.evtool.equipo.director;

import java.util.HashMap;
import java.util.Map;

import hwo.evtool.dataeval.DataEvaluacion;

public class AdaptadorCriterioDirector implements DataEvaluacion {
	Map<String, String> dataDirector = new HashMap<String, String>();
	String name; 
	
	public AdaptadorCriterioDirector(String[] evaldata) {
		this.name = "AdaptadorCriterioDirector";
		escribirEvaluacion(evaldata);
	}

	@Override
	public String leerEvaluacion() {
		return
			dataDirector.get("i0") + ", " + 
			dataDirector.get("i1") + ", " +
			dataDirector.get("i2");
	}

	@Override
	public void escribirEvaluacion(String[] dataeval) {

	}
}
