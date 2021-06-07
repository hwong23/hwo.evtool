package hwo.evtool.equipo.arquitecto;

import hwo.evtool.equipo.CriterioEvaluacion;
import hwo.evtool.equipo.Evaluacion;

class CriterioExperienciaGeneral extends CriterioEvaluacion {
	Evaluacion evaluar;

	public CriterioExperienciaGeneral(Evaluacion evaluar) {
		this.evaluar = evaluar;
	}

	public String getDescription() {
		return evaluar.getDescription() + ", Experiencia general";
	}

	public double cost() {
		return .30 + evaluar.cost();
	}
}
