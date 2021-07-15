package hwo.evtool.propuesta.problema;


import java.util.Arrays;
import hwo.evtool.propuesta.problema.*;


public class EvaluarProblema {
	public EvaluarProblema(String[] str_EvaluarProblema) {
		super();
		this.evalData = str_EvaluarProblema;
	}

	String descripcion = "Evaluar problema";
	String[] evalData;

	public String[] getEvalData() {
		return this.evalData;
	}

	public String getDescription() {
		return descripcion;
	}

	public double evaluar () {
		System.out.println("--- " + this.descripcion + " ---con datos: " +
			Arrays.toString(this.evalData));
		
		/* item-criterios */ EvaluarProblema evalProblema = new EvaluarProblema(evalData);

		return evalProblema.evaluar();
	 }
}
