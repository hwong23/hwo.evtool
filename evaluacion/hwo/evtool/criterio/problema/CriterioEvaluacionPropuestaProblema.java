package hwo.evtool.criterio.problema;

import hwo.evtool.criterio.evaluacion.CriterioEvaluacion;
import hwo.evtool.criterio.evaluacion.Evaluacion;

class CriterioEvaluacionPropuestaProblema extends CriterioEvaluacion {
	Evaluacion evaluar;
	
	public CriterioEvaluacionPropuestaProblema (Evaluacion evaluar) {
		this.evaluar = evaluar;
	}

	public String getDescription() {
		return evaluar.getDescription() + ", Problema";
	}

	public double cost() {
		return Evaluacion.edata[2].equals("A") ? 3.0 : 1.5;
	}
}
