package hwo.evtool.propuesta;

import hwo.evtool.evaluacion.Evaluacion;

class CriterioEvaluacionPropuesta extends Evaluacion {
	
	public CriterioEvaluacionPropuesta(String[] edata) {
		description = "Evaluar Propuesta";
		Evaluacion.edata = edata;
	}

	public double cost() {
		return 0.0;
	}
}
