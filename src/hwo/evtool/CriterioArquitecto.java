package hwo.evtool;

public class CriterioArquitecto extends Criterio {
	Criterio criterio;

	public CriterioArquitecto(Criterio criterio) {
		this.criterio = criterio;
	}

	public String getDescription() {
		return criterio.getDescription() + ", Arquitecto";
	}

	public double cost() {
		return .20 + criterio.cost();
	}
}
