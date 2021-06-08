package main;

import hwo.evtool.componentesEvaluacion.ComponenteEvaluacion;
import hwo.evtool.control.Control;
import hwo.evtool.evaluaciones.EvaluarEquipo;


public class MainEjecutarRemoto {

	public static void main(String[] args) {
		Control cntrol = new Control ();
		EvaluarEquipo eqpoClave = new EvaluarEquipo();
		ComponenteEvaluacion cmpntEval = new ComponenteEvaluacion(eqpoClave);
		
		cntrol.SetComando(cmpntEval);
		cntrol.LanzarEvaluacion1();

	}

}
