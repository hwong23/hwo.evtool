package hwo.evtool.propuesta;

import hwo.evtool.evaluacion.Evaluacion;

public class EvaluarPropuestaCompleta {
	String[] edata;
	
	public double evaluar () {
		/* compont */ Evaluacion evalPropuesta = new CriterioEvaluacionPropuesta(edata);
		/* decordr */ evalPropuesta = new CriterioEvaluacionTecnico(evalPropuesta);
		/* decordr */ evalPropuesta = new CriterioEvaluacionProblema(evalPropuesta);
		
		System.out.println (evalPropuesta.getDescription()
			+ " $" + evalPropuesta.cost());
		
		return evalPropuesta.cost();
	}
}

