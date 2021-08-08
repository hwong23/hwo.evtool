package hwo.evtool.propuesta.problema;

import hwo.evtool.evaluacion.Evaluacion;
import java.util.Map;
import hwo.evtool.control.evaluacion.*;


/* contrldr */ public class EvaluarProblema extends ControlEvaluacion {
	public EvaluarProblema(Map<String, String> evaldata) {
		super(evaldata);
		this.descripcion = "(contrldr) Evaluar problema (nueva evalc.)";
	}

	@Override
	protected double llamarCriteriosEvaluacion() {
		System.out.println("--- " + this.descripcion + " ---con datos: " +
			"this.evalData.leerEvaluacion()");
			
		/* compont */ Evaluacion evalProblema = new CriterioEvaluacionProblema (evalData);
		/* decordr */ evalProblema = new CriterioEvaluacionPropuestaProblema (evalProblema);


		return evalProblema.cost();
	}
}
