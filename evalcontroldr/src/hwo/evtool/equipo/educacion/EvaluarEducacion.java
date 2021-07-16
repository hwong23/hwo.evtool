package hwo.evtool.equipo.educacion;

import java.util.Arrays;

import hwo.evtool.evaluacion.Evaluacion;

public class EvaluarEducacion {
	String descripcion = "Evaluar educación";
	String[] evalData;
	
	public EvaluarEducacion(String[] str_EvaluarEduc) {
		// TODO Auto-generated constructor stub
		evalData = str_EvaluarEduc;
	}


	public double evaluar() {
		System.out.println("--- " + this.descripcion + " ---con datos: " +
				Arrays.toString(this.evalData));
		
		/* compont */ Evaluacion evalEducacion = new CriterioEvaluacionEducacion();
		/* decordr */ evalEducacion = new CriterioExperienciaEspecificaEducacion (evalEducacion);
		/* decordr */ evalEducacion = new CriterioExperienciaGeneralEducacion (evalEducacion);
		/* decordr */ evalEducacion = new CriterioMaestriaEducacion (evalEducacion);
	

		return evalEducacion.cost();
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		return descripcion;
	}
}
