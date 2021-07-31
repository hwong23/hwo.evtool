package hwo.evtool.propuesta.problema;

import hwo.evtool.evaluacion.Evaluacion;

public class AdaptadorCriterioProblema extends Evaluacion {
	Evaluacion criterioProblema;
	
	public AdaptadorCriterioProblema(Evaluacion evalProblema) {
		// TODO Auto-generated constructor stub
		super();
		this.criterioProblema = evalProblema;
	}


	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0;
	}

}
