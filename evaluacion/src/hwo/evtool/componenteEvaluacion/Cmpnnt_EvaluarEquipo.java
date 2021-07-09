package hwo.evtool.componenteEvaluacion;

import hwo.evtool.comando.Comando;
import hwo.evtool.receptor.evaluacion.EvaluarEquipo;


public class Cmpnnt_EvaluarEquipo implements Comando {
	String nombre;
	/* receptor */ EvaluarEquipo equipo;
	
	public Cmpnnt_EvaluarEquipo (String[] str_EvaluarEquipo) {
		 
		this.nombre = "EvaluacionEquipo";
		this.equipo = new EvaluarEquipo(str_EvaluarEquipo);
	}

	@Override
	public void ejecutar() {
		System.out.println("--- Comando " + this.nombre + " ---");
		
		System.out.println(this.equipo.getDescription()
				+ " $" + this.equipo.evaluar());
	}
}
