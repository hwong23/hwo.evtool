package hwo.evtool;

public class EvaluarEquipo {
	String description = "Evaluar equipo";

	public String getDescription() {
		return description;
	}

	public double evaluar () {
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

			return evalArquitecto.cost()+evalDirector.cost()+evalEducacion.cost();
	 }
}
