package hwo.evtool.control.evaluacion;

import java.util.Map;


/* plntlla */ public abstract class ControlEvaluacion {
	protected String descripcion = "Control evaluaion";
	protected Map<String, String> evalData;

	public ControlEvaluacion(Map<String, String> str_EvaluarArq) {
		// TODO Auto-generated constructor stub
		this.evalData = str_EvaluarArq;
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