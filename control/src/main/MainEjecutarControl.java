package main;

import hwo.evtool.componenteEvaluacion.*;
import hwo.evtool.control.Control;
import hwo.evtool.evaluaciones.*;


public class MainEjecutarControl {

	public static void main(String[] args) {
		new MainEjecutarControl().run();
	}

	
	protected void run () {
		/* receptor */ EvaluarEquipo eqpoClave = new EvaluarEquipo();
		/* solicitd */ ComponenteEvaluacionEquipo cmpntEval = new ComponenteEvaluacionEquipo(eqpoClave);
		
		/* receptor */ EvaluarPropuesta propuesta = new EvaluarPropuesta();
		/* solicitd */ ComponenteEvaluacionPropuesta cmpntEval2 = new ComponenteEvaluacionPropuesta(propuesta);

		Control cntrol = new Control ();
		/* llamador */ cntrol.SetComando(0, cmpntEval);
		/* llamador */ cntrol.SetComando(1, cmpntEval2);
		
		cntrol.LanzarEvaluacion1(0);
		cntrol.LanzarEvaluacion1(1);
	}
}
