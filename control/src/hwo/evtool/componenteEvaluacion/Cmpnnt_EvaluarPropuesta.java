package hwo.evtool.componenteEvaluacion;

import hwo.evtool.comando.Comando;
import hwo.evtool.evaluaciones.EvaluarPropuesta;

public class Cmpnnt_EvaluarPropuesta implements Comando {
	EvaluarPropuesta propuesta;
	String nombre;
	
	public Cmpnnt_EvaluarPropuesta (EvaluarPropuesta propuesta) {
		this.nombre = "EvaluacionPropuesta";
		this.propuesta = propuesta;
	}

	@Override
	public void ejecutar() {
		System.out.println("--- Comando " + this.nombre + " ---");
		System.out.println(this.propuesta.getDescription()
				+ " $" + this.propuesta.evaluar());
	}
}

