package hwo.evtool.propuesta.problema;

import hwo.evtool.evaluacion.CriterioEvaluacion;
import hwo.evtool.evaluacion.Evaluacion;

class CriterioEvaluacionPropuestaProblema extends CriterioEvaluacion {
	private Evaluacion evaluar;
	private String nombre = "Problema";
	
	public CriterioEvaluacionPropuestaProblema (Evaluacion evaluar) {
		this.evaluar = evaluar;
	}

	public String getDescription() {
		return evaluar.getDescription() + ", Problema";
	}

	public double cost() {
		double costo = 0.0;
		for (int i = 1; i <= Evaluacion.edata.size() - 2; i++) {
			switch (Evaluacion.edata.get("i"+i)) {
			case "A" : costo += 1.85;
			case "M" : costo += 1.2;
			case "B" : costo += 1.0;
			}
		}
		
		System.out.println("--- " + this.nombre  + " " + costo);
		return costo + evaluar.cost();	
	}
}
