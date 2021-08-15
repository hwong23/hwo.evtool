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
		double cost = 0.0;
		for (int i = 1; i <= Evaluacion.edata.size() - 2; i++) {
			switch (Evaluacion.edata.get("i"+i)) {
			case "A" : cost += 1.85;
			case "M" : cost += 1.2;
			case "B" : cost += 1.0;
			}
		}
		
		return cost;	
	}
}
