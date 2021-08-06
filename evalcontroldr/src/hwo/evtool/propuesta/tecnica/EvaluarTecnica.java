package hwo.evtool.propuesta.tecnica;


import hwo.evtool.control.evaluacion.ControlEvaluacion;
import hwo.evtool.dataeval.DataEvaluacion;
import hwo.evtool.evaluacion.Evaluacion;


public class EvaluarTecnica extends ControlEvaluacion {
	public EvaluarTecnica(DataEvaluacion str_EvaluarTecnica) {
		super(str_EvaluarTecnica);
		this.descripcion = "(contrldr) Evaluar Tecnica (nueva evalc.)";
	}

	@Override
	public double llamarCriteriosEvaluacion() {
		System.out.println("--- " + this.descripcion + " ---con datos: " +
			this.evalData.toString());
		
		/* compont */ Evaluacion evalTecnica = new CriterioEvaluacionTecnica (evalData);
		/* decordr */ evalTecnica = new CriterioEvaluacionPropuestaTecnica (evalTecnica);

		return evalTecnica.cost();
	 }
}
