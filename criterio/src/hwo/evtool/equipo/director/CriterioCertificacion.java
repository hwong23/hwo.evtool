package hwo.evtool.equipo.director;

import hwo.evtool.evaluacion.CriterioEvaluacion;
import hwo.evtool.evaluacion.Evaluacion;

class CriterioCertificacion extends CriterioEvaluacion {
	private Evaluacion evaluar;
	private String nombre = "Certificacion dir";

	public CriterioCertificacion(Evaluacion evaluar) {
		this.evaluar = evaluar;
	}

	public String getDescription() {
		return evaluar.getDescription() + ", " + this.nombre;
	}

	public double cost() {
		String experiencia = Evaluacion.edata.get("experiencia");
		double costo = Double.parseDouble(experiencia) * 2;
		
		System.out.println("--- " + this.nombre + " " + costo);
		return costo + evaluar.cost();
	}
}
