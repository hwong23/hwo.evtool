package hwo.evtool;

public class CriterioExperienciaEspecificaEducacion extends CriterioEvaluacion {
	Evaluacion evaluar;

	public CriterioExperienciaEspecificaEducacion(Evaluacion evaluar) {
		this.evaluar = evaluar;
	}

	public String getDescription() {
		return evaluar.getDescription() + ", Experiencia específica";
	}

	public double cost() {
		return .20 + evaluar.cost();
	}
}
