package hwo.evtool.solicitud;

import hwo.evtool.comando.Comando;
import hwo.evtool.criterio.problema.EvaluarProblema;
import hwo.evtool.dataeval.AdaptadorCriterioProblema;


public class Cmpnnt_EvaluarProblema implements Comando {
	String nombre;
	/* receptor */ EvaluarProblema problema;
	String[] evaldata;
	
	public Cmpnnt_EvaluarProblema (String[] datadata) {
		this.nombre = "EvaluacionProblema";
		this.evaldata = datadata;
	}

	@Override
	public double ejecutar() {
		/* adaptadr */ evaldata = new AdaptadorCriterioProblema().escribirEvaluacion(evaldata);
		this.problema = new EvaluarProblema(evaldata);

		System.out.println("--- Comando " + this.nombre + " ---");
		double costo = this.problema.evaluar();
		System.out.println(this.problema.getDescription()
				+ " $" + costo);
		
		return costo;
	}
}
