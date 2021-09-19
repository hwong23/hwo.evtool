package hwo.evtool.equipo.arquitecto;

import hwo.evtool.control.componente.ControlComponente;
import hwo.evtool.evaluacion.Evaluacion;

/* contrldr */ public class EvaluarArquitecto extends ControlComponente {
	AdaptadorCriterioArquitecto adaptdr = new AdaptadorCriterioArquitecto();
	
	public EvaluarArquitecto(String[] evaldata) {
		super(evaldata);
		this.descripcion = "Evaluar arquitecto";
	}

	protected void hk_adaptacion ()  {
		adaptdr.escribirEvaluacion(this.str_evalData);
	}
	
	@Override
	public double llamarCriteriosEvaluacion () {
		System.out.println("--- " + this.descripcion + " ---con datos: " +
				this.adaptdr.leerEvaluacion());

		/* compont */ Evaluacion evalArquitecto = new CriterioEvaluacionArquitecto(adaptdr.dataArquitecto);
		/* decordr */ evalArquitecto = new CriterioExperienciaEspecifica (evalArquitecto);
		/* decordr */ evalArquitecto = new CriterioExperienciaGeneral (evalArquitecto);
		/* decordr */ evalArquitecto = new CriterioFormacion (evalArquitecto);
		/* decordr */ evalArquitecto = new CriterioCertificacion (evalArquitecto);
		
		return evalArquitecto.cost();
	}
}
