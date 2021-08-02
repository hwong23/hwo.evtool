package hwo.evtool.criterio.director;

import java.util.Arrays;

import hwo.evtool.controlador.ControlEvaluacion;
import hwo.evtool.criterio.evaluacion.Evaluacion;

public class EvaluarDirector extends ControlEvaluacion {
	public EvaluarDirector(String[] str_EvaluarDir) {
		super(str_EvaluarDir);
		this.descripcion = "Evaluar director";
	}

	public double llamarCriteriosEvaluacion() {
		System.out.println("--- " + this.descripcion + " ---con datos: " +
				Arrays.toString(this.evalData));
		
		/* compont */ Evaluacion evalDirector = new CriterioEvaluacionDirector(evalData);
		/* decordr */ evalDirector = new CriterioExperienciaEspecificaDirector (evalDirector);
		/* decordr */ evalDirector = new CriterioExperienciaGeneralDirector (evalDirector);
		/* decordr */ evalDirector = new CriterioMaestriaDirector (evalDirector);

		
		return evalDirector.cost();
	}
}
