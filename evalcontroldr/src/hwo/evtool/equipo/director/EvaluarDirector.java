package hwo.evtool.equipo.director;

import java.util.Map;
import hwo.evtool.control.evaluacion.ControlEvaluacion;
import hwo.evtool.evaluacion.Evaluacion;

public class EvaluarDirector extends ControlEvaluacion {
	Map<String, String> evaldata;
	
	public EvaluarDirector(String[] evaldata) {
		super(evaldata);
		this.descripcion = "Evaluar director";
	}

	private void hk_adaptacion ()  {
		AdaptadorCriterioDirector adaptdr = new AdaptadorCriterioDirector();
		this.evaldata = adaptdr.escribirEvaluacion(this.str_evalData);
	}
	
	@Override
	public double llamarCriteriosEvaluacion() {
		System.out.println("--- " + this.descripcion + " ---con datos: " +
				this.str_evalData.toString());
		
		/* compont */ Evaluacion evalDirector = new CriterioEvaluacionDirector(this.evaldata);
		/* decordr */ evalDirector = new CriterioExperienciaEspecificaDirector (evalDirector);
		/* decordr */ evalDirector = new CriterioExperienciaGeneralDirector (evalDirector);
		/* decordr */ evalDirector = new CriterioMaestriaDirector (evalDirector);

		
		return evalDirector.cost();
	}
}
