package hwo.evtool.propuesta;

import hwo.evtool.evaluacion.Evaluacion;

class CriterioEvaluacionTecnico extends Evaluacion {
	Evaluacion evaluar;
	boolean cumple;
	
	public CriterioEvaluacionTecnico (Evaluacion evaluar) {
		this.evaluar = evaluar;
		this.cumple = false;
	}

	public String getDescription() {
		return evaluar.getDescription() + ", Técnico";
	}

	public double cost() {
		return this.cumple ? 0.35:0 + evaluar.cost();
	}
}
