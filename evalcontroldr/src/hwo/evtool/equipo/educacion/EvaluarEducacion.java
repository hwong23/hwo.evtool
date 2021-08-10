package hwo.evtool.equipo.educacion;

import java.util.Map;
import hwo.evtool.control.evaluacion.ControlEvaluacion;
import hwo.evtool.evaluacion.Evaluacion;

public class EvaluarEducacion extends ControlEvaluacion {
	Map<String, String> evaldata;
	
	public EvaluarEducacion(String[] evaldata) {
		super(evaldata);
		this.descripcion = "Evaluar educación";
	}


	protected void hk_adaptacion ()  {
		AdaptadorCriterioEducacion adaptdr = new AdaptadorCriterioEducacion();
		this.evaldata = adaptdr.escribirEvaluacion(this.str_evalData);
	}
	
	
	@Override
	public double llamarCriteriosEvaluacion() {
		System.out.println("--- " + this.descripcion + " ---con datos: " +
				this.str_evalData.toString());
		
		/* compont */ Evaluacion evalEducacion = new CriterioEvaluacionEducacion(this.evaldata);
		/* decordr */ evalEducacion = new CriterioExperienciaEspecificaEducacion (evalEducacion);
		/* decordr */ evalEducacion = new CriterioExperienciaGeneralEducacion (evalEducacion);
		/* decordr */ evalEducacion = new CriterioMaestriaEducacion (evalEducacion);
	

		return evalEducacion.cost();
	}
}
