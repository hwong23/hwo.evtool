package hwo.evtool.equipo.director;

import hwo.evtool.evaluacion.CriterioEvaluacion;
import hwo.evtool.evaluacion.Evaluacion;

class CriterioExperienciaEspecificaDirector extends CriterioEvaluacion {
	Evaluacion evaluar;

	public CriterioExperienciaEspecificaDirector(Evaluacion evaluar) {
		this.evaluar = evaluar;
	}

	public String getDescription() {
		return evaluar.getDescription() + ", Experiencia especifica";
	}

	public double cost() {
		return .30 + evaluar.cost();
	}
}
