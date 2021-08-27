import hwo.evtool.componenteEvaluacion.*;
import hwo.evtool.ejecucion.Control;

public class Enfoque {
		String[] str_entendimiento = {"entendimiento", "Conceptos generales del SPE/:A","Factores y variables que están afectando a la UAESPE/:B","Limitaciones y retos del modelo de atención a prestadores/:M","Concepto SISE/:M","Limitaciones SISE/:M", "CalificarPropuesta"};
		String[] str_propuesta = {"propuesta", "entendimiento/:A","personalización/:M", "CalificarPropuesta"};
		String[] str_valoragregado = {"valoragregado", "entendimiento/:A","personalización/:M", "CalificarPropuesta"};
		String[] str_procesosFuncionalidades = {"procesosFuncionalidades", "entendimiento/:A","personalización/:M", "CalificarPropuesta"};

	public static void main(String[] args) {
		new Enfoque().run();
		
	}
	
	protected void run() {
		Control cntrol = new Control ();
		
		/* solicitd */ Cmpnnt_EvaluarProblema cmpntentendimiento = new Cmpnnt_EvaluarProblema(str_entendimiento);
		/* solicitd */ Cmpnnt_EvaluarProblema cmpntpropuesta = new Cmpnnt_EvaluarProblema(str_propuesta);
		/* solicitd */ Cmpnnt_EvaluarProblema cmpntvaloragregado = new Cmpnnt_EvaluarProblema(str_valoragregado);
		/* solicitd */ Cmpnnt_EvaluarProblema cmpntprocesosFuncionalidades = new Cmpnnt_EvaluarProblema(str_procesosFuncionalidades);
		
		/* llamador */ cntrol.setComando(0, cmpntentendimiento);
		/* llamador */ cntrol.setComando(1, cmpntpropuesta);
		/* llamador */ cntrol.setComando(2, cmpntvaloragregado);
		/* llamador */ cntrol.setComando(3, cmpntprocesosFuncionalidades);

		cntrol.llamarEvaluacion(0);
		cntrol.llamarEvaluacion(1);
		cntrol.llamarEvaluacion(2);
		cntrol.llamarEvaluacion(3);
		
		System.out.println("--- Total " + cntrol.getTotal());
	}
}
