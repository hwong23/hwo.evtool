package hwo.evtool.equipo.educacion;

import hwo.evtool.equipo.CriterioEvaluacion;
import hwo.evtool.equipo.Evaluacion;

class CriterioExperienciaGeneralEducacion extends CriterioEvaluacion {
	Evaluacion evaluar;

	public CriterioExperienciaGeneralEducacion(Evaluacion evaluar) {
		this.evaluar = evaluar;
	}

	public String getDescription() {
		return evaluar.getDescription() + ", Experiencia general";
	}

	public double cost() {
		return .30 + evaluar.cost();
	}
}
