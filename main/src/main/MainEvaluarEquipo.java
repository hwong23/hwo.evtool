package main;

import hwo.evtool.evaluaciones.EvaluarEquipo;

public class MainEvaluarEquipo {

	public static void main(String args[])
	{
		EvaluarEquipo ee = new EvaluarEquipo();

		System.out.println(ee.getDescription()
			+ " $" + ee.evaluar());
	}
}
