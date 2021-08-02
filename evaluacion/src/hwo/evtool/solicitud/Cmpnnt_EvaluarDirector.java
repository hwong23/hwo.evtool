package hwo.evtool.solicitud;

import hwo.evtool.comando.Comando;
import hwo.evtool.criterio.director.EvaluarDirector;
import hwo.evtool.dataeval.AdaptadorCriterioDirector;


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
		/* adaptadr */ evaldata = new AdaptadorCriterioDirector().escribirEvaluacion(this.evaldata);
		this.director = new EvaluarDirector (this.evaldata);
		
		System.out.println("--- Comando " + this.nombre + " ---");
		double costo = this.director.evaluar();
		System.out.println(this.director.getDescription()
				+ " $" + this.director.evaluar());
		
		return costo;
	}
}