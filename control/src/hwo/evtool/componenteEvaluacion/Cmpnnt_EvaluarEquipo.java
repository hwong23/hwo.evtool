package hwo.evtool.componenteEvaluacion;

import hwo.evtool.comando.Comando;
import hwo.evtool.evaluaciones.EvaluarEquipo;

public class Cmpnnt_EvaluarEquipo implements Comando {
	EvaluarEquipo equipo;
	String nombre;
	
	public Cmpnnt_EvaluarEquipo (EvaluarEquipo equipoClave) {
		this.nombre = "EvaluacionEquipo";
		this.equipo = equipoClave;
	}

	@Override
	public void ejecutar() {
		System.out.println("--- Comando " + this.nombre + " ---");
		System.out.println(this.equipo.getDescription()
				+ " $" + this.equipo.evaluar());
	}
}
