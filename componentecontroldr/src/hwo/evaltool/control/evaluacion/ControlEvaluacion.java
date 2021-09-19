package hwo.evaltool.control.evaluacion;


/* plntlla */ public abstract class ControlEvaluacion {
	protected String descripcion = "Control evaluaion";
	protected String[] str_evalData;

	public ControlEvaluacion(String[] evaldata) {
		// TODO Auto-generated constructor stub
		this.str_evalData = evaldata;
	}

	private double hk_redondearPuntaje(double puntaje) {
		// TODO Auto-generated method stub
		return puntaje;
	}
	
	protected void hk_adaptacion () {
		System.out.println ("super.hk_adaptacion");
	}

	// metodos abstractos
	protected abstract double llamarComponentesEvaluacion();
	

	// metodos finales
	final public String getDescription() {
		return descripcion;
	}

	public double evaluar() {
		hk_adaptacion ();
		double puntaje = llamarComponentesEvaluacion();
		return hk_redondearPuntaje(puntaje);
	}
}