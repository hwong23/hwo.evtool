package hwo.evtool.componenteEvaluacion;

import hwo.evtool.comando.Comando;
import hwo.evtool.propuesta.problema.EvaluarProblema;


public class Cmpnnt_EvaluarProblema implements Comando {
	String nombre;
	/* receptor */ EvaluarProblema problema;
	
	public Cmpnnt_EvaluarProblema (String[] str_EvaluarProblema) {
		 
		this.nombre = "EvaluacionProblema";
		this.problema = new EvaluarProblema(str_EvaluarProblema);
	}

	@Override
	public double ejecutar() {
		double costo = this.problema.evaluar();
		
		System.out.println("--- Comando " + this.nombre + " ---");
		System.out.println(this.problema.getDescription()
				+ " $" + this.problema.evaluar());
		
		return costo;
	}
}
