package hwo.evtool.equipo.director;

import hwo.evtool.control.componente.ControlComponente;
import hwo.evtool.evaluacion.Evaluacion;

public class EvaluarDirector extends ControlComponente {
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
				this.adaptdr.leerEvaluacion());
		
		/* compont */ Evaluacion evalDirector = new CriterioEvaluacionDirector(adaptdr.dataDirector);
		/* decordr */ evalDirector = new CriterioExperienciaEspecificaDirector (evalDirector);
		/* decordr */ evalDirector = new CriterioExperienciaGeneralDirector (evalDirector);
		/* decordr */ evalDirector = new CriterioFormacionDirector (evalDirector);
		/* decordr */ evalDirector = new CriterioCertificacion (evalDirector);

		
		return evalDirector.cost();
	}
}
