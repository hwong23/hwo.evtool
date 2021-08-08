package hwo.evtool.propuesta.problema;

import java.util.HashMap;
import java.util.Map;

import hwo.evtool.dataeval.DataEvaluacion;

public class AdaptadorCriterioProblema implements DataEvaluacion {
	Map<String, String> dataProblema = new HashMap<String, String>();
	String name; 
	
	public AdaptadorCriterioProblema() {
		this.name = "AdaptadorCriterioProblema";
	}

	@Override
	public String leerEvaluacion() {
		return
			dataProblema.get("i0") + ", " + 
			dataProblema.get("i1") + ", " +
			dataProblema.get("i2");
	}

	@Override
	public Map<String, String> escribirEvaluacion(String[] evaldata) {
		dataProblema.put("i0", evaldata[0]);
		dataProblema.put("i1", evaldata[1]);
		dataProblema.put("i2", evaldata[2]);
		
		return dataProblema;
	}
}

