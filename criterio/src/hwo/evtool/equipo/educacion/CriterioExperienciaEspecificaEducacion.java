package hwo.evtool.equipo.educacion;

import hwo.evtool.evaluacion.CriterioEvaluacion;
import hwo.evtool.evaluacion.Evaluacion;

class CriterioExperienciaEspecificaEducacion extends CriterioEvaluacion {
	private Evaluacion evaluar;
	private String nombre = "Experiencia especifica";

	public CriterioExperienciaEspecificaEducacion(Evaluacion evaluar) {
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
