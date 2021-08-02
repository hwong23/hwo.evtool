package hwo.evtool.criterio.tecnica;


import java.util.Arrays;
import hwo.evtool.control.evaluacion.ControlEvaluacion;
import hwo.evtool.evaluacion.Evaluacion;


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
}
