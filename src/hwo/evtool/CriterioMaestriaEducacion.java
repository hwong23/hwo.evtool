package hwo.evtool;

public class CriterioMaestriaEducacion extends CriterioEvaluacion {
	Evaluacion evaluar;

	public CriterioMaestriaEducacion(Evaluacion evaluar) {
		this.evaluar = evaluar;
	}

	public String getDescription() {
		return evaluar.getDescription() + ", Maestría/Doctorado";
	}

	public double cost() {
		return .15 + evaluar.cost();
	}
}
