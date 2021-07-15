package hwo.evtool.componenteEvaluacion;

import hwo.evtool.comando.Comando;
import hwo.evtool.propuesta.problema.EvaluarProblema;


public class Cmpnnt_EvaluarEquipo implements Comando {
	String nombre;
	/* receptor */ EvaluarProblema problema;
	
	public Cmpnnt_EvaluarEquipo (String[] str_EvaluarEquipo) {
		 
		this.nombre = "EvaluacionEquipo";
		this.problema = new EvaluarProblema(str_EvaluarEquipo);
	}

	@Override
	public void ejecutar() {
		System.out.println("--- Comando " + this.nombre + " ---");
		
		System.out.println(this.problema.getDescription()
				+ " $" + this.problema.evaluar());
	}
}
