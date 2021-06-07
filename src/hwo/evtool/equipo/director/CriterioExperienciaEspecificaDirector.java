package hwo.evtool.equipo.director;

import hwo.evtool.equipo.CriterioEvaluacion;
import hwo.evtool.equipo.Evaluacion;

class CriterioExperienciaEspecificaDirector extends CriterioEvaluacion {
	Evaluacion evaluar;

	public CriterioExperienciaEspecificaDirector(Evaluacion evaluar) {
		this.evaluar = evaluar;
	}

	public String getDescription() {
		return evaluar.getDescription() + ", Experiencia específica";
	}

	public double cost() {
		return .30 + evaluar.cost();
	}
}
