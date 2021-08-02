package hwo.evtool.criterio.problema;

import hwo.evtool.criterio.evaluacion.Evaluacion;

class CriterioEvaluacionProblema extends Evaluacion {
	
	public CriterioEvaluacionProblema(String[] edata) {
		description = "Evaluar Propuesta";
		Evaluacion.edata = edata;
	}

	public double cost() {
		return 0.0;
	}
}
