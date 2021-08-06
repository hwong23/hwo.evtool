
package hwo.evtool.propuesta.tecnica;

import hwo.evtool.dataeval.DataEvaluacion;

public class AdaptadorCriterioTecnica implements DataEvaluacion {
	String[] dataProblema = {"5","4","3","2","1","0"};
	String name; 
	
	public AdaptadorCriterioTecnica() {
		this.name = "AdaptadorCriterioTecnica";
	}

	@Override
	public void leerEvaluacion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DataEvaluacion escribirEvaluacion(String[] dataeval) {
		return this; 
	}
}
