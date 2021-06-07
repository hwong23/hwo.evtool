package hwo.evtool.evaluar;

import hwo.evtool.equipo.arquitecto.*;
import hwo.evtool.equipo.director.*;
import hwo.evtool.equipo.educacion.*;


public class EvaluarEquipo {
	String description = "Evaluar equipo";

	public String getDescription() {
		return description;
	}

	public double evaluar () {
		EvaluarArquitecto evalArquitecto = new EvaluarArquitecto();
		EvaluacionDirector evalDirector = new EvaluacionDirector();
		EvaluacionEducacion evalEducacion = new EvaluacionEducacion();

		return evalArquitecto.evaluar()+evalDirector.evaluar()+evalEducacion.evaluar();
	 }
}
