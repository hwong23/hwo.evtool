package hwo.evtool.propuesta.tecnica;


import java.util.Arrays;
import hwo.evtool.evaluacion.Evaluacion;


public class EvaluarTecnica {
	public EvaluarTecnica(String[] str_EvaluarTecnica) {
		super();
		this.evalData = str_EvaluarTecnica;
	}

	String descripcion = "Evaluar técnica";
	String[] evalData;

	public String[] getEvalData() {
		return this.evalData;
	}

	public String getDescription() {
		return descripcion;
	}

	public double evaluar () {
		System.out.println("--- " + this.descripcion + " ---con datos: " +
			Arrays.toString(this.evalData));
		
		/* compont */ Evaluacion evalTecnica = new CriterioEvaluacionTecnica (evalData);
		/* decordr */ evalTecnica = new CriterioEvaluacionPropuestaTecnica (evalTecnica);

		return evalTecnica.cost();
	 }
}
