package hwo.evtool.componenteEvaluacion;

import hwo.evtool.comando.Comando;
import hwo.evtool.equipo.director.AdaptadorCriterioDirector;
import hwo.evtool.equipo.director.EvaluarDirector;


public class Cmpnnt_EvaluarDirector implements Comando {
	String nombre;
	String[] evaldata;
	/* receptor */ EvaluarDirector director;
	
	public Cmpnnt_EvaluarDirector (String[] dataeval) {
		this.nombre = "EvaluacionDirector";
		this.evaldata = dataeval;
	}

	@Override
	public double ejecutar() {
		/* adaptadr */ AdaptadorCriterioDirector adaptd = new AdaptadorCriterioDirector(this.evaldata);
		/* contrldr */ this.director = new EvaluarDirector(adaptd);

		
		System.out.println("--- Comando " + this.nombre + " ---");
		double costo = this.director.evaluar();
		System.out.println(this.director.getDescription()
				+ " $" + this.director.evaluar());
		
		return costo;
	}
}
