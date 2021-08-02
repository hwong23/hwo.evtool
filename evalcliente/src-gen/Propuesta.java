import hwo.evtool.componenteEvaluacion.*;
import hwo.evtool.llamador.Llamador;

public class Propuesta {
		String[] str_probCriterio1 = {"probCriterio1", "criterio 1/:A","criterio 11/:B","criterio 1111/:M", "CalificarPropuesta"};
		String[] str_probCriterio2 = {"probCriterio2", "criterio 2/:A","criterio 22/:M", "CalificarPropuesta"};
		String[] str_tecnCriterio1 = {"tecnCriterio1", "criterio 3/:B", "CalificarPropuesta"};

	public static void main(String[] args) {
		new Propuesta().run();
		
	}
	
	protected void run() {
		Llamador cntrol = new Llamador ();
		
		/* solicitd */ Cmpnnt_EvaluarProblema cmpntprobCriterio1 = new Cmpnnt_EvaluarProblema(str_probCriterio1);
		/* solicitd */ Cmpnnt_EvaluarProblema cmpntprobCriterio2 = new Cmpnnt_EvaluarProblema(str_probCriterio2);
		/* solicitd */ Cmpnnt_EvaluarTecnica cmpnttecnCriterio1 = new Cmpnnt_EvaluarTecnica(str_tecnCriterio1);
		
		/* llamador */ cntrol.setComando(0, cmpntprobCriterio1);
		/* llamador */ cntrol.setComando(1, cmpntprobCriterio2);
		/* llamador */ cntrol.setComando(2, cmpnttecnCriterio1);

		cntrol.llamarEvaluacion(0);
		cntrol.llamarEvaluacion(1);
		cntrol.llamarEvaluacion(2);
		
		System.out.println("--- Total " + cntrol.getTotal());
	}
}
