package hwo.evtool.equipo.director;

import hwo.evtool.evaluacion.CriterioEvaluacion;
import hwo.evtool.evaluacion.Evaluacion;

class CriterioExperienciaGeneralDirector extends CriterioEvaluacion {
	Evaluacion evaluar;

	public CriterioExperienciaGeneralDirector(Evaluacion evaluar) {
		this.evaluar = evaluar;
	}

	public String getDescription() {
		return evaluar.getDescription() + ", Experiencia general";
	}

	public double cost() {
		return 0.0 + evaluar.cost();
	}
}
