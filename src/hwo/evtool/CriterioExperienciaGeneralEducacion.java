package hwo.evtool;

public class CriterioExperienciaGeneralEducacion extends CriterioEvaluacion {
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
