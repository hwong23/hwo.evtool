package hwo.evtool.equipo.director;

import hwo.evtool.evaluacion.CriterioEvaluacion;
import hwo.evtool.evaluacion.Evaluacion;

class CriterioFormacionDirector extends CriterioEvaluacion {
	private Evaluacion evaluar;
	private String nombre = "Maestria/Doctorado dir";

	public CriterioFormacionDirector(Evaluacion evaluar) {
		this.evaluar = evaluar;
	}

	public String getDescription() {
		return evaluar.getDescription() + ", " + this.nombre;
	}

	public double cost() {
		Double costo = 0.0; 
		int formacion = Integer.parseInt( Evaluacion.edata.get("formacion") );
		
		if (formacion > 1) costo = 8.0;
		else if (formacion == 1) costo = Double.parseDouble(Evaluacion.edata.get("formacion"));
		
		System.out.println("--- " + this.nombre + " " + costo);
		return costo + evaluar.cost();
	}
}