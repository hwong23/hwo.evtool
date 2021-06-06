package hwo.evtool;

public class CriterioDirector extends Criterio {
	Criterio criterio;

	public CriterioDirector(Criterio criterio) {
		this.criterio = criterio;
	}

	public String getDescription() {
		return criterio.getDescription() + ", Director";
	}

	public double cost() {
		return .20 + criterio.cost();
	}
}
