package hwo.evtool.propuesta.problema;

import java.util.Map;

import hwo.evtool.evaluacion.Evaluacion;

class CriterioEvaluacionProblema extends Evaluacion {
	
	public CriterioEvaluacionProblema(Map<String, String> evalData) {
		description = "Evaluar Propuesta";
		Evaluacion.edata = evalData;
	}

	public double cost() {
		return 0.0;
	}
}
