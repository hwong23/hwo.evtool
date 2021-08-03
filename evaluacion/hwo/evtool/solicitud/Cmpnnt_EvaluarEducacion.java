package hwo.evtool.solicitud;

import hwo.evtool.comando.Comando;
import hwo.evtool.criterio.educacion.EvaluarEducacion;

public class Cmpnnt_EvaluarEducacion implements Comando {
	String nombre;
	/* receptor */ EvaluarEducacion educacion;
	
	public Cmpnnt_EvaluarEducacion (String[] str_EvaluarEduc) {
		 
		this.nombre = "EvaluacionEducacion";
		this.educacion = new EvaluarEducacion (str_EvaluarEduc);
	}

	@Override
	public double ejecutar() {
		double costo = this.educacion.evaluar();
		
		System.out.println("--- Comando " + this.nombre + " ---");
		System.out.println(this.educacion.getDescription()
				+ " $" + this.educacion.evaluar());
		
		return costo;
	}

}
