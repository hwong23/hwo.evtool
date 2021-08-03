package hwo.evtool.solicitud;

import hwo.evtool.comando.Comando;
import hwo.evtool.criterio.director.EvaluarDirector;

public class Cmpnnt_EvaluarDirector implements Comando {
	String nombre;
	/* receptor */ EvaluarDirector director;
	
	public Cmpnnt_EvaluarDirector (String[] str_EvaluarDir) {
		this.nombre = "EvaluacionDirector";
		this.director = new EvaluarDirector (str_EvaluarDir);
	}

	@Override
	public double ejecutar() {
		double costo = this.director.evaluar();
		
		System.out.println("--- Comando " + this.nombre + " ---");
		System.out.println(this.director.getDescription()
				+ " $" + this.director.evaluar());
		
		return costo;
	}
}
