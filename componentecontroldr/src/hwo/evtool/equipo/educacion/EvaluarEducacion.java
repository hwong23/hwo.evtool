package hwo.evtool.equipo.educacion;

import hwo.evtool.control.componente.ControlComponente;
import hwo.evtool.evaluacion.Evaluacion;

public class EvaluarEducacion extends ControlComponente {
	AdaptadorCriterioEducacion adaptdr = new AdaptadorCriterioEducacion();
	
	public EvaluarEducacion(String[] evaldata) {
		super(evaldata);
		this.descripcion = "Evaluar educación";
	}

	protected void hk_adaptacion ()  {
		adaptdr.escribirEvaluacion(this.str_evalData);
	}
	
	@Override
	public double llamarCriteriosEvaluacion() {
		System.out.println("--- " + this.descripcion + " ---con datos: " +
				this.adaptdr.leerEvaluacion());
		
		/* compont */ Evaluacion evalEducacion = new CriterioEvaluacionEducacion(adaptdr.dataEducacion);
		/* decordr */ evalEducacion = new CriterioExperienciaEspecificaEducacion (evalEducacion);
		/* decordr */ evalEducacion = new CriterioExperienciaGeneralEducacion (evalEducacion);
		/* decordr */ evalEducacion = new CriterioFormacionEducacion (evalEducacion);
		/* decordr */ evalEducacion = new CriterioCertificacion (evalEducacion);
	

		return evalEducacion.cost();
	}
}
