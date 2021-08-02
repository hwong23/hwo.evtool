package hwo.evtool.solicitud.evaluacion;

import hwo.evtool.comando.Comando;
import hwo.evtool.criterio.arquitecto.EvaluarArquitecto;
import hwo.evtool.dataeval.AdaptadorCriterioArquitecto;


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
		/* adaptadr */ evaldata = new AdaptadorCriterioArquitecto().escribirEvaluacion(this.evaldata);
		this.arquitecto = new EvaluarArquitecto (this.evaldata);

		System.out.println("--- Comando " + this.nombre + " ---");
		double costo = this.arquitecto.evaluar();
		System.out.println(this.arquitecto.getDescription()
				+ " $" + costo);
		
		return costo;
	}
}
