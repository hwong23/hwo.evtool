import hwo.evtool.componenteEvaluacion.*;
import hwo.evtool.ejecucion.Control;

public class Propuesta {
		String[] str_probCriterio1 = {"probCriterio1","EvaluarProblema", "A","CalificarPropuesta"};
		String[] str_probCriterio2 = {"probCriterio2","EvaluarProblema", "B","CalificarPropuesta"};
		String[] str_tecnCriterio1 = {"tecnCriterio1","EvaluarTecnica", "B","CalificarPropuesta"};
		String[] str_arqHWO = {"arqHWO","EvaluarArquitecto", "1", "2","CalificarEquipo"};

	public static void main(String[] args) {
		new Propuesta().run();
		
	}
	
	protected void run() {
		Control cntrol = new Control ();
		
		/* solicitd */ Cmpnnt_EvaluarProblema cmpntprobCriterio1 = new Cmpnnt_EvaluarProblema(str_probCriterio1);
		/* solicitd */ Cmpnnt_EvaluarProblema cmpntprobCriterio2 = new Cmpnnt_EvaluarProblema(str_probCriterio2);
		/* solicitd */ Cmpnnt_EvaluarTecnica cmpnttecnCriterio1 = new Cmpnnt_EvaluarTecnica(str_tecnCriterio1);
		/* solicitd */ Cmpnnt_EvaluarArquitecto cmpntarqHWO = new Cmpnnt_EvaluarArquitecto(str_arqHWO);
		
		/* llamador */ cntrol.setComando(0, cmpntprobCriterio1);
		/* llamador */ cntrol.setComando(1, cmpntprobCriterio2);
		/* llamador */ cntrol.setComando(2, cmpnttecnCriterio1);
		/* llamador */ cntrol.setComando(3, cmpntarqHWO);

		cntrol.llamarEvaluacion1(0);
		cntrol.llamarEvaluacion1(1);
		cntrol.llamarEvaluacion1(2);
		cntrol.llamarEvaluacion1(3);
	}
}
