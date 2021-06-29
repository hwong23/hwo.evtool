package hwo.evtool.equipo.director;

import hwo.evtool.evaluacion.Evaluacion;

public class EvaluarDirector {

	public double evaluar() {
		/* compont */ Evaluacion evalDirector = new CriterioEvaluacionDirector();
		/* decordr */ evalDirector = new CriterioExperienciaEspecificaDirector (evalDirector);
		/* decordr */ evalDirector = new CriterioExperienciaGeneralDirector (evalDirector);
		/* decordr */ evalDirector = new CriterioMaestriaDirector (evalDirector);

		System.out.println(evalDirector.getDescription()
			+ " $" + evalDirector.cost());
		
		return evalDirector.cost();
	}
}
