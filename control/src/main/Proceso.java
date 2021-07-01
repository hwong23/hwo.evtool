package main;
import hwo.evtool.componenteEvaluacion.*;
import hwo.evtool.control.Control;
import hwo.evtool.evaluaciones.*;

public class Proceso {
		String[] EvaluarEquipo = {"EvaluarEquipo","2","3","Compilado1","IntConstant"};
		String[] EvaluarPropuesta = {"EvaluarPropuesta","2.0","Comentario2", "StringConstant"};

	public static void main(String[] args) {
		new Proceso().run();
	}
	
	protected void run() {
		Control cntrol = new Control ();
		
		/* receptor */ EvaluarEquipo evaluarequipo = new EvaluarEquipo();
		/* solicitd */ Cmpnnt_EvaluarEquipo cmpntEvaluarEquipo = new Cmpnnt_EvaluarEquipo(evaluarequipo);
		
		/* receptor */ EvaluarPropuesta evaluarpropuesta = new EvaluarPropuesta();
		/* solicitd */ Cmpnnt_EvaluarPropuesta cmpntEvaluarPropuesta = new Cmpnnt_EvaluarPropuesta(evaluarpropuesta);
		
		
		/* llamador */ cntrol.setComando(0, cmpntEvaluarEquipo);
		/* llamador */ cntrol.setComando(0, cmpntEvaluarPropuesta);

		cntrol.llamarEvaluacion1(0);
		cntrol.llamarEvaluacion1(0);
	}
}
