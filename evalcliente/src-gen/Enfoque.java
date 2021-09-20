import hwo.evtool.evaluaciongral.ControlEvaluacionGral;

public class Enfoque {
		String[] str_entendimiento = {"EvaluarProblema", "entendimiento", "Fomento de la movilidad educativa, formativa y laboral/:A","Adecuación entre oferta y demanda de mercado de trabajo/:A","Promoción del aprendizaje a lo largo de la vida/:A","Valoración de distintas formas de aprender / de cualificarse/:A","Fortalecimiento del capital humano/:A","Alineación de la educación y la formación con las necesidades del sector productivo/:A","Plataforma del Sistema Nacional de Cualificaciones/:A","Marco Nacional de Cualificaciones/:A","Subsistema de evaluación y certificación de competencias/:A","Esquema de movilidad educativa y formativa/:A","Subsistema de normalización de competencias/:A","Subsistema de aseguramiento de la calidad de la formación para el trabajo/:A","Se evidencia la consulta y análisis de información relacionada con Sistemas de Cualificaciones, por ejemplo: catálogos de ocupaciones, Marcos de Cualificaciones, vías de cualificación, mecanismos de reconocimiento, herramientas o sistemas de información asociados a cualificaciones/:A","Hace referencia a la relación (conceptual, operativa o estratégica) entre los componentes del Sistema Nacional de Cualificaciones y posibles elementos comunes entre componentes/:A","Interoperabilidad con otros sistemas: Mesas sectoriales SENA, Bases de datos de Certificación de Competencias/:A","Interoperabilidad con otros sistemas: SPE vacantes, SPE hojas de vida/:A", "CalificarPropuesta"};
		String[] str_propuesta = {"EvaluarProblema", "propuesta", "La propuesta es consistente con el entendimiento del problema/:A","La propuesta toma en consideración los niveles de usuarios y los tipos de información que se les debe proveer/:A","De ser realizada ayudaría a cumplir los objetivos de la política pública/:A","Metodología de priorización de requerimientos funcionales/:A","La propuesta es adecuada a un contexto de política pública/:A","Coherencia entre requerimientos priorizados/:A","Estadísticas y visualizaciones (requerimientos)/:A", "CalificarPropuesta"};
		String[] str_valoragregado = {"EvaluarProblema", "valoragregado", "entendimiento/:A","personalización/:M", "CalificarPropuesta"};
		String[] str_procesosFuncionalidades = {"EvaluarProblema", "procesosFuncionalidades", "entendimiento/:A","personalización/:M", "CalificarPropuesta"};

	public static void main(String[] args) {
		new Enfoque().run();
		
	}
	
	protected void run() {
		ControlEvaluacionGral controlEv = new ControlEvaluacionGral();
		
		/* llamador */ controlEv.setEntrada(0, str_entendimiento);
		/* llamador */ controlEv.setEntrada(1, str_propuesta);
		/* llamador */ controlEv.setEntrada(2, str_valoragregado);
		/* llamador */ controlEv.setEntrada(3, str_procesosFuncionalidades);

		controlEv.evaluar();

//		System.out.println("--- Total " + controlEv.getTotal());
	}
}
