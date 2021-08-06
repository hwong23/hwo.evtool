package hwo.evtool.evaluacion;

import hwo.evtool.dataeval.DataEvaluacion;

public abstract class Evaluacion {
	public String description = "Unknown Evaluacion";
	protected static DataEvaluacion edata;

	public String getDescription() {
		return description;
	}

	public abstract double cost();
}
