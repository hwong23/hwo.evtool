package hwo.evtool.equipo.arquitecto;

import hwo.evtool.equipo.CriterioEvaluacion;
import hwo.evtool.equipo.Evaluacion;

class CriterioExperienciaEspecifica extends CriterioEvaluacion {
	Evaluacion evaluar;

	public CriterioExperienciaEspecifica(Evaluacion evaluar) {
		this.evaluar = evaluar;
	}

	public String getDescription() {
		return evaluar.getDescription() + ", Experiencia específica";
	}

	public double cost() {
		return .20 + evaluar.cost();
	}
}
