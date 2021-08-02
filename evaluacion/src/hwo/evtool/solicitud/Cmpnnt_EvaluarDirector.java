package hwo.evtool.solicitud;

import hwo.evtool.comando.Comando;
<<<<<<< HEAD:evaluacion/src/hwo/evtool/solicitud/Cmpnnt_EvaluarDirector.java
import hwo.evtool.criterio.director.EvaluarDirector;
import hwo.evtool.dataeval.AdaptadorCriterioDirector;
=======
import hwo.evtool.equipo.director.EvaluarDirector;
>>>>>>> parent of dbebb80 (adaptador --6):evaluacion/src/hwo/evtool/componenteEvaluacion/Cmpnnt_EvaluarDirector.java

public class Cmpnnt_EvaluarDirector implements Comando {
	String nombre;
	/* receptor */ EvaluarDirector director;
	
	public Cmpnnt_EvaluarDirector (String[] str_EvaluarDir) {
		this.nombre = "EvaluacionDirector";
		this.director = new EvaluarDirector (str_EvaluarDir);
	}

	@Override
	public double ejecutar() {
		double costo = this.director.evaluar();
		
		System.out.println("--- Comando " + this.nombre + " ---");
		System.out.println(this.director.getDescription()
				+ " $" + this.director.evaluar());
		
		return costo;
	}
}
