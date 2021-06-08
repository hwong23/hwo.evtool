package main;

import hwo.evtool.componenteEvaluacion.ComponenteEvaluacion;
import hwo.evtool.control.Control;
import hwo.evtool.evaluaciones.EvaluarEquipo;


public class MainEjecutarControl {

	public static void main(String[] args) {
		Control cntrol = new Control ();
		
		EvaluarEquipo eqpoClave = new EvaluarEquipo();
		ComponenteEvaluacion cmpntEval = new ComponenteEvaluacion(eqpoClave);
				
		EvaluarEquipo eqpoClave2 = new EvaluarEquipo();
		ComponenteEvaluacion cmpntEval2 = new ComponenteEvaluacion(eqpoClave2);

		cntrol.SetComando(0, cmpntEval);
		cntrol.SetComando(1, cmpntEval);
		cntrol.LanzarEvaluacion1(0);
		cntrol.LanzarEvaluacion1(1);
	}

}
