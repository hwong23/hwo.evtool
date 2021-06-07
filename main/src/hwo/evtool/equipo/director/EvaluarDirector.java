package hwo.evtool.equipo.director;

import hwo.evtool.evaluacion.Evaluacion;

public class EvaluarDirector {

	public double evaluar() {
		Evaluacion evalDirector = new CriterioEvaluacionDirector();
		evalDirector = new CriterioExperienciaEspecificaDirector (evalDirector);
		evalDirector = new CriterioExperienciaGeneralDirector (evalDirector);
		evalDirector = new CriterioMaestriaDirector (evalDirector);

		System.out.println(evalDirector.getDescription()
			+ " $" + evalDirector.cost());
		
		return evalDirector.cost();
	}
}
