package hwo.control.main;

import hwo.control.evaluaciones.ComponenteEvaluacion;
import hwo.control.evaluaciones.Control;
import hwo.control.evaluaciones.EquipoClave;

public class MainEjecutarRemoto {

	public static void main(String[] args) {
		Control cntrol = new Control ();
		EquipoClave eqpoClave = new EquipoClave();
		ComponenteEvaluacion cmpntEval = new ComponenteEvaluacion(eqpoClave);
		
		cntrol.SetComando(cmpntEval);
		cntrol.LanzarEvaluacion1();

	}

}
