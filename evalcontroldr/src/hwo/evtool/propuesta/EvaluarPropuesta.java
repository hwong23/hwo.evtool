package hwo.evtool.propuesta;

import java.util.Arrays;
import hwo.evtool.evaluacion.Evaluacion;


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
		
		/* compont */ Evaluacion evalPropuesta = new CriterioEvaluacionPropuesta(evalData);
		/* decordr */ evalPropuesta = new CriterioEvaluacionTecnico(evalPropuesta);
		/* decordr */ evalPropuesta = new CriterioEvaluacionProblema(evalPropuesta);
		
		System.out.println (evalPropuesta.getDescription()
			+ " $" + evalPropuesta.cost());
		
		return evalPropuesta.cost();
	 }
}
