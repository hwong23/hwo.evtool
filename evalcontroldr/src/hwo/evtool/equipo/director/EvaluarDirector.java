package hwo.evtool.equipo.director;

import hwo.evtool.control.evaluacion.ControlEvaluacion;
import hwo.evtool.evaluacion.Evaluacion;

public class EvaluarDirector extends ControlEvaluacion {
	AdaptadorCriterioDirector adaptdr = new AdaptadorCriterioDirector();
	
	public EvaluarDirector(String[] evaldata) {
		super(evaldata);
		this.descripcion = "Evaluar director";
	}

	protected void hk_adaptacion ()  {
		adaptdr.escribirEvaluacion(this.str_evalData);
	}
	
	@Override
	public double llamarCriteriosEvaluacion() {
		System.out.println("--- " + this.descripcion + " ---con datos: " +
				this.str_evalData.toString());
		
		/* compont */ Evaluacion evalDirector = new CriterioEvaluacionDirector(adaptdr.dataDirector);
		/* decordr */ evalDirector = new CriterioExperienciaEspecificaDirector (evalDirector);
		/* decordr */ evalDirector = new CriterioExperienciaGeneralDirector (evalDirector);
		/* decordr */ evalDirector = new CriterioMaestriaDirector (evalDirector);

		
		return evalDirector.cost();
	}
}
