package hwo.evtool.control.evaluacion;

import java.util.HashMap;
import java.util.Map;


/* plntlla */ public abstract class ControlEvaluacion {
	protected String descripcion = "Control evaluaion";
	protected String[] str_evalData;
	protected Map<Integer, String[]> map_evalData = new HashMap<Integer, String[]>();

	public ControlEvaluacion() {
		// TODO Auto-generated constructor stub
	}

	public void setEntrada (int i, String[] str_entendimiento) {
		map_evalData.put(i, str_entendimiento);
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