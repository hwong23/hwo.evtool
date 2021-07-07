package hwo.evtool.propuesta;

import hwo.evtool.evaluacion.CriterioEvaluacion;
import hwo.evtool.evaluacion.Evaluacion;

class CriterioEvaluacionProblema extends CriterioEvaluacion {
	Evaluacion evaluar;
	
	public CriterioEvaluacionProblema (Evaluacion evaluar) {
		this.evaluar = evaluar;
		this.edata = evaluar.edata;
	}

	public String getDescription() {
		return evaluar.getDescription() + ", Problema";
	}

	public double cost() {
		return this.edata[0].equals("S") ? 0.25:0 + evaluar.cost();
	}
}
