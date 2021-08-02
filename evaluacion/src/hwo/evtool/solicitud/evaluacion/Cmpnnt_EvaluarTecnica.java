package hwo.evtool.solicitud.evaluacion;

import hwo.evtool.comando.Comando;
import hwo.evtool.criterio.tecnica.EvaluarTecnica;
import hwo.evtool.dataeval.AdaptadorCriterioTecnica;


public class Cmpnnt_EvaluarTecnica implements Comando {
	String nombre;
	String[] evaldata;
	/* receptor */ EvaluarTecnica tecnica;
	
	public Cmpnnt_EvaluarTecnica (String[] dataeval) {
		this.nombre = "EvaluacionTecnica";
		this.evaldata = dataeval;
	}

	@Override
	public double ejecutar() {
		/* adaptadr */ evaldata = new AdaptadorCriterioTecnica().escribirEvaluacion(this.evaldata);
		this.tecnica = new EvaluarTecnica(this.evaldata);

		System.out.println("--- Comando " + this.nombre + " ---");
		double costo = this.tecnica.evaluar();
		System.out.println(this.tecnica.getDescription()
				+ " $" + costo);
		
		return costo;
	}
}
