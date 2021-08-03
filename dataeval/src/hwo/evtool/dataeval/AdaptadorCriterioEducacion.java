package hwo.evtool.dataeval;

import java.util.HashMap;

public class AdaptadorCriterioEducacion implements DataEvaluacion {
	HashMap<String, String> dataProblema = new HashMap<String, String>();
	String name; 
	
	public AdaptadorCriterioEducacion() {
		this.name = "AdaptadorCriterioEducacion";
	}

	@Override
	public void leerEvaluacion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public HashMap<String, String> escribirEvaluacion(String[] dataeval) {
		return dataProblema; 
	}
}
