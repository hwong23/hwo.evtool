package hwo.evtool.equipo.arquitecto;

import hwo.evtool.evaluacion.CriterioEvaluacion;
import hwo.evtool.evaluacion.Evaluacion;

class CriterioExperienciaGeneral extends CriterioEvaluacion {
	Evaluacion evaluar;

	public CriterioExperienciaGeneral(Evaluacion evaluar) {
		this.evaluar = evaluar;
	}

	public String getDescription() {
		return evaluar.getDescription() + ", Experiencia general";
	}

	public double cost() {
		return 0.0 + evaluar.cost();
	}
}
