package hwo.evtool.equipo.arquitecto;

import java.util.Arrays;

import hwo.evtool.evaluacion.Evaluacion;

/* contrldr */ public class EvaluarArquitecto {
	String descripcion = "Evaluar arquitecto";
	String[] evalData;
	
	public EvaluarArquitecto(String[] str_EvaluarArq) {
		// TODO Auto-generated constructor stub
		evalData = str_EvaluarArq;
	}

	public String getDescription() {
		return descripcion;
	}

	public double evaluar() {
		System.out.println("--- " + this.descripcion + " ---con datos: " +
				Arrays.toString(this.evalData));

		/* compont */ Evaluacion evalArquitecto = new CriterioEvaluacionArquitecto(evalData);
		/* decordr */ evalArquitecto = new CriterioExperienciaEspecifica (evalArquitecto);
		/* decordr */ evalArquitecto = new CriterioExperienciaGeneral (evalArquitecto);
		/* decordr */ evalArquitecto = new CriterioMaestria (evalArquitecto);
		
		return evalArquitecto.cost();
	}
}
