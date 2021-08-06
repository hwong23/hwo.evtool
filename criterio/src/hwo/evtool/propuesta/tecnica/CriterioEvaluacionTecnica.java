package hwo.evtool.propuesta.tecnica;

import hwo.evtool.dataeval.DataEvaluacion;
import hwo.evtool.evaluacion.Evaluacion;

class CriterioEvaluacionTecnica extends Evaluacion {
	
	public CriterioEvaluacionTecnica(DataEvaluacion evalData) {
		description = "Evaluar Propuesta";
		Evaluacion.edata = evalData;
	}

	public double cost() {
		return 0.0;
	}
}
