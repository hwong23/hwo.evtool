package hwo.evtool.equipo;

public abstract class Evaluacion {
	public String description = "Unknown Evaluacion";

	public String getDescription() {
		return description;
	}

	public abstract double cost();
}
