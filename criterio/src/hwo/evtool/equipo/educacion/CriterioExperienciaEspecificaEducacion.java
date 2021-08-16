package hwo.evtool.equipo.educacion;

import hwo.evtool.evaluacion.CriterioEvaluacion;
import hwo.evtool.evaluacion.Evaluacion;

class CriterioExperienciaEspecificaEducacion extends CriterioEvaluacion {
	Evaluacion evaluar;

	public CriterioExperienciaEspecificaEducacion(Evaluacion evaluar) {
		this.evaluar = evaluar;
	}

	public String getDescription() {
		return evaluar.getDescription() + ", Experiencia especifica";
	}

	public double cost() {
		String experiencia = Evaluacion.edata.get("experiencia");
		double costo = Double.parseDouble(experiencia) * 2;
		
		return costo + evaluar.cost();
	}
}
