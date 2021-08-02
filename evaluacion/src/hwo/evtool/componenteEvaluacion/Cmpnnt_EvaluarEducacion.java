package hwo.evtool.componenteEvaluacion;

import hwo.evtool.comando.Comando;
import hwo.evtool.criterio.educacion.EvaluarEducacion;
import hwo.evtool.dataeval.AdaptadorCriterioEducacion;


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
		/* adaptadr */ evaldata = new AdaptadorCriterioEducacion().escribirEvaluacion(this.evaldata);
		this.educacion = new EvaluarEducacion (this.evaldata);
		
		System.out.println("--- Comando " + this.nombre + " ---");
		double costo = this.educacion.evaluar();
		System.out.println(this.educacion.getDescription()
				+ " $" + this.educacion.evaluar());
		
		return costo;
	}

}
