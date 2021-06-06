package hwo.evtool;

public abstract class Evaluacion {
	String description = "Unknown Evaluacion";

	public String getDescription() {
		return description;
	}

	public abstract double cost();
}
