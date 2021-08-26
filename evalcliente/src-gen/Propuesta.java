import hwo.evtool.componenteEvaluacion.*;
import hwo.evtool.ejecucion.Control;

public class Propuesta {
		String[] str_probCriterio1 = {"probCriterio1", "entendimiento/:A","claridad/:B","tecnología/:M", "CalificarPropuesta"};
		String[] str_probCriterio2 = {"probCriterio2", "entendimiento/:A","personalización/:M", "CalificarPropuesta"};
		String[] str_arqHWO = {"arqHWO", "EvaluarArquitecto", "Maestria", "2", "3", "CalificarEquipo"};

	public static void main(String[] args) {
		new Propuesta().run();
		
	}
	
	protected void run() {
		Control cntrol = new Control ();
		
		/* solicitd */ Cmpnnt_EvaluarProblema cmpntprobCriterio1 = new Cmpnnt_EvaluarProblema(str_probCriterio1);
		/* solicitd */ Cmpnnt_EvaluarProblema cmpntprobCriterio2 = new Cmpnnt_EvaluarProblema(str_probCriterio2);
		/* solicitd */ Cmpnnt_EvaluarArquitecto cmpntarqHWO = new Cmpnnt_EvaluarArquitecto(str_arqHWO);
		
		/* llamador */ cntrol.setComando(0, cmpntprobCriterio1);
		/* llamador */ cntrol.setComando(1, cmpntprobCriterio2);
		/* llamador */ cntrol.setComando(2, cmpntarqHWO);

		cntrol.llamarEvaluacion(0);
		cntrol.llamarEvaluacion(1);
		cntrol.llamarEvaluacion(2);
		
		System.out.println("--- Total " + cntrol.getTotal());
	}
}
