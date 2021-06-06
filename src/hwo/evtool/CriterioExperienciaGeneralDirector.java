package hwo.evtool;

public class CriterioExperienciaGeneralDirector extends CriterioEvaluacion {
	Evaluacion evaluar;

	public CriterioExperienciaGeneralDirector(Evaluacion evaluar) {
		this.evaluar = evaluar;
	}

	public String getDescription() {
		return evaluar.getDescription() + ", Experiencia general";
	}

	public double cost() {
		return .40 + evaluar.cost();
	}
}
