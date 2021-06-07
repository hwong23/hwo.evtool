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
		EvaluarDirector evalDirector = new EvaluarDirector();
		EvaluarEducacion evalEducacion = new EvaluarEducacion();

		return evalArquitecto.evaluar()+evalDirector.evaluar()+evalEducacion.evaluar();
	 }
}
