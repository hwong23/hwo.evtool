package main;

import hwo.evtool.componenteEvaluacion.*;
import hwo.evtool.control.Control;
import hwo.evtool.evaluaciones.*;


public class MainEjecutarControl {

	public static void main(String[] args) {
		Control cntrol = new Control ();
		
		EvaluarEquipo eqpoClave = new EvaluarEquipo();
		ComponenteEvaluacionEquipo cmpntEval = new ComponenteEvaluacionEquipo(eqpoClave);
				
		EvaluarPropuesta propuesta = new EvaluarPropuesta();
		ComponenteEvaluacionPropuesta cmpntEval2 = new ComponenteEvaluacionPropuesta(propuesta);

		cntrol.SetComando(0, cmpntEval);
		cntrol.SetComando(1, cmpntEval2);
		cntrol.LanzarEvaluacion1(0);
		cntrol.LanzarEvaluacion1(1);
	}

}
