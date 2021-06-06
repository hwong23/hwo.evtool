package hwo.evtool;

public class CriterioMaestria extends CriterioEvaluacion {
	Evaluacion evaluar;

	public CriterioMaestria(Evaluacion evaluar) {
		this.evaluar = evaluar;
	}

	public String getDescription() {
		return evaluar.getDescription() + ", Maestría/Doctorado";
	}

	public double cost() {
		return .10 + evaluar.cost();
	}
}
