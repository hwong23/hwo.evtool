package hwo.evtool.solicitud;

import hwo.evtool.comando.Comando;
<<<<<<< HEAD:evaluacion/src/hwo/evtool/solicitud/Cmpnnt_EvaluarEducacion.java
import hwo.evtool.criterio.educacion.EvaluarEducacion;
import hwo.evtool.dataeval.AdaptadorCriterioEducacion;
=======
import hwo.evtool.equipo.educacion.EvaluarEducacion;
>>>>>>> parent of dbebb80 (adaptador --6):evaluacion/src/hwo/evtool/componenteEvaluacion/Cmpnnt_EvaluarEducacion.java

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
