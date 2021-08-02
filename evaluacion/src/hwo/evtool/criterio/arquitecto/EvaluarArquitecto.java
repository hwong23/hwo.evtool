package hwo.evtool.criterio.arquitecto;

import java.util.Arrays;
import hwo.evtool.controlador.ControlEvaluacion;
import hwo.evtool.criterio.evaluacion.Evaluacion;

/* contrldr */ public class EvaluarArquitecto extends ControlEvaluacion {
	public EvaluarArquitecto(String[] str_EvaluarArq) {
		// TODO Auto-generated constructor stub
		super(str_EvaluarArq);
		this.descripcion = "Evaluar arquitecto";
	}

	public double llamarCriteriosEvaluacion () {
		System.out.println("--- " + this.descripcion + " ---con datos: " +
				Arrays.toString(this.evalData));

		/* compont */ Evaluacion evalArquitecto = new CriterioEvaluacionArquitecto(evalData);
		/* decordr */ evalArquitecto = new CriterioExperienciaEspecifica (evalArquitecto);
		/* decordr */ evalArquitecto = new CriterioExperienciaGeneral (evalArquitecto);
		/* decordr */ evalArquitecto = new CriterioMaestria (evalArquitecto);
		
		return evalArquitecto.cost();
	}
}
