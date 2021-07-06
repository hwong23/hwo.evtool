package hwo.evtool.propuesta;

import hwo.evtool.evaluacion.Evaluacion;

class CriterioEvaluacionPropuesta extends Evaluacion {
	private String[] eval_data;
	
	public CriterioEvaluacionPropuesta() {
		description = "Evaluar Propuesta";
//		this.eval_data = edata;
	}

	public double cost() {
		return 0.0;
	}
}
