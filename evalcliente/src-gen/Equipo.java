import hwo.evtool.componenteEvaluacion.*;
import hwo.evtool.ejecucion.Control;

public class Equipo {
		String[] str_EvaluarEquipo = {"EvaluarEquipo","1", "2","comentario eval propuesta","IntConstant"};

	public static void main(String[] args) {
		new Equipo().run();
	}
	
	protected void run() {
		Control cntrol = new Control ();
		
		/* solicitd */ Cmpnnt_EvaluarEquipo cmpntEvaluarEquipo = new Cmpnnt_EvaluarEquipo(str_EvaluarEquipo);
		
		/* llamador */ cntrol.setComando(0, cmpntEvaluarEquipo);

		cntrol.llamarEvaluacion1(0);
	}
}
