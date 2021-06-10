package hwo.evtool.propuesta;

import hwo.evtool.evaluacion.Evaluacion;

public class EvaluarPropuestaCompleta {
	public double evaluar () {
		Evaluacion evalPropuesta = new CriterioEvaluacionPropuesta();
		evalPropuesta = new CriterioEvaluacionTecnico(evalPropuesta);
		evalPropuesta = new CriterioEvaluacionProblema(evalPropuesta);
		
		System.out.println (evalPropuesta.getDescription()
			+ " $" + evalPropuesta.cost());
		
		return evalPropuesta.cost();
	}
}

