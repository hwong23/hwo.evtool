
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
		cntrol.llamarEvaluacion1(i++);
	}
}
