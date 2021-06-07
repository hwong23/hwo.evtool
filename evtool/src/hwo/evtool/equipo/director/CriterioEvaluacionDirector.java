package hwo.evtool.equipo.director;

import hwo.evtool.evaluacion.Evaluacion;

class CriterioEvaluacionDirector extends Evaluacion {
	public CriterioEvaluacionDirector() {
		description = "Evaluar Director";
	}

	public double cost() {
		return 0.0;
	}
}
