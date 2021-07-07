import hwo.evtool.componenteEvaluacion.*;
import hwo.evtool.control.Control;
import hwo.evtool.evaluaciones.*;

public class Proceso {
		String[] str_EvaluarEquipo = {"EvaluarEquipo","1", "3","Compilado1","IntConstant"};
		String[] str_EvaluarPropuesta = {"EvaluarPropuesta","S","comentario eval ropuesta","SiNoConstant"};

	public static void main(String[] args) {
		new Proceso().run();
	}
	
	protected void run() {
		Control cntrol = new Control ();
		
		/* receptor */ EvaluarEquipo evaluarequipo = new EvaluarEquipo(str_EvaluarEquipo);
		/* solicitd */ Cmpnnt_EvaluarEquipo cmpntEvaluarEquipo = new Cmpnnt_EvaluarEquipo(evaluarequipo);
		
		/* receptor */ EvaluarPropuesta evaluarpropuesta = new EvaluarPropuesta(str_EvaluarPropuesta);
		/* solicitd */ Cmpnnt_EvaluarPropuesta cmpntEvaluarPropuesta = new Cmpnnt_EvaluarPropuesta(evaluarpropuesta);
		
		
		/* llamador */ cntrol.setComando(0, cmpntEvaluarEquipo);
		/* llamador */ cntrol.setComando(1, cmpntEvaluarPropuesta);

		cntrol.llamarEvaluacion1(0);
		cntrol.llamarEvaluacion1(1);
	}
}
