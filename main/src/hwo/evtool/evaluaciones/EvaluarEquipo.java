package hwo.evtool.evaluaciones;

import java.util.Arrays;

import hwo.evtool.equipo.arquitecto.*;
import hwo.evtool.equipo.director.*;
import hwo.evtool.equipo.educacion.*;


public class EvaluarEquipo {
	public EvaluarEquipo(String[] str_EvaluarEquipo) {
		super();
		this.evalData = str_EvaluarEquipo;
	}

	String descripcion = "Evaluar equipo";
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
		
		/* item-criterios */ EvaluarArquitecto evalArquitecto = new EvaluarArquitecto();
		/* item-criterios */ EvaluarDirector evalDirector = new EvaluarDirector();
		/* item-criterios */ EvaluarEducacion evalEducacion = new EvaluarEducacion();

		return evalArquitecto.evaluar()+evalDirector.evaluar()+evalEducacion.evaluar();
	 }
}
