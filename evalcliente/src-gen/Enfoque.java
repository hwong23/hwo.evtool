import hwo.evtool.evaluaciongral.ControlEvaluacionGral;

public class Enfoque {
		String[] str_entendimiento = {"entendimiento", "Fomento de la movilidad educativa, formativa y laboral/:A","Adecuación entre oferta y demanda de mercado de trabajo/:A","Promoción del aprendizaje a lo largo de la vida/:A","Valoración de distintas formas de aprender / de cualificarse/:A","Fortalecimiento del capital humano/:A","Alineación de la educación y la formación con las necesidades del sector productivo/:A","Plataforma del Sistema Nacional de Cualificaciones/:A","Marco Nacional de Cualificaciones/:A","Subsistema de evaluación y certificación de competencias/:A","Esquema de movilidad educativa y formativa/:A","Subsistema de normalización de competencias/:A","Subsistema de aseguramiento de la calidad de la formación para el trabajo/:A","Se evidencia la consulta y análisis de información relacionada con Sistemas de Cualificaciones, por ejemplo: catálogos de ocupaciones, Marcos de Cualificaciones, vías de cualificación, mecanismos de reconocimiento, herramientas o sistemas de información asociados a cualificaciones/:A","Hace referencia a la relación (conceptual, operativa o estratégica) entre los componentes del Sistema Nacional de Cualificaciones y posibles elementos comunes entre componentes/:A","Interoperabilidad con otros sistemas: Mesas sectoriales SENA, Bases de datos de Certificación de Competencias/:A","Interoperabilidad con otros sistemas: SPE vacantes, SPE hojas de vida/:A", "CalificarPropuesta"};
		String[] str_propuesta = {"propuesta", "La propuesta es consistente con el entendimiento del problema/:A","La propuesta toma en consideración los niveles de usuarios y los tipos de información que se les debe proveer/:A","De ser realizada ayudaría a cumplir los objetivos de la política pública/:A","Metodología de priorización de requerimientos funcionales/:A","La propuesta es adecuada a un contexto de política pública/:A","Coherencia entre requerimientos priorizados/:A","Estadísticas y visualizaciones (requerimientos)/:A", "CalificarPropuesta"};
		String[] str_valoragregado = {"valoragregado", "entendimiento/:A","personalización/:M", "CalificarPropuesta"};
		String[] str_procesosFuncionalidades = {"procesosFuncionalidades", "entendimiento/:A","personalización/:M", "CalificarPropuesta"};

	public static void main(String[] args) {
		new Enfoque().run();
		
	}
	
	protected void run() {
		ControlEvaluacionGral controlEv = new ControlEvaluacionGral(str_entendimiento);
		controlEv.evaluar();
//		
//		/* solicitd */ Cmpnnt_EvaluarProblema cmpntentendimiento = new Cmpnnt_EvaluarProblema(str_entendimiento);
//		/* solicitd */ Cmpnnt_EvaluarProblema cmpntpropuesta = new Cmpnnt_EvaluarProblema(str_propuesta);
//		/* solicitd */ Cmpnnt_EvaluarProblema cmpntvaloragregado = new Cmpnnt_EvaluarProblema(str_valoragregado);
//		/* solicitd */ Cmpnnt_EvaluarProblema cmpntprocesosFuncionalidades = new Cmpnnt_EvaluarProblema(str_procesosFuncionalidades);
//		
//		/* llamador */ cntrol.setComando(0, cmpntentendimiento);
//		/* llamador */ cntrol.setComando(1, cmpntpropuesta);
//		/* llamador */ cntrol.setComando(2, cmpntvaloragregado);
//		/* llamador */ cntrol.setComando(3, cmpntprocesosFuncionalidades);
//
//		cntrol.llamarEvaluacion(0);
//		cntrol.llamarEvaluacion(1);
//		cntrol.llamarEvaluacion(2);
//		cntrol.llamarEvaluacion(3);
//		
//		System.out.println("--- Total " + cntrol.getTotal());
	}
}
