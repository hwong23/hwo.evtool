import hwo.evtool.componenteEvaluacion.*;
import hwo.evtool.ejecucion.Control;

public class PropuestaBid {
		String[] str_EvaluarTecnica = {"EvaluarTecnica","tecnica", "B","","ProptConstant"};
		String[] str_EvaluarProblemax = {"EvaluarProblemax","problema", "A","","ProptConstant"};

	public static void main(String[] args) {
		new PropuestaBid().run();
	}
	
	protected void run() {
		Control cntrol = new Control ();
		
		hwo.evtool.dsl.evaluacion.impl.ProptConstantImpl
		/* solicitd */ Cmpnnt_EvaluarTecnica cmpntEvaluarTecnica = new Cmpnnt_EvaluarTecnica(str_EvaluarTecnica);
		hwo.evtool.dsl.evaluacion.impl.ProptConstantImpl
		/* solicitd */ Cmpnnt_EvaluarProblemax cmpntEvaluarProblemax = new Cmpnnt_EvaluarProblemax(str_EvaluarProblemax);
		
		/* llamador */ cntrol.setComando(0, cmpntEvaluarTecnica);
		/* llamador */ cntrol.setComando(1, cmpntEvaluarProblemax);

		cntrol.llamarEvaluacion1(0);
		cntrol.llamarEvaluacion1(1);
	}
}
