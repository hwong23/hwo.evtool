package hwo.evtool.control;

import hwo.evtool.comando.Comando;

public class Control {
	Comando estante;
	
	public void SetComando (Comando cmd) {
		this.estante = cmd;
	}
	
	public void LanzarEvaluacion1 () {
		this.estante.ejecutar();
	}

}
