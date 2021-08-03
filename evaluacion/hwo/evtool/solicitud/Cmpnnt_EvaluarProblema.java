package hwo.evtool.solicitud;

import hwo.evtool.comando.Comando;
import hwo.evtool.criterio.problema.EvaluarProblema;

public class Cmpnnt_EvaluarProblema implements Comando {
	String nombre;
	/* receptor */ EvaluarProblema problema;
	
	public Cmpnnt_EvaluarProblema (String[] str_EvaluarProblema) {
		 
		this.nombre = "EvaluacionProblema";
		this.problema = new EvaluarProblema(str_EvaluarProblema);
	}

	@Override
	public double ejecutar() {
		System.out.println("--- Comando " + this.nombre + " ---");
		double costo = this.problema.evaluar();
		System.out.println(this.problema.getDescription()
				+ " $" + costo);
		
		return costo;
	}
}
