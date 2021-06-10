package hwo.evtool.evaluaciones;

import hwo.evtool.propuesta.EvaluarPropuestaCompleta;

public class EvaluarPropuesta {
	String description = "Evaluar propuesta";

	public String getDescription() {
		return description;
	}

	public double evaluar () {
		EvaluarPropuestaCompleta evalPropuesta = new EvaluarPropuestaCompleta();

		return evalPropuesta.evaluar();
	 }
}
