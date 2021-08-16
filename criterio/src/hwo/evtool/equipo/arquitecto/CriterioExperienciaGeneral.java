package hwo.evtool.equipo.arquitecto;

import hwo.evtool.evaluacion.CriterioEvaluacion;
import hwo.evtool.evaluacion.Evaluacion;

class CriterioExperienciaGeneral extends CriterioEvaluacion {
	private Evaluacion evaluar;
	private String nombre = "Experiencia general arq";

	public CriterioExperienciaGeneral(Evaluacion evaluar) {
		this.evaluar = evaluar;
	}

	public String getDescription() {
		return evaluar.getDescription() + ", " + this.nombre;
	}

	public double cost() {
		return 0.0 + evaluar.cost();
	}
}
