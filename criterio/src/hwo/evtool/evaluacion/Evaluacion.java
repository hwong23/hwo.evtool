package hwo.evtool.evaluacion;

import java.util.Map;


public abstract class Evaluacion {
	public String description = "Unknown Evaluacion";
	protected static Map<String, String> edata;

	public String getDescription() {
		return description;
	}

	public abstract double cost();
}
