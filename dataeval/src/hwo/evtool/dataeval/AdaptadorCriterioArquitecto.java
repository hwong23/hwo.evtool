package hwo.evtool.dataeval;

import java.util.HashMap;

public class AdaptadorCriterioArquitecto implements DataEvaluacion {
	HashMap<String, String> dataProblema = new HashMap<String, String>();
	String name; 
	
	public AdaptadorCriterioArquitecto() {
		this.name = "AdaptadorCriterioArquitecto";
	}

	@Override
	public void leerEvaluacion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public HashMap<String, String> escribirEvaluacion(String[] dataeval) {
		dataProblema.put("nombre", dataeval[0]);
		dataProblema.put("formacion", dataeval[1]);
		dataProblema.put("experiencia", dataeval[2]);
		dataProblema.put("certificacion", dataeval[3]);
		
		return dataProblema; 
	}
}
