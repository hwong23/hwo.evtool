package hwo.evtool.compnt.fabricasimple;


import hwo.evtool.comando.Comando;
import hwo.evtool.componenteEvaluacion.Cmpnnt_EvaluarProblema;


public class FabricaSimpleComponente {
	public Comando crearComponente (String tipo, String[] evaldata) {
		Comando componente = null;
		
		if (tipo.equals("EvaluarProblema")) {
			componente = new Cmpnnt_EvaluarProblema (evaldata);
		}
		
		return componente;
	}
}
