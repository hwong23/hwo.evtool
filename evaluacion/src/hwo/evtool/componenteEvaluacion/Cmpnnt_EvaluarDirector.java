package hwo.evtool.componenteEvaluacion;

import hwo.evtool.comando.Comando;
import hwo.evtool.equipo.director.EvaluarDirector;

public class Cmpnnt_EvaluarDirector implements Comando {
	String nombre;
	/* receptor */ EvaluarDirector director;
	
	public Cmpnnt_EvaluarDirector (String[] str_EvaluarDir) {
		this.nombre = "EvaluacionDirector";
		this.director = new EvaluarDirector (str_EvaluarDir);
	}

	@Override
	public void ejecutar() {
		System.out.println("--- Comando " + this.nombre + " ---");
		
		System.out.println(this.director.getDescription()
				+ " $" + this.director.evaluar());
	}
}
