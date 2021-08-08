package hwo.evtool.equipo.educacion;

import java.util.Map;

import hwo.evtool.control.evaluacion.ControlEvaluacion;
import hwo.evtool.dataeval.DataEvaluacion;
import hwo.evtool.evaluacion.Evaluacion;

public class EvaluarEducacion extends ControlEvaluacion {
	public EvaluarEducacion(Map<String, String> str_EvaluarEduc) {
		super(str_EvaluarEduc);
		this.descripcion = "Evaluar educación";
	}


	public double llamarCriteriosEvaluacion() {
		System.out.println("--- " + this.descripcion + " ---con datos: " +
				this.evalData.toString());
		
		/* compont */ Evaluacion evalEducacion = new CriterioEvaluacionEducacion(evalData);
		/* decordr */ evalEducacion = new CriterioExperienciaEspecificaEducacion (evalEducacion);
		/* decordr */ evalEducacion = new CriterioExperienciaGeneralEducacion (evalEducacion);
		/* decordr */ evalEducacion = new CriterioMaestriaEducacion (evalEducacion);
	

		return evalEducacion.cost();
	}
}
