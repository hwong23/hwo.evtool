package hwo.evtool.componenteEvaluacion;

import hwo.evtool.comando.Comando;
import hwo.evtool.propuesta.problema.AdaptadorCriterioProblema;
import hwo.evtool.propuesta.problema.EvaluarProblema;


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
		/* contrldr */ this.problema = new EvaluarProblema(
		/* adaptadr */ new AdaptadorCriterioProblema().escribirEvaluacion(evaldata)
		);

		System.out.println("--- Comando " + this.nombre + " ---");
		double costo = this.problema.evaluar();
		System.out.println(this.problema.getDescription()
				+ " $" + costo);
		
		return costo; 
	}
}
