package hwo.evtool.solicitud;

import hwo.evtool.comando.Comando;
<<<<<<< HEAD:evaluacion/src/hwo/evtool/solicitud/Cmpnnt_EvaluarTecnica.java
import hwo.evtool.criterio.tecnica.EvaluarTecnica;
import hwo.evtool.dataeval.AdaptadorCriterioTecnica;
=======
import hwo.evtool.propuesta.tecnica.EvaluarTecnica;
>>>>>>> parent of dbebb80 (adaptador --6):evaluacion/src/hwo/evtool/componenteEvaluacion/Cmpnnt_EvaluarTecnica.java


public class Cmpnnt_EvaluarTecnica implements Comando {
	String nombre;
	/* receptor */ EvaluarTecnica tecnica;
	
	public Cmpnnt_EvaluarTecnica (String[] str_EvaluarEquipo) {
		this.nombre = "EvaluacionTecnica";
		this.tecnica = new EvaluarTecnica(str_EvaluarEquipo);
	}

	@Override
	public double ejecutar() {
		System.out.println("--- Comando " + this.nombre + " ---");
		double costo = this.tecnica.evaluar();
		System.out.println(this.tecnica.getDescription()
				+ " $" + costo);
		
		return costo;
	}
}
