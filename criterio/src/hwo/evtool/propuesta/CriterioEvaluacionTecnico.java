package hwo.evtool.propuesta;

import hwo.evtool.evaluacion.Evaluacion;

class CriterioEvaluacionTecnico extends Evaluacion {
	Evaluacion evaluar;
	
	public CriterioEvaluacionTecnico (Evaluacion evaluar) {
		this.evaluar = evaluar;
	}

	public String getDescription() {
		return evaluar.getDescription() + ", Técnico";
	}

	public double cost() {
//		return Evaluacion.edata[1].equals("S") ? 0.35:0 + evaluar.cost();
		return 
			Evaluacion.edata[1].equals("S") ? 0 : 
				Double.parseDouble(Evaluacion.edata[1]) / 
				Double.parseDouble(Evaluacion.edata[2]) + 
				evaluar.cost();
	}
}
