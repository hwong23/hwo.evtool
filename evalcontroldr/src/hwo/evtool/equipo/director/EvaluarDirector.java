package hwo.evtool.equipo.director;

import java.util.Arrays;

import hwo.evtool.evaluacion.Evaluacion;

public class EvaluarDirector {
	String descripcion = "Evaluar director";
	String[] evalData;

	public EvaluarDirector(String[] str_EvaluarDir) {
		// TODO Auto-generated constructor stub
		evalData = str_EvaluarDir;
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		return descripcion;
	}

	public double evaluar() {
		System.out.println("--- " + this.descripcion + " ---con datos: " +
				Arrays.toString(this.evalData));
		
		/* compont */ Evaluacion evalDirector = new CriterioEvaluacionDirector(evalData);
		/* decordr */ evalDirector = new CriterioExperienciaEspecificaDirector (evalDirector);
		/* decordr */ evalDirector = new CriterioExperienciaGeneralDirector (evalDirector);
		/* decordr */ evalDirector = new CriterioMaestriaDirector (evalDirector);

		
		return evalDirector.cost();
	}
}
