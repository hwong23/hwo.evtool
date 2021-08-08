package hwo.evtool.equipo.arquitecto;

import java.util.HashMap;
import java.util.Map;

import hwo.evtool.dataeval.DataEvaluacion;

public class AdaptadorCriterioArquitecto implements DataEvaluacion {
	Map<String, String> dataArquitecto = new HashMap<String, String>(); 
	String name; 
	
	public AdaptadorCriterioArquitecto() {
		this.name = "AdaptadorCriterioArquitecto";
	}

	@Override
	public String leerEvaluacion() {
		return
			dataArquitecto.get("i0") + ", " + 
			dataArquitecto.get("i1") + ", " +
			dataArquitecto.get("i2");
	}

	@Override
	public void  escribirEvaluacion(String[] dataeval) {

	}
}
