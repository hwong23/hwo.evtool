package hwo.evtool.evaluaciones;

import hwo.evtool.equipo.arquitecto.*;
import hwo.evtool.equipo.director.*;
import hwo.evtool.equipo.educacion.*;


public class EvaluarEquipo {
	public EvaluarEquipo(String[] str_EvaluarEquipo) {
		super();
		this.evalData = str_EvaluarEquipo;
	}

	String description = "Evaluar equipo";
	String[] evalData;

	public String[] getEvalData() {
		return evalData;
	}

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
