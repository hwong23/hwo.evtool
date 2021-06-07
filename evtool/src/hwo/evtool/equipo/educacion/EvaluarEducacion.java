package hwo.evtool.equipo.educacion;

import hwo.evtool.evaluacion.Evaluacion;

public class EvaluarEducacion {
	
	public double evaluar() {
		Evaluacion evalEducacion = new CriterioEvaluacionEducacion();
		evalEducacion = new CriterioExperienciaEspecificaEducacion (evalEducacion);
		evalEducacion = new CriterioExperienciaGeneralEducacion (evalEducacion);
		evalEducacion = new CriterioMaestriaEducacion (evalEducacion);
	
		System.out.println(evalEducacion.getDescription()
			+ " $" + evalEducacion.cost());
		
		return evalEducacion.cost();
	}
}
