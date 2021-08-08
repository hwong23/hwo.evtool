package hwo.evtool.propuesta.tecnica;

import java.util.Map;

import hwo.evtool.dataeval.del.DataEvaluacion;
import hwo.evtool.evaluacion.Evaluacion;

class CriterioEvaluacionTecnica extends Evaluacion {
	
	public CriterioEvaluacionTecnica(Map<String, String> evalData) {
		description = "Evaluar Propuesta";
		Evaluacion.edata = evalData;
	}

	public double cost() {
		return 0.0;
	}
}
