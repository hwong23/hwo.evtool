package hwo.evtool.criterio.evaluacion;

public abstract class Evaluacion {
	public String description = "Unknown Evaluacion";
	protected static String[] edata;

	public String getDescription() {
		return description;
	}

	public abstract double cost();
}
