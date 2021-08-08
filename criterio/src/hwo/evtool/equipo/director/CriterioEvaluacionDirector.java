package hwo.evtool.equipo.director;

import java.util.Map;

import hwo.evtool.evaluacion.Evaluacion;

class CriterioEvaluacionDirector extends Evaluacion {
	public CriterioEvaluacionDirector(Map<String, String> evalData) {
		description = "Evaluar Director";
		Evaluacion.edata = evalData;
	}

	public double cost() {
		return 0.0;
	}
}
