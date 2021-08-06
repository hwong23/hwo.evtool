package hwo.evtool.componenteEvaluacion;

import hwo.evtool.comando.Comando;
import hwo.evtool.equipo.arquitecto.AdaptadorCriterioArquitecto;
import hwo.evtool.equipo.arquitecto.EvaluarArquitecto;


public class Cmpnnt_EvaluarArquitecto implements Comando {
	String nombre;
	String[] evaldata;
	/* receptor */ EvaluarArquitecto arquitecto;
	
	public Cmpnnt_EvaluarArquitecto (String[] dataeval) {
		this.nombre = "EvaluacionEquipo";
		this.evaldata = dataeval;
	}

	@Override
	public double ejecutar() {
		/* contrldr */ this.arquitecto = new EvaluarArquitecto (
		/* adaptadr */ new AdaptadorCriterioArquitecto().escribirEvaluacion(this.evaldata)
		);

		System.out.println("--- Comando " + this.nombre + " ---");
		double costo = this.arquitecto.evaluar();
		System.out.println(this.arquitecto.getDescription()
				+ " $" + costo);
		
		return costo;
	}
}
