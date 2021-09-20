package hwo.evtool.evaluaciongral;

import hwo.evtool.comando.Comando;
import hwo.evtool.control.evaluacion.ControlEvaluacion;
import hwo.evtool.ejecucion.Control;

public class ControlEvaluacionGral extends ControlEvaluacion {
	public ControlEvaluacionGral() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	protected double llamarComponentesEvaluacion() {
		// TODO Auto-generated method stub
		Control cntrol = new Control ();
		
		/* solicitd */ Comando cmpntentendimiento = fabricaComponente.crearComponente("EvaluarProblema", this.map_evalData.get(0));
		/* solicitd */ Comando cmpntpropuesta = fabricaComponente.crearComponente("EvaluarProblema", this.map_evalData.get(1));
		/* solicitd */ Comando cmpntvaloragregado = fabricaComponente.crearComponente("EvaluarProblema", this.map_evalData.get(2));
		/* solicitd */ Comando cmpntprocesosFuncionalidades = fabricaComponente.crearComponente("EvaluarProblema", this.map_evalData.get(3));
		
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
