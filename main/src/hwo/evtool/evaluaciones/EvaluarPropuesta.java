package hwo.evtool.evaluaciones;

import java.util.Arrays;

import hwo.evtool.propuesta.EvaluarPropuestaCompleta;

public class EvaluarPropuesta {
	public EvaluarPropuesta(String[] evalData) {
		super();
		this.evalData = evalData;
	}

	String descripcion = "Evaluar propuesta";
	String[] evalData;

	public String getDescription() {
		return descripcion;
	}

	public double evaluar () {
		System.out.println("--- " + this.descripcion + " ---con datos: " +
			Arrays.toString(this.evalData));
		
		EvaluarPropuestaCompleta evalPropuesta = new EvaluarPropuestaCompleta();

		return evalPropuesta.evaluar();
	 }

	public String[] getEvalData() {
		// TODO Auto-generated method stub
		return this.evalData;
	}
}
