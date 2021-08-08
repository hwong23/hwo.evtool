package hwo.evtool.componenteEvaluacion;

import hwo.evtool.comando.Comando;
import hwo.evtool.propuesta.tecnica.AdaptadorCriterioTecnica;
import hwo.evtool.propuesta.tecnica.EvaluarTecnica;


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
		/* adaptadr */ AdaptadorCriterioTecnica adaptd = new AdaptadorCriterioTecnica(evaldata);
		/* contrldr */ this.tecnica = new EvaluarTecnica(adaptd);

		System.out.println("--- Comando " + this.nombre + " ---");
		double costo = this.tecnica.evaluar();
		System.out.println(this.tecnica.getDescription()
				+ " $" + costo);
		
		return costo;
	}
}
