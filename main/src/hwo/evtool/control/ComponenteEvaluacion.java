package hwo.evtool.control;

public class ComponenteEvaluacion implements Comando {
	EquipoClave equipo;
	
	public ComponenteEvaluacion (EquipoClave equipoClave) {
		this.equipo = equipoClave;
	}

	@Override
	public void ejecutar() {
		this.equipo.evaluar();
	}
}
