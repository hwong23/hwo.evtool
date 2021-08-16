package hwo.evtool.equipo.director;

import hwo.evtool.evaluacion.CriterioEvaluacion;
import hwo.evtool.evaluacion.Evaluacion;

class CriterioExperienciaGeneralDirector extends CriterioEvaluacion {
	private Evaluacion evaluar;
	private String nombre = "Experiencia general dir";

	public CriterioExperienciaGeneralDirector(Evaluacion evaluar) {
		this.evaluar = evaluar;
	}

	public String getDescription() {
		return evaluar.getDescription() + ", " + this.nombre;
	}

	public double cost() {
		return 0.0 + evaluar.cost();
	}
}
