package hwo.evtool.criterio.problema;

import java.util.Arrays;
import hwo.evtool.evaluacion.Evaluacion;
import hwo.evtool.control.evaluacion.*;


/* contrldr */ public class EvaluarProblema extends ControlEvaluacion {
	public EvaluarProblema(String[] evaldata) {
		super(evaldata);
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
}
