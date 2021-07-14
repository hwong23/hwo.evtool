package hwo.evtool.propuesta.problema;

import hwo.evtool.evaluacion.CriterioEvaluacion;
import hwo.evtool.evaluacion.Evaluacion;

class CriterioEvaluacionPropuestaProblema extends CriterioEvaluacion {
	Evaluacion evaluar;
	
	public CriterioEvaluacionPropuestaProblema (Evaluacion evaluar) {
		this.evaluar = evaluar;
	}

	public String getDescription() {
		return evaluar.getDescription() + ", Problema";
	}

	public double cost() {
		return Evaluacion.edata[1].equals("S") ? 0 :  
			Double.parseDouble(Evaluacion.edata[1]) / 
			Double.parseDouble(Evaluacion.edata[2]) + 
			evaluar.cost();
	}
}
