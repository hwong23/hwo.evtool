package hwo.evtool.propuesta;

import hwo.evtool.evaluacion.CriterioEvaluacion;
import hwo.evtool.evaluacion.Evaluacion;

class CriterioEvaluacionProblema extends CriterioEvaluacion {
	Evaluacion evaluar;
	
	public CriterioEvaluacionProblema (Evaluacion evaluar) {
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
