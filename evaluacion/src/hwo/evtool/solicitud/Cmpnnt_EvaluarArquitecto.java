package hwo.evtool.solicitud;

import hwo.evtool.comando.Comando;
<<<<<<< HEAD:evaluacion/src/hwo/evtool/solicitud/Cmpnnt_EvaluarArquitecto.java
import hwo.evtool.criterio.arquitecto.EvaluarArquitecto;
import hwo.evtool.dataeval.AdaptadorCriterioArquitecto;
=======
import hwo.evtool.equipo.arquitecto.EvaluarArquitecto;
>>>>>>> parent of dbebb80 (adaptador --6):evaluacion/src/hwo/evtool/componenteEvaluacion/Cmpnnt_EvaluarArquitecto.java

public class Cmpnnt_EvaluarArquitecto implements Comando {
	String nombre;
	/* receptor */ EvaluarArquitecto arquitecto;
	
	public Cmpnnt_EvaluarArquitecto (String[] str_EvaluarArq) {
		this.nombre = "EvaluacionEquipo";
		this.arquitecto = new EvaluarArquitecto (str_EvaluarArq);
	}

	@Override
	public double ejecutar() {
		double costo = this.arquitecto.evaluar();
		
		System.out.println("--- Comando " + this.nombre + " ---");
		System.out.println(this.arquitecto.getDescription()
				+ " $" + costo);
		
		return costo;
	}
}
