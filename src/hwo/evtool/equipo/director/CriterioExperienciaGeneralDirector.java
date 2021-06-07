package hwo.evtool.equipo.director;

import hwo.evtool.equipo.CriterioEvaluacion;
import hwo.evtool.equipo.Evaluacion;

class CriterioExperienciaGeneralDirector extends CriterioEvaluacion {
	Evaluacion evaluar;

	public CriterioExperienciaGeneralDirector(Evaluacion evaluar) {
		this.evaluar = evaluar;
	}

	public String getDescription() {
		return evaluar.getDescription() + ", Experiencia general";
	}

	public double cost() {
		return .40 + evaluar.cost();
	}
}
