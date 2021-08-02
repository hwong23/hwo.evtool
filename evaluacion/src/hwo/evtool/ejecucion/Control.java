package hwo.evtool.ejecucion;

import hwo.evtool.comando.Comando;

public class Control {
	double total = 0;

	Comando[] estantes;
	
	public Control () {
		estantes = new Comando[10];
	}
	
	public void setComando (int idx, Comando cmd) {
		this.estantes[idx] = cmd;
	}
	
	public void llamarEvaluacion (int idx) {
		total += this.estantes[idx].ejecutar();
	}

	public double getTotal() {
		return total;
	}
}
