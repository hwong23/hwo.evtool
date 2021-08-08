package hwo.evtool.control.evaluacion;

import hwo.evtool.dataeval.DataEvaluacion;

/* plntlla */ public abstract class ControlEvaluacion {
	protected String descripcion = "Control evaluaion";
	protected DataEvaluacion evalData;

	public ControlEvaluacion(DataEvaluacion evaldata) {
		// TODO Auto-generated constructor stub
		this.evalData = evaldata;
	}

	private double hk_redondearPuntaje(double puntaje) {
		// TODO Auto-generated method stub
		return puntaje;
	}

	// metodos abstractos
	protected abstract double llamarCriteriosEvaluacion();
	

	// metodos finales
	final public String getDescription() {
		return descripcion;
	}

	final public double evaluar() {
		double puntaje = llamarCriteriosEvaluacion();
		return hk_redondearPuntaje(puntaje);
	}
}