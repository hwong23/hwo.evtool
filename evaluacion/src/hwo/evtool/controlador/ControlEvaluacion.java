package hwo.evtool.controlador;

/* plntlla */ public abstract class ControlEvaluacion {
	protected String descripcion = "Control evaluaion";
	protected String[] evalData;

	public ControlEvaluacion(String[] str_EvaluarArq) {
		// TODO Auto-generated constructor stub
		this.evalData = str_EvaluarArq;
	}

	private double hk_redondearPuntaje(double puntaje) {
		// TODO Auto-generated method stub
		return puntaje;
	}

	// metodos abstractos
	protected abstract double llamarCriteriosEvaluacion();
	protected abstract String[] escribirDataEvaluacion(String[] evalData);
	

	// metodos finales
	final public String getDescription() {
		return descripcion;
	}

	final public double evaluar() {
		this.evalData = escribirDataEvaluacion(this.evalData);
		double puntaje = llamarCriteriosEvaluacion();
		return hk_redondearPuntaje(puntaje);
	}
}