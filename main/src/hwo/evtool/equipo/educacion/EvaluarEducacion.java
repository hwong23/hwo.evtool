package hwo.evtool.equipo.educacion;

import hwo.evtool.evaluacion.Evaluacion;

public class EvaluarEducacion {
	
	public double evaluar() {
		/* compont */ Evaluacion evalEducacion = new CriterioEvaluacionEducacion();
		/* decordr */ evalEducacion = new CriterioExperienciaEspecificaEducacion (evalEducacion);
		/* decordr */ evalEducacion = new CriterioExperienciaGeneralEducacion (evalEducacion);
		/* decordr */ evalEducacion = new CriterioMaestriaEducacion (evalEducacion);
	
		System.out.println(evalEducacion.getDescription()
			+ " $" + evalEducacion.cost());
		
		return evalEducacion.cost();
	}
}
