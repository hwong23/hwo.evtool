package hwo.evtool.componentesEvaluacion;

import hwo.evtool.comando.Comando;
import hwo.evtool.evaluaciones.EvaluarEquipo;

public class ComponenteEvaluacion implements Comando {
	EvaluarEquipo equipo;
	
	public ComponenteEvaluacion (EvaluarEquipo equipoClave) {
		this.equipo = equipoClave;
	}

	@Override
	public void ejecutar() {
		this.equipo.evaluar();
	}
}
