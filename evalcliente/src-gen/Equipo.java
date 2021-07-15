import hwo.evtool.componenteEvaluacion.*;
import hwo.evtool.ejecucion.Control;

public class Equipo {
		String[] str_EvaluarArquitecto = {"EvaluarArquitecto","1", "4","Compilado1","IntConstant"};
		String[] str_EvaluarDirector = {"EvaluarDirector","1", "4","Compilado1","IntConstant"};

	public static void main(String[] args) {
		new Equipo().run();
	}
	
	protected void run() {
		Control cntrol = new Control ();
		
		/* solicitd */ Cmpnnt_EvaluarArquitecto cmpntEvaluarArquitecto = new Cmpnnt_EvaluarArquitecto(str_EvaluarArquitecto);
		/* solicitd */ Cmpnnt_EvaluarDirector cmpntEvaluarDirector = new Cmpnnt_EvaluarDirector(str_EvaluarDirector);
		
		/* llamador */ cntrol.setComando(0, cmpntEvaluarArquitecto);
		/* llamador */ cntrol.setComando(1, cmpntEvaluarDirector);

		cntrol.llamarEvaluacion1(0);
		cntrol.llamarEvaluacion1(1);
	}
}
