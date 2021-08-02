package hwo.evtool.equipo.arquitecto;

import hwo.evtool.evaluacion.CriterioEvaluacion;
import hwo.evtool.evaluacion.Evaluacion;

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
