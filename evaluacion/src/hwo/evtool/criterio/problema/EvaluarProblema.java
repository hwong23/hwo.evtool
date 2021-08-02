package hwo.evtool.criterio.problema;

import java.util.Arrays;

import hwo.evtool.controlador.*;
import hwo.evtool.criterio.evaluacion.Evaluacion;


/* contrldr */ public class EvaluarProblema extends ControlEvaluacion {
	public EvaluarProblema(String[] str_EvaluarProblema) {
		super(str_EvaluarProblema);
		this.descripcion = "(contrldr) Evaluar problema (nueva evalc.)";
	}

	@Override
	protected double llamarCriteriosEvaluacion() {
		System.out.println("--- " + this.descripcion + " ---con datos: " +
				Arrays.toString(this.evalData));
			
		/* compont */ Evaluacion evalProblema = new CriterioEvaluacionProblema (evalData);
		/* decordr */ evalProblema = new CriterioEvaluacionPropuestaProblema (evalProblema);


		return evalProblema.cost();
	}

	@Override
	protected String[] escribirDataEvaluacion(String[] evalData) {
		
		AdaptadorCriterioProblema adptr = new AdaptadorCriterioProblema();
		return adptr.escribirEvaluacion(evalData);
	}
}
