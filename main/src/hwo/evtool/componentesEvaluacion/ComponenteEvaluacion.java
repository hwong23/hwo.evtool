package hwo.evtool.componentesEvaluacion;

import hwo.evtool.comando.Comando;
import hwo.evtool.evaluaciones.EquipoClave;

public class ComponenteEvaluacion implements Comando {
	EquipoClave equipo;
	
	public ComponenteEvaluacion (EquipoClave equipoClave) {
		this.equipo = equipoClave;
	}

	@Override
	public void ejecutar() {
		this.equipo.evaluar();
	}
}
