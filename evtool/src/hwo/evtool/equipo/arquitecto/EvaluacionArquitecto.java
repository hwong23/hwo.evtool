package hwo.evtool.equipo.arquitecto;

import hwo.evtool.evaluacion.Evaluacion;

public class EvaluacionArquitecto {

	public double evaluar() {
		Evaluacion evalArquitecto = new EvaluarArquitecto();
		evalArquitecto = new CriterioExperienciaEspecifica (evalArquitecto);
		evalArquitecto = new CriterioExperienciaGeneral (evalArquitecto);
		evalArquitecto = new CriterioMaestria (evalArquitecto);

		System.out.println(evalArquitecto.getDescription()
			+ " $" + evalArquitecto.cost());
		
		return evalArquitecto.cost();
	}
}
