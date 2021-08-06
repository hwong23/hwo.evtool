package hwo.evtool.equipo.director;

import hwo.evtool.control.evaluacion.ControlEvaluacion;
import hwo.evtool.dataeval.DataEvaluacion;
import hwo.evtool.evaluacion.Evaluacion;

public class EvaluarDirector extends ControlEvaluacion {
	public EvaluarDirector(DataEvaluacion str_EvaluarDir) {
		super(str_EvaluarDir);
		this.descripcion = "Evaluar director";
	}

	public double llamarCriteriosEvaluacion() {
		System.out.println("--- " + this.descripcion + " ---con datos: " +
				this.evalData.toString());
		
		/* compont */ Evaluacion evalDirector = new CriterioEvaluacionDirector(evalData);
		/* decordr */ evalDirector = new CriterioExperienciaEspecificaDirector (evalDirector);
		/* decordr */ evalDirector = new CriterioExperienciaGeneralDirector (evalDirector);
		/* decordr */ evalDirector = new CriterioMaestriaDirector (evalDirector);

		
		return evalDirector.cost();
	}
}
