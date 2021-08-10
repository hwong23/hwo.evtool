package hwo.evtool.equipo.arquitecto;

import java.util.Map;

import hwo.evtool.control.evaluacion.ControlEvaluacion;
import hwo.evtool.evaluacion.Evaluacion;

/* contrldr */ public class EvaluarArquitecto extends ControlEvaluacion {
	public EvaluarArquitecto(Map<String, String> str_EvaluarArq) {
		super(str_EvaluarArq);
		this.descripcion = "Evaluar arquitecto";
	}

	public double llamarCriteriosEvaluacion () {
		System.out.println("--- " + this.descripcion + " ---con datos: " +
				this.str_evalData.toString());

		/* compont */ Evaluacion evalArquitecto = new CriterioEvaluacionArquitecto(str_evalData);
		/* decordr */ evalArquitecto = new CriterioExperienciaEspecifica (evalArquitecto);
		/* decordr */ evalArquitecto = new CriterioExperienciaGeneral (evalArquitecto);
		/* decordr */ evalArquitecto = new CriterioMaestria (evalArquitecto);
		
		return evalArquitecto.cost();
	}
}
