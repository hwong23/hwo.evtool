package hwo.evtool.criterio.director;

import hwo.evtool.criterio.evaluacion.Evaluacion;

class CriterioEvaluacionDirector extends Evaluacion {
	public CriterioEvaluacionDirector(String[] evalData) {
		description = "Evaluar Director";
		Evaluacion.edata = evalData;
	}

	public double cost() {
		return 0.0;
	}
}
