package hwo.evtool.evaluaciones;

import hwo.evtool.propuesta.EvaluarPropuestaCompleta;

public class EvaluarPropuesta {
	public EvaluarPropuesta(String[] evalData) {
		super();
		this.evalData = evalData;
	}

	String description = "Evaluar propuesta";
	String[] evalData;

	public String getDescription() {
		return description;
	}

	public double evaluar () {
		EvaluarPropuestaCompleta evalPropuesta = new EvaluarPropuestaCompleta();

		return evalPropuesta.evaluar();
	 }
}
