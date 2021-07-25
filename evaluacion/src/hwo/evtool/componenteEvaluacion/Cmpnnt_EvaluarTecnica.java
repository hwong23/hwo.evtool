package hwo.evtool.componenteEvaluacion;

import hwo.evtool.comando.Comando;
import hwo.evtool.propuesta.tecnica.EvaluarTecnica;


public class Cmpnnt_EvaluarTecnica implements Comando {
	String nombre;
	/* receptor */ EvaluarTecnica tecnica;
	
	public Cmpnnt_EvaluarTecnica (String[] str_EvaluarEquipo) {
		this.nombre = "EvaluacionTecnica";
		this.tecnica = new EvaluarTecnica(str_EvaluarEquipo);
	}

	@Override
	public double ejecutar() {
		double costo = this.tecnica.evaluar();
		
		System.out.println("--- Comando " + this.nombre + " ---");
		System.out.println(this.tecnica.getDescription()
				+ " $" + this.tecnica.evaluar());
		
		return costo;
	}
}
