import hwo.evtool.componenteEvaluacion.*;
import hwo.evtool.ejecucion.Control;

public class Equipo {
		String[] str_arqHWO = {"arqHWO", "EvaluarArquitecto", "Maestria", "2", "3", "CalificarEquipo"};
		String[] str_dirHWO = {"dirHWO", "EvaluarDirector", "Doctorado", "5", "6", "CalificarEquipo"};
		String[] str_eduHWO = {"eduHWO", "EvaluarEducacion", "Maestria", "7", "9", "CalificarEquipo"};

	public static void main(String[] args) {
		new Equipo().run();
		
	}
	
	protected void run() {
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
}
