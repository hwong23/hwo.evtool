package hwo.evtool.propuesta.problema;

import hwo.evtool.evaluacion.Evaluacion;

public class EvaluarProblema {
	String[] edata;
	
	public EvaluarProblema(String[] evalData) {
		this.edata = evalData;
	}

	public double evaluar () {
		/* compont */ Evaluacion evalPropuesta = new CriterioEvaluacionProblema(edata);
		/* decordr */ evalPropuesta = new CriterioEvaluacionPropuestaProblema(evalPropuesta);
		
		System.out.println (evalPropuesta.getDescription()
			+ " $" + evalPropuesta.cost());
		
		return evalPropuesta.cost();
	}
}

