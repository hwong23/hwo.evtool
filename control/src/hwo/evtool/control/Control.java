package hwo.evtool.control;

import hwo.evtool.comando.Comando;

public class Control {
	Comando[] estantes;
	
	public Control () {
		estantes = new Comando[2];
	}
	
	public void SetComando (int idx, Comando cmd) {
		this.estantes[idx] = cmd;
	}
	
	public void LanzarEvaluacion1 (int idx) {
		this.estantes[idx].ejecutar();
	}

}
