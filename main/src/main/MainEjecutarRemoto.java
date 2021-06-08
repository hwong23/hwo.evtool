package main;

import hwo.evtool.componentesEvaluacion.ComponenteEvaluacion;
import hwo.evtool.evaluaciones.EquipoClave;


public class MainEjecutarRemoto {

	public static void main(String[] args) {
		Control cntrol = new Control ();
		EquipoClave eqpoClave = new EquipoClave();
		ComponenteEvaluacion cmpntEval = new ComponenteEvaluacion(eqpoClave);
		
		cntrol.SetComando(cmpntEval);
		cntrol.LanzarEvaluacion1();

	}

}
