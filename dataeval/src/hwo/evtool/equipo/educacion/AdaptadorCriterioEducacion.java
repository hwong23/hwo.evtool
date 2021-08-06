package hwo.evtool.equipo.educacion;

import hwo.evtool.dataeval.DataEvaluacion;

public class AdaptadorCriterioEducacion implements DataEvaluacion {
	String[] dataProblema = {"/5","/4","/3","/2","/1","/0"};
	String name; 
	
	public AdaptadorCriterioEducacion() {
		this.name = "AdaptadorCriterioEducacion";
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
