package hwo.evtool.propuesta.problema;

import hwo.evtool.control.componente.*;
import hwo.evtool.evaluacion.Evaluacion;


/* contrldr */ public class EvaluarProblema extends ControlComponente {
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
			this.adaptdr.leerEvaluacion());
			
		/* compont */ Evaluacion evalProblema = new CriterioEvaluacionProblema (adaptdr.dataProblema);
		/* decordr */ evalProblema = new CriterioEvaluacionPropuestaProblema (evalProblema);


		return evalProblema.cost();
	}
}
