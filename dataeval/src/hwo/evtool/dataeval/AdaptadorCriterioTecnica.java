
package hwo.evtool.dataeval;

import java.util.HashMap;

public class AdaptadorCriterioTecnica implements DataEvaluacion {
	HashMap<String, String> dataProblema = new HashMap<String, String>();
	String name; 
	
	public AdaptadorCriterioTecnica() {
		this.name = "AdaptadorCriterioTecnica";
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
