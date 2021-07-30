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
		return Evaluacion.edata[2].equals("A") ? 2.0 : 0.5;
	}
}
