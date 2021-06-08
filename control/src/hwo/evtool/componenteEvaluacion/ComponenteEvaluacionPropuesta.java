package hwo.evtool.componenteEvaluacion;

import hwo.evtool.comando.Comando;
import hwo.evtool.evaluaciones.EvaluarPropuesta;

public class ComponenteEvaluacionPropuesta implements Comando {
	EvaluarPropuesta equipo;
	
	public ComponenteEvaluacionPropuesta (EvaluarPropuesta equipoClave) {
		this.equipo = equipoClave;
	}

	@Override
	public void ejecutar() {
		System.out.println("--- Control ---");
		System.out.println(this.equipo.getDescription()
				+ " $" + this.equipo.evaluar());
	}
}

