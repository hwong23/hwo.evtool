package hwo.evtool.propuesta.tecnica;

import hwo.evtool.evaluacion.Evaluacion;

class CriterioEvaluacionPropuestaTecnica extends Evaluacion {
	private Evaluacion evaluar;
	private String nombre = "Tecnico";
	
	public CriterioEvaluacionPropuestaTecnica (Evaluacion evaluar) {
		this.evaluar = evaluar;
	}

	public String getDescription() {
		return evaluar.getDescription() + ", " + this.nombre;
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
		
		System.out.println("--- " + this.nombre + " " + costo);
		
		return costo + evaluar.cost();	
	}
}
