package hwo.evtool.componenteEvaluacion;

import hwo.evtool.comando.Comando;
import hwo.evtool.equipo.educacion.AdaptadorCriterioEducacion;
import hwo.evtool.equipo.educacion.EvaluarEducacion;


public class Cmpnnt_EvaluarEducacion implements Comando {
	String nombre;
	String[] evaldata;
	/* receptor */ EvaluarEducacion educacion;
	
	public Cmpnnt_EvaluarEducacion (String[] dataeval) {
		this.nombre = "EvaluacionEducacion";
		this.evaldata = dataeval;
	}

	@Override
	public double ejecutar() {
		/* adaptadr */ AdaptadorCriterioEducacion adaptd = new AdaptadorCriterioEducacion(this.evaldata);
		/* contrldr */ this.educacion = new EvaluarEducacion(adaptd);

		
		System.out.println("--- Comando " + this.nombre + " ---");
		double costo = this.educacion.evaluar();
		System.out.println(this.educacion.getDescription()
				+ " $" + this.educacion.evaluar());
		
		return costo;
	}

}
