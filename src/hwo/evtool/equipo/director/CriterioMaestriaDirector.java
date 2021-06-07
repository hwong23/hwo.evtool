package hwo.evtool.equipo.director;

import hwo.evtool.equipo.CriterioEvaluacion;
import hwo.evtool.equipo.Evaluacion;

class CriterioMaestriaDirector extends CriterioEvaluacion {
	Evaluacion evaluar;

	public CriterioMaestriaDirector(Evaluacion evaluar) {
		this.evaluar = evaluar;
	}

	public String getDescription() {
		return evaluar.getDescription() + ", Maestría/Doctorado";
	}

	public double cost() {
		return .20 + evaluar.cost();
	}
}
