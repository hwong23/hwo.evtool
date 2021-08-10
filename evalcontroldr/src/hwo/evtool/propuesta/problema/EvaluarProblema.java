package hwo.evtool.propuesta.problema;

import hwo.evtool.evaluacion.Evaluacion;
import hwo.evtool.control.evaluacion.*;


/* contrldr */ public class EvaluarProblema extends ControlEvaluacion {
	AdaptadorCriterioProblema adaptdr = new AdaptadorCriterioProblema();
	
	public EvaluarProblema(String[] evaldata) {
		super(evaldata);
		this.descripcion = "(contrldr) Evaluar problema (nueva evalc.)";
	}

	protected void hk_adaptacion ()  {
		adaptdr.escribirEvaluacion(this.str_evalData);
	}
	
	@Override
	protected double llamarCriteriosEvaluacion() {
		System.out.println("--- " + this.descripcion + " ---con datos: " +
			"this.evalData.leerEvaluacion()");
			
		/* compont */ Evaluacion evalProblema = new CriterioEvaluacionProblema (adaptdr.dataProblema);
		/* decordr */ evalProblema = new CriterioEvaluacionPropuestaProblema (evalProblema);


		return evalProblema.cost();
	}
}
