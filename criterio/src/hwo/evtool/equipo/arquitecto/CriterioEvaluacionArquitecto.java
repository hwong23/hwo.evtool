package hwo.evtool.equipo.arquitecto;

import java.util.Map;

import hwo.evtool.evaluacion.Evaluacion;

class CriterioEvaluacionArquitecto extends Evaluacion {
	public CriterioEvaluacionArquitecto(Map<String, String> evalData) {
		description = "Evaluar Arquitecto";
		Evaluacion.edata = evalData;
	}

	public double cost() {
		return 0.0;
	}
}
