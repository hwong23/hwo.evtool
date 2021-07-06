package hwo.evtool.propuesta;

import hwo.evtool.evaluacion.CriterioEvaluacion;
import hwo.evtool.evaluacion.Evaluacion;

class CriterioEvaluacionProblema extends CriterioEvaluacion {
	Evaluacion evaluar;
	private boolean cumple;
	
	public CriterioEvaluacionProblema (Evaluacion evaluar) {
		this.evaluar = evaluar;
		this.cumple = false;
	}

	public String getDescription() {
		return evaluar.getDescription() + ", Problema";
	}

	public double cost() {
		return this.cumple ? 0.25:0 + evaluar.cost();
	}
}
