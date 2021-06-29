package hwo.evtool.componenteEvaluacion;

import hwo.evtool.comando.Comando;
import hwo.evtool.evaluaciones.EvaluarEquipo;

public class ComponenteEvaluacionEquipo implements Comando {
	EvaluarEquipo equipo;
	String nombre;
	
	public ComponenteEvaluacionEquipo (EvaluarEquipo equipoClave) {
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
