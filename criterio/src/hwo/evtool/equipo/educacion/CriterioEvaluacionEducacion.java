package hwo.evtool.equipo.educacion;

import java.util.Map;

import hwo.evtool.evaluacion.Evaluacion;

class CriterioEvaluacionEducacion extends Evaluacion {
	public CriterioEvaluacionEducacion(Map<String, String> evalData) {
		description = "Evaluar Educacion";
	}

	public double cost() {
		return 0.0;
	}
}
