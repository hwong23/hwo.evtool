package hwo.evtool.componenteEvaluacion;

import hwo.evtool.comando.Comando;
import hwo.evtool.receptor.evaluacion.EvaluarPropuesta;

public class Cmpnnt_EvaluarPropuesta implements Comando {
	EvaluarPropuesta propuesta;
	String nombre;
	
	public Cmpnnt_EvaluarPropuesta (String[] str_EvaluarPropuesta) {
		this.nombre = "EvaluacionPropuesta";
		this.propuesta = new EvaluarPropuesta(str_EvaluarPropuesta);
	}

	@Override
	public void ejecutar() {
		System.out.println("--- Comando " + this.nombre + " ---");
		
		System.out.println(this.propuesta.getDescription()
				+ " $" + this.propuesta.evaluar());
	}
}

