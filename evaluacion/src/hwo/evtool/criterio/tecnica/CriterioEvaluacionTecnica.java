package hwo.evtool.criterio.tecnica;

import hwo.evtool.criterio.evaluacion.Evaluacion;

class CriterioEvaluacionTecnica extends Evaluacion {
	
	public CriterioEvaluacionTecnica(String[] edata) {
		description = "Evaluar Propuesta";
		Evaluacion.edata = edata;
	}

	public double cost() {
		return 0.0;
	}
}
