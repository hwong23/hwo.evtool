package hwo.evtool.criterio.educacion;

import java.util.Arrays;

import hwo.evtool.control.evaluacion.ControlEvaluacion;
import hwo.evtool.evaluacion.Evaluacion;

public class EvaluarEducacion extends ControlEvaluacion {
	public EvaluarEducacion(String[] str_EvaluarEduc) {
		super(str_EvaluarEduc);
		this.descripcion = "Evaluar educaci�n";
	}


	public double llamarCriteriosEvaluacion() {
		System.out.println("--- " + this.descripcion + " ---con datos: " +
				Arrays.toString(this.evalData));
		
		/* compont */ Evaluacion evalEducacion = new CriterioEvaluacionEducacion();
		/* decordr */ evalEducacion = new CriterioExperienciaEspecificaEducacion (evalEducacion);
		/* decordr */ evalEducacion = new CriterioExperienciaGeneralEducacion (evalEducacion);
		/* decordr */ evalEducacion = new CriterioMaestriaEducacion (evalEducacion);
	

		return evalEducacion.cost();
	}
}
