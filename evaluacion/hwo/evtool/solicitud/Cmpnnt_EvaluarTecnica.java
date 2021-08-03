package hwo.evtool.solicitud;

import hwo.evtool.comando.Comando;
import hwo.evtool.criterio.tecnica.EvaluarTecnica;


public class Cmpnnt_EvaluarTecnica implements Comando {
	String nombre;
	/* receptor */ EvaluarTecnica tecnica;
	
	public Cmpnnt_EvaluarTecnica (String[] str_EvaluarEquipo) {
		this.nombre = "EvaluacionTecnica";
		this.tecnica = new EvaluarTecnica(str_EvaluarEquipo);
	}

	@Override
	public double ejecutar() {
		System.out.println("--- Comando " + this.nombre + " ---");
		double costo = this.tecnica.evaluar();
		System.out.println(this.tecnica.getDescription()
				+ " $" + costo);
		
		return costo;
	}
}
