package hwo.evtool.evaluacion;

public abstract class Evaluacion {
	public String description = "Unknown Evaluacion";
	protected String[] edata;

	public String getDescription() {
		return description;
	}

	public abstract double cost();
}
