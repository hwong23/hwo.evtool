package hwo.evtool.equipo.arquitecto;

import java.util.Map;

import hwo.evtool.control.evaluacion.ControlEvaluacion;
import hwo.evtool.evaluacion.Evaluacion;

/* contrldr */ public class EvaluarArquitecto extends ControlEvaluacion {
	Map<String, String> evaldata;
	
	public EvaluarArquitecto(String[] evaldata) {
		super(evaldata);
		this.descripcion = "Evaluar arquitecto";
	}

	private void hk_adaptacion ()  {
		AdaptadorCriterioArquitecto adaptdr = new AdaptadorCriterioArquitecto();
		this.evaldata = adaptdr.escribirEvaluacion(this.str_evalData);
	}
	
	@Override
	public double llamarCriteriosEvaluacion () {
		System.out.println("--- " + this.descripcion + " ---con datos: " +
				this.str_evalData.toString());

		/* compont */ Evaluacion evalArquitecto = new CriterioEvaluacionArquitecto(this.evaldata);
		/* decordr */ evalArquitecto = new CriterioExperienciaEspecifica (evalArquitecto);
		/* decordr */ evalArquitecto = new CriterioExperienciaGeneral (evalArquitecto);
		/* decordr */ evalArquitecto = new CriterioMaestria (evalArquitecto);
		
		return evalArquitecto.cost();
	}
}
