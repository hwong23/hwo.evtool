package hwo.evtool.propuesta.tecnica;


import hwo.evtool.control.componente.ControlComponente;
import hwo.evtool.evaluacion.Evaluacion;


public class EvaluarTecnica extends ControlComponente {
	AdaptadorCriterioTecnica adaptdr = new AdaptadorCriterioTecnica();
	
	public EvaluarTecnica(String[] str_evaldata) {
		super(str_evaldata);
		this.descripcion = "(contrldr) Evaluar Tecnica (nueva evalc.)";
	}

	protected void hk_adaptacion ()  {
		adaptdr.escribirEvaluacion(this.str_evalData);
	}
	
	@Override
	public double llamarCriteriosEvaluacion() {
		System.out.println("--- " + this.descripcion + " ---con datos: " +
			this.adaptdr.leerEvaluacion());
		
		/* compont */ Evaluacion evalTecnica = new CriterioEvaluacionTecnica (adaptdr.dataTecnica);
		/* decordr */ evalTecnica = new CriterioEvaluacionPropuestaTecnica (evalTecnica);

		return evalTecnica.cost();
	}
}
