package hwo.evtool.equipo.arquitecto;

import hwo.evtool.evaluacion.Evaluacion;

public class EvaluarArquitecto {


	public double evaluar() {
		/* compont */ Evaluacion evalArquitecto = new CriterioEvaluacionArquitecto();
		/* decordr */ evalArquitecto = new CriterioExperienciaEspecifica (evalArquitecto);
		/* decordr */ evalArquitecto = new CriterioExperienciaGeneral (evalArquitecto);
		/* decordr */ evalArquitecto = new CriterioMaestria (evalArquitecto);

		System.out.println(evalArquitecto.getDescription()
			+ " $" + evalArquitecto.cost());
		
		
		return evalArquitecto.cost();
	}
}
