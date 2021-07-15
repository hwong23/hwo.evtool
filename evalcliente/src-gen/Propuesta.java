import hwo.evtool.componenteEvaluacion.*;
import hwo.evtool.ejecucion.Control;

public class Propuesta {
		String[] str_EvaluarPropuesta = {"EvaluarPropuesta","1", "4","Compilado1","IntConstant"};

	public static void main(String[] args) {
		new Propuesta().run();
	}
	
	protected void run() {
		Control cntrol = new Control ();
		
		/* solicitd */ Cmpnnt_EvaluarPropuesta cmpntEvaluarPropuesta = new Cmpnnt_EvaluarPropuesta(str_EvaluarPropuesta);
		
		/* llamador */ cntrol.setComando(0, cmpntEvaluarPropuesta);

		cntrol.llamarEvaluacion1(0);
	}
}
