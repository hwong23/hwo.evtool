package hwo.evtool.equipo.arquitecto;

import hwo.evtool.equipo.CriterioEvaluacion;
import hwo.evtool.equipo.Evaluacion;

class CriterioMaestria extends CriterioEvaluacion {
	Evaluacion evaluar;

	public CriterioMaestria(Evaluacion evaluar) {
		this.evaluar = evaluar;
	}

	public String getDescription() {
		return evaluar.getDescription() + ", Maestría/Doctorado";
	}

	public double cost() {
		return .20 + evaluar.cost();
	}
}
