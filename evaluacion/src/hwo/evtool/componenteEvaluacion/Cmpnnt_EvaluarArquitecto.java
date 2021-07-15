package hwo.evtool.componenteEvaluacion;

import hwo.evtool.comando.Comando;
import hwo.evtool.equipo.arquitecto.EvaluarArquitecto;


public class Cmpnnt_EvaluarArquitecto implements Comando {
	String nombre;
	/* receptor */ EvaluarArquitecto arquitecto;
	
	public Cmpnnt_EvaluarArquitecto (String[] str_EvaluarArq) {
		 
		this.nombre = "EvaluacionEquipo";
		this.arquitecto = new EvaluarArquitecto (str_EvaluarArq);
	}

	@Override
	public void ejecutar() {
		System.out.println("--- Comando " + this.nombre + " ---");
		
		System.out.println(this.arquitecto.getDescription()
				+ " $" + this.arquitecto.evaluar());
	}
}
