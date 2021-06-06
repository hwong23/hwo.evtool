package hwo.evtool;

public class CriterioExperienciaEspecifica extends CriterioEvaluacion {
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
