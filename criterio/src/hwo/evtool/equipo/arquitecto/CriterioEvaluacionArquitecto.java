package hwo.evtool.equipo.arquitecto;

import hwo.evtool.evaluacion.Evaluacion;

class CriterioEvaluacionArquitecto extends Evaluacion {
	public CriterioEvaluacionArquitecto(String[] evalData) {
		description = "Evaluar Arquitecto";
		Evaluacion.edata = evalData;
	}

	public double cost() {
		return 0.0;
	}
}
