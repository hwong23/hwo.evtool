package hwo.evtool;

public class MainEvaluacion {

	public static void main(String args[])
	{
			Evaluacion evalArquitecto = new EvaluarArquitecto();
			evalArquitecto = new CriterioExperienciaEspecifica (evalArquitecto);
			evalArquitecto = new CriterioExperienciaGeneral (evalArquitecto);
			evalArquitecto = new CriterioMaestria (evalArquitecto);

			System.out.println(evalArquitecto.getDescription()
				+ " $" + evalArquitecto.cost());

			Evaluacion evalDirector = new EvaluarDirector();
			evalDirector = new CriterioExperienciaEspecificaDirector (evalDirector);
			evalDirector = new CriterioExperienciaGeneralDirector (evalDirector);
			evalDirector = new CriterioMaestriaDirector (evalDirector);

			System.out.println(evalDirector.getDescription()
				+ " $" + evalDirector.cost());

			Evaluacion evalEducacion = new EvaluarEducacion();
			evalEducacion = new CriterioExperienciaEspecificaEducacion (evalEducacion);
			evalEducacion = new CriterioExperienciaGeneralEducacion (evalEducacion);
			evalEducacion = new CriterioMaestriaEducacion (evalEducacion);

			System.out.println(evalEducacion.getDescription()
				+ " $" + evalEducacion.cost());
	 }
}
