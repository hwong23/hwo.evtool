package hwo.evtool.llamador;

import hwo.evtool.comando.Comando;

public class Llamador {
	double total = 0;

	Comando[] estantes;
	
	public Llamador () {
		estantes = new Comando[10];
	}
	
	public void setComando (int idx, Comando cmd) {
		this.estantes[idx] = cmd;
	}
	
	public void llamarEvaluacion1 (int idx) {
		total += this.estantes[idx].ejecutar();
	}

	public double getTotal() {
		return total;
	}
}
