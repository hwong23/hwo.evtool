package hwo.evtool.criterio.director;

import hwo.evtool.criterio.evaluacion.CriterioEvaluacion;
import hwo.evtool.criterio.evaluacion.Evaluacion;

class CriterioMaestriaDirector extends CriterioEvaluacion {
	Evaluacion evaluar;

	public CriterioMaestriaDirector(Evaluacion evaluar) {
		this.evaluar = evaluar;
	}

	public String getDescription() {
		return evaluar.getDescription() + ", Maestria/Doctorado";
	}

	public double cost() {
		return .20 + evaluar.cost();
	}
}
