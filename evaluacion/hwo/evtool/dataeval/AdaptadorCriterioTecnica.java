package hwo.evtool.dataeval;

import hwo.evtool.dataeval.DataEvaluacion;

public class AdaptadorCriterioTecnica implements DataEvaluacion {
	String[] dataProblema = {"5","4","3","2","1","0"};
	String name; 
	
	public AdaptadorCriterioTecnica() {
		this.name = "AdaptadorCriterioProblema";
	}

	@Override
	public void leerEvaluacion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String[] escribirEvaluacion(String[] dataeval) {
		return dataProblema; 
	}
}
