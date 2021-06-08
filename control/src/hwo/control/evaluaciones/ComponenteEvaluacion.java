package hwo.control.evaluaciones;

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
