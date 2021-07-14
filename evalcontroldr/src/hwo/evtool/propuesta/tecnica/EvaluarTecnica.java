package hwo.evtool.propuesta.tecnica;

import hwo.evtool.evaluacion.Evaluacion;

public class EvaluarTecnica {
	String[] edata;

	public EvaluarTecnica(String[] evalData) {
		// TODO Auto-generated constructor stub
		this.edata = evalData;
	}

	public double evaluar () {
		/* compont */ Evaluacion evalPropuesta = new CriterioEvaluacionTecnica(edata);
		/* decordr */ evalPropuesta = new CriterioEvaluacionPropuestaTecnica(evalPropuesta);
		
		System.out.println (evalPropuesta.getDescription()
			+ " $" + evalPropuesta.cost());
		
		return evalPropuesta.cost();
	}

}
