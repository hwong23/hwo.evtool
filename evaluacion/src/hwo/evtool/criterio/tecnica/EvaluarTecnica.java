package hwo.evtool.criterio.tecnica;


import java.util.Arrays;
<<<<<<< HEAD:evaluacion/src/hwo/evtool/criterio/tecnica/EvaluarTecnica.java

import hwo.evtool.controlador.ControlEvaluacion;
import hwo.evtool.criterio.evaluacion.Evaluacion;
=======
import hwo.evtool.control.evaluacion.ControlEvaluacion;
import hwo.evtool.evaluacion.Evaluacion;
import hwo.evtool.propuesta.tecnica.AdaptadorCriterioTecnica;
>>>>>>> parent of dbebb80 (adaptador --6):evalcontroldr/src/hwo/evtool/propuesta/tecnica/EvaluarTecnica.java


public class EvaluarTecnica extends ControlEvaluacion {
	public EvaluarTecnica(String[] str_EvaluarTecnica) {
		super(str_EvaluarTecnica);
		this.descripcion = "(contrldr) Evaluar Tecnica (nueva evalc.)";
	}

	@Override
	public double llamarCriteriosEvaluacion() {
		System.out.println("--- " + this.descripcion + " ---con datos: " +
			Arrays.toString(this.evalData));
		
		/* compont */ Evaluacion evalTecnica = new CriterioEvaluacionTecnica (evalData);
		/* decordr */ evalTecnica = new CriterioEvaluacionPropuestaTecnica (evalTecnica);

		return evalTecnica.cost();
	 }
	
	@Override
	protected String[] escribirDataEvaluacion(String[] evalData) {
		AdaptadorCriterioTecnica cr = new AdaptadorCriterioTecnica();
		return cr.escribirEvaluacion(evalData);
	}
}
