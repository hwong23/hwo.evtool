package hwo.evtool.criterio.director;

import hwo.evtool.criterio.evaluacion.CriterioEvaluacion;
import hwo.evtool.criterio.evaluacion.Evaluacion;

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
