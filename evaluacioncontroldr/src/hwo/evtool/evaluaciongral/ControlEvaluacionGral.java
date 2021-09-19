package hwo.evtool.evaluaciongral;

import hwo.evtool.componenteEvaluacion.*;
import hwo.evtool.control.evaluacion.ControlEvaluacion;
import hwo.evtool.ejecucion.Control;

public class ControlEvaluacionGral extends ControlEvaluacion {
	public ControlEvaluacionGral(String[] evaldata) {
		super(evaldata);
		// TODO Auto-generated constructor stub
	}


	String[] str_entendimiento = {"entendimiento", "Conceptos generales del SPE/:A","Factores y variables que están afectando a la UAESPE/:B","Limitaciones y retos del modelo de atención a prestadores/:M","Concepto SISE/:M","Limitaciones SISE/:M", "CalificarPropuesta"};
	String[] str_propuesta = {"propuesta", "entendimiento/:A","personalización/:M", "CalificarPropuesta"};
	String[] str_valoragregado = {"valoragregado", "entendimiento/:A","personalización/:M", "CalificarPropuesta"};
	String[] str_procesosFuncionalidades = {"procesosFuncionalidades", "entendimiento/:A","personalización/:M", "CalificarPropuesta"};

	
	@Override
	protected double llamarComponentesEvaluacion() {
		// TODO Auto-generated method stub
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
		return 0;
	}
}
