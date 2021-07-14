package hwo.evtool.propuesta;

import java.util.Arrays;
import hwo.evtool.propuesta.problema.*;
import hwo.evtool.propuesta.tecnica.*;


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
		
		/* item-criterios */ EvaluarProblema evalProblema = new EvaluarProblema(evalData);
		/* item-criterios */ EvaluarTecnica evalTecnica = new EvaluarTecnica(evalData);
		
		
		return evalProblema.evaluar()+evalTecnica.evaluar();
	 }
}
