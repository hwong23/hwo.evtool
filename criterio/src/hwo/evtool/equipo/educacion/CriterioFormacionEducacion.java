package hwo.evtool.equipo.educacion;

import hwo.evtool.evaluacion.CriterioEvaluacion;
import hwo.evtool.evaluacion.Evaluacion;

class CriterioFormacionEducacion extends CriterioEvaluacion {
	private Evaluacion evaluar;
	private String nombre = "Maestria/Doctorado edu";

	public CriterioFormacionEducacion(Evaluacion evaluar) {
		this.evaluar = evaluar;
	}

	public String getDescription() {
		return evaluar.getDescription() + ", " + this.nombre;
	}

	public double cost() {
		Double costo = 0.0; 
		String formacion = Evaluacion.edata.get("formacion");
		
		if (formacion.equals("Especializacion")) costo = 1.0;
		else if (formacion.equals("Maestria")) costo = 2.0;
		else if (formacion.equals("Doctorado")) costo = 8.0;
		
		System.out.println("--- " + this.nombre + " " + costo);
		return costo + evaluar.cost();
	}
}
