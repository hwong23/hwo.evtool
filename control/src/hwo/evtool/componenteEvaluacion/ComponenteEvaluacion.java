package hwo.evtool.componenteEvaluacion;

import hwo.evtool.comando.Comando;
import hwo.evtool.evaluaciones.EvaluarEquipo;

public class ComponenteEvaluacion implements Comando {
	EvaluarEquipo equipo;
	
	public ComponenteEvaluacion (EvaluarEquipo equipoClave) {
		this.equipo = equipoClave;
	}

	@Override
	public void ejecutar() {
		System.out.println("--- Control ---");
		System.out.println(this.equipo.getDescription()
				+ " $" + this.equipo.evaluar());
	}
}
