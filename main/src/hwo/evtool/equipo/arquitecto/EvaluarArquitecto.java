package hwo.evtool.equipo.arquitecto;

import hwo.evtool.evaluacion.Evaluacion;

public class EvaluarArquitecto {


	public double evaluar() {
		Evaluacion evalArquitecto = new CriterioEvaluacionArquitecto();
		evalArquitecto = new CriterioExperienciaEspecifica (evalArquitecto);
		evalArquitecto = new CriterioExperienciaGeneral (evalArquitecto);
		evalArquitecto = new CriterioMaestria (evalArquitecto);

		System.out.println(evalArquitecto.getDescription()
			+ " $" + evalArquitecto.cost());
		
		
		return evalArquitecto.cost();
	}
}
