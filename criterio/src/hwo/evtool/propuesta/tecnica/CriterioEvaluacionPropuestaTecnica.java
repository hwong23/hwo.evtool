package hwo.evtool.propuesta.tecnica;

import hwo.evtool.evaluacion.Evaluacion;

class CriterioEvaluacionPropuestaTecnica extends Evaluacion {
	Evaluacion evaluar;
	
	public CriterioEvaluacionPropuestaTecnica (Evaluacion evaluar) {
		this.evaluar = evaluar;
	}

	public String getDescription() {
		return evaluar.getDescription() + ", Tecnico";
	}

	public double cost() {
		double costo = 0.0;
		for (int i = 1; i <= Evaluacion.edata.size() - 2; i++) {
			switch (Evaluacion.edata.get("i"+i)) {
			case "A" : costo += 1.5;
			case "M" : costo += 1.0;
			case "B" : costo += 0.25;
			}
		}
		
		return costo + evaluar.cost();	
	}
}
