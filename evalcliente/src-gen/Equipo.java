import hwo.evtool.componenteEvaluacion.*;
import hwo.evtool.ejecucion.Control;

public class Equipo {

	public static void main(String[] args) {
		String[] str_arqHWO = {"arqHWO", "EvaluarArquitecto", "1", "2", "3", "CalificarEquipo"};
		String[] str_dirHWO = {"dirHWO", "EvaluarDirector", "4", "5", "6", "CalificarEquipo"};
		String[] str_eduHWO = {"eduHWO", "EvaluarEducacion", "8", "7", "9", "CalificarEquipo"};

		Control cntrol = new Control ();
		
		/* solicitd */ Cmpnnt_EvaluarArquitecto cmpntarqHWO = new Cmpnnt_EvaluarArquitecto(str_arqHWO);
		/* solicitd */ Cmpnnt_EvaluarDirector cmpntdirHWO = new Cmpnnt_EvaluarDirector(str_dirHWO);
		/* solicitd */ Cmpnnt_EvaluarEducacion cmpnteduHWO = new Cmpnnt_EvaluarEducacion(str_eduHWO);
		
		/* llamador */ cntrol.setComando(0, cmpntarqHWO);
		/* llamador */ cntrol.setComando(1, cmpntdirHWO);
		/* llamador */ cntrol.setComando(2, cmpnteduHWO);

		cntrol.llamarEvaluacion(0);
		cntrol.llamarEvaluacion(1);
		cntrol.llamarEvaluacion(2);
		
		System.out.println("--- Total " + cntrol.getTotal());
		
	}
	
	protected void run() {
		
	}
}
