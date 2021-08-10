package hwo.evtool.propuesta.tecnica;


import java.util.Map;

import hwo.evtool.control.evaluacion.ControlEvaluacion;
import hwo.evtool.evaluacion.Evaluacion;


public class EvaluarTecnica extends ControlEvaluacion {
	Map<String, String> evaldata;
	
	public EvaluarTecnica(String[] str_evaldata) {
		super(str_evaldata);
		this.descripcion = "(contrldr) Evaluar Tecnica (nueva evalc.)";
	}

	private void hk_adaptacion ()  {
		AdaptadorCriterioDirector adaptdr = new AdaptadorCriterioDirector();
		this.evaldata = adaptdr.escribirEvaluacion(this.str_evalData);
	}
	
	@Override
	public double llamarCriteriosEvaluacion() {
		System.out.println("--- " + this.descripcion + " ---con datos: " +
			this.str_evalData.toString());
		
		/* compont */ Evaluacion evalTecnica = new CriterioEvaluacionTecnica (this.evaldata);
		/* decordr */ evalTecnica = new CriterioEvaluacionPropuestaTecnica (evalTecnica);

		return evalTecnica.cost();
	}
}
