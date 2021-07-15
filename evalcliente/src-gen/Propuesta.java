import hwo.evtool.componenteEvaluacion.*;
import hwo.evtool.ejecucion.Control;

public class Propuesta {
		String[] str_EvaluarProblema = {"EvaluarProblema","1", "4","Compilado1","IntConstant"};
		String[] str_EvaluarTecnica = {"EvaluarTecnica","1", "2","comentario eval propuesta","IntConstant"};

	public static void main(String[] args) {
		new Propuesta().run();
	}
	
	protected void run() {
		Control cntrol = new Control ();
		
		/* solicitd */ Cmpnnt_EvaluarProblema cmpntEvaluarProblema = new Cmpnnt_EvaluarProblema(str_EvaluarProblema);
		/* solicitd */ Cmpnnt_EvaluarTecnica cmpntEvaluarTecnica = new Cmpnnt_EvaluarTecnica(str_EvaluarTecnica);
		
		/* llamador */ cntrol.setComando(0, cmpntEvaluarProblema);
		/* llamador */ cntrol.setComando(1, cmpntEvaluarTecnica);

		cntrol.llamarEvaluacion1(0);
		cntrol.llamarEvaluacion1(1);
	}
}
