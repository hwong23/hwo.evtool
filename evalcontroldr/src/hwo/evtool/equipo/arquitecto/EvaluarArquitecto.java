package hwo.evtool.equipo.arquitecto;

import java.util.Arrays;

import hwo.evtool.control.evaluacion.ControlEvaluacion;
import hwo.evtool.dataeval.DataEvaluacion;
import hwo.evtool.evaluacion.Evaluacion;

/* contrldr */ public class EvaluarArquitecto extends ControlEvaluacion {
	public EvaluarArquitecto(DataEvaluacion str_EvaluarArq) {
		// TODO Auto-generated constructor stub
		super(str_EvaluarArq);
		this.descripcion = "Evaluar arquitecto";
	}

	public double llamarCriteriosEvaluacion () {
		System.out.println("--- " + this.descripcion + " ---con datos: " +
				this.evalData.toString());

		/* compont */ Evaluacion evalArquitecto = new CriterioEvaluacionArquitecto(evalData);
		/* decordr */ evalArquitecto = new CriterioExperienciaEspecifica (evalArquitecto);
		/* decordr */ evalArquitecto = new CriterioExperienciaGeneral (evalArquitecto);
		/* decordr */ evalArquitecto = new CriterioMaestria (evalArquitecto);
		
		return evalArquitecto.cost();
	}
}
