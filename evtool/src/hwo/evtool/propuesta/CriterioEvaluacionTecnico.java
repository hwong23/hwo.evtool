package hwo.evtool.propuesta;

import hwo.evtool.evaluacion.Evaluacion;

class CriterioEvaluacionTecnico extends Evaluacion {
	Evaluacion evaluar;
	
	public CriterioEvaluacionTecnico (Evaluacion evaluar) {
		this.evaluar = evaluar;
	}

	public String getDescription() {
		return evaluar.getDescription() + ", Técnico";
	}

	public double cost() {
		return 0.15 + evaluar.cost();
	}
}
