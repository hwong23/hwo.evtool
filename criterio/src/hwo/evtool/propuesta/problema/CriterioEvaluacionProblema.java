package hwo.evtool.propuesta.problema;

import hwo.evtool.dataeval.DataEvaluacion;
import hwo.evtool.evaluacion.Evaluacion;

class CriterioEvaluacionProblema extends Evaluacion {
	
	public CriterioEvaluacionProblema(DataEvaluacion evalData) {
		description = "Evaluar Propuesta";
		Evaluacion.edata = evalData;
	}

	public double cost() {
		return 0.0;
	}
}
