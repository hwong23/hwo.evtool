package main;

import hwo.evtool.componenteEvaluacion.*;
import hwo.evtool.control.Control;
import hwo.evtool.evaluaciones.*;


public class MainEjecutarControl {

	public static void main(String[] args) {
		new MainEjecutarControl().run();
	}

	
	protected void run () {
		Control cntrol = new Control ();
		int i;
		
		/* receptor */ EvaluarEquipo evaluarequipo = new EvaluarEquipo();
		/* solicitd */ Cmpnnt_EvaluarEquipo cmpntEvaluarEquipo = new Cmpnnt_EvaluarEquipo(evaluarequipo);
		
		/* receptor */ EvaluarPropuesta evaluarpropuesta = new EvaluarPropuesta();
		/* solicitd */ Cmpnnt_EvaluarPropuesta cmpntEvaluarPropuesta = new Cmpnnt_EvaluarPropuesta(evaluarpropuesta);
		
		
		i = 0;
		/* llamador */ cntrol.setComando(i++, cmpntEvaluarEquipo);
		/* llamador */ cntrol.setComando(i++, cmpntEvaluarPropuesta);
		
		i = 0;
		cntrol.llamarEvaluacion1(i++);
		cntrol.llamarEvaluacion1(i++);	}
}
