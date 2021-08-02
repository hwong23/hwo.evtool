package hwo.evtool.propuesta.problema;

import hwo.evtool.dataeval.DataEvaluacion;

class AdaptadorCriterioProblema implements DataEvaluacion {
	String[] dataProblema = {"0","1","2","3","4","5"};
	String name; 
	
	public AdaptadorCriterioProblema() {
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

