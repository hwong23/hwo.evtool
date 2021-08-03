package hwo.evtool.criterio.arquitecto;

import hwo.evtool.criterio.evaluacion.CriterioEvaluacion;
import hwo.evtool.criterio.evaluacion.Evaluacion;

class CriterioExperienciaEspecifica extends CriterioEvaluacion {
	Evaluacion evaluar;

	public CriterioExperienciaEspecifica(Evaluacion evaluar) {
		this.evaluar = evaluar;
	}

	public String getDescription() {
		return evaluar.getDescription() + ", Experiencia especifica";
	}

	public double cost() {
		return .20 + evaluar.cost();
	}
}