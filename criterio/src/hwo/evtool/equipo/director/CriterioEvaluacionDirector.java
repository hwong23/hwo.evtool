package hwo.evtool.equipo.director;

import hwo.evtool.dataeval.DataEvaluacion;
import hwo.evtool.evaluacion.Evaluacion;

class CriterioEvaluacionDirector extends Evaluacion {
	public CriterioEvaluacionDirector(DataEvaluacion evalData) {
		description = "Evaluar Director";
		Evaluacion.edata = evalData;
	}

	public double cost() {
		return 0.0;
	}
}
