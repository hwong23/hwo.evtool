package hwo.evtool.control.componente;


/* plntlla */ public abstract class ControlComponente {
	protected String descripcion = "Control evaluaion";
	protected String[] str_evalData;

	public ControlComponente(String[] evaldata) {
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
	protected abstract double llamarCriteriosEvaluacion();
	

	// metodos finales
	final public String getDescription() {
		return descripcion;
	}

	public double evaluar() {
		hk_adaptacion ();
		double puntaje = llamarCriteriosEvaluacion();
		return hk_redondearPuntaje(puntaje);
	}
}