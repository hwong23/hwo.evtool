package hwo.evtool;

public class CriterioMaestriaDirector extends CriterioEvaluacion {
	Evaluacion evaluar;

	public CriterioMaestriaDirector(Evaluacion evaluar) {
		this.evaluar = evaluar;
	}

	public String getDescription() {
		return evaluar.getDescription() + ", Maestría/Doctorado";
	}

	public double cost() {
		return .20 + evaluar.cost();
	}
}
