package hwo.evtool.evaluaciones;

import java.util.Arrays;

import hwo.evtool.propuesta.EvaluarPropuestaCompleta;

public class EvaluarPropuesta {
	String descripcion = "Evaluar propuesta";
	String[] evalData;

	public EvaluarPropuesta(String[] evalData) {
		super();
		this.evalData = evalData;
	}

	public String getDescription() {
		return descripcion;
	}

	public double evaluar () {
		System.out.println("--- " + this.descripcion + " ---con datos: " +
			Arrays.toString(this.evalData));
		
		/* item-criterios */ EvaluarPropuestaCompleta evalPropuesta = new EvaluarPropuestaCompleta(evalData);

		return evalPropuesta.evaluar();
	 }
}
