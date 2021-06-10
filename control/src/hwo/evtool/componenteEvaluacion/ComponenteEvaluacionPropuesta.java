package hwo.evtool.componenteEvaluacion;

import hwo.evtool.comando.Comando;
import hwo.evtool.evaluaciones.EvaluarPropuesta;

public class ComponenteEvaluacionPropuesta implements Comando {
	EvaluarPropuesta propuesta;
	
	public ComponenteEvaluacionPropuesta (EvaluarPropuesta propuesta) {
		this.propuesta = propuesta;
	}

	@Override
	public void ejecutar() {
		System.out.println("--- Control ---");
		System.out.println(this.propuesta.getDescription()
				+ " $" + this.propuesta.evaluar());
	}
}

