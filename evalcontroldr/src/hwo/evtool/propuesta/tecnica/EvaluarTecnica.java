package hwo.evtool.propuesta.tecnica;


import java.util.Arrays;


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
		
		/* item-criterios */ EvaluarTecnica evalTecnica = new EvaluarTecnica(evalData);

		return evalTecnica.evaluar();
	 }
}
