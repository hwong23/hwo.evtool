package hwo.evtool.propuesta.problema;

import java.util.HashMap;
import java.util.Map;

import hwo.evtool.dataeval.DataEvaluacion;

public class AdaptadorCriterioProblema implements DataEvaluacion {
	Map<String, String> dataProblema = new HashMap<String, String>();
	String name; 
	
	public AdaptadorCriterioProblema(String[] evaldata) {
		this.name = "AdaptadorCriterioProblema";
		escribirEvaluacion(evaldata);
	}

	@Override
	public String leerEvaluacion() {
		return "HWO";
//			dataProblema.get("i0") + ", " + 
//			dataProblema.get("i1") + ", " +
//			dataProblema.get("i2");
	}

	@Override
	public void escribirEvaluacion(String[] dataeval) {
		dataProblema.put("i0", dataeval[0]);
		dataProblema.put("i1", dataeval[1]);
		dataProblema.put("i2", dataeval[2]);
		
	}
}

