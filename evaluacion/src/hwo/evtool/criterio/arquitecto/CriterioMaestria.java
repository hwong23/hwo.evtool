package hwo.evtool.criterio.arquitecto;

import hwo.evtool.criterio.evaluacion.CriterioEvaluacion;
import hwo.evtool.criterio.evaluacion.Evaluacion;

class CriterioMaestria extends CriterioEvaluacion {
	Evaluacion evaluar;

	public CriterioMaestria(Evaluacion evaluar) {
		this.evaluar = evaluar;
	}

	public String getDescription() {
		return evaluar.getDescription() + ", Maestria/Doctorado";
	}

	public double cost() {
		return .20 + evaluar.cost();
	}
}
