import hwo.evtool.componenteEvaluacion.*;
import hwo.evtool.ejecucion.Control;

public class Enfoque {
		String[] str_entendimiento = {"entendimiento", "Fomento de la movilidad educativa, formativa y laboral/:A","Adecuacion entre oferta y demanda de mercado de trabajo/:A","Promocion del aprendizaje a lo largo de la vida/:A","Valoracion de distintas formas de aprender / de cualificarse/:A","Fortalecimiento del capital humano/:A","Alineacion de la educaci�n y la formaci�n con las necesidades del sector productivo/:A","Plataforma del Sistema Nacional de Cualificaciones/:A","Marco Nacional de Cualificaciones/:A","Subsistema de evaluaci�n y certificaci�n de competencias/:A","Esquema de movilidad educativa y formativa/:A","Subsistema de normalizaci�n de competencias/:A","Subsistema de aseguramiento de la calidad de la formaci�n para el trabajo/:A","Se evidencia la consulta y an�lisis de informaci�n relacionada con Sistemas de Cualificaciones, por ejemplo: cat�logos de ocupaciones, Marcos de Cualificaciones, v�as de cualificaci�n, mecanismos de reconocimiento, herramientas o sistemas de informaci�n asociados a cualificaciones/:A","Hace referencia a la relaci�n (conceptual, operativa o estrat�gica) entre los componentes del Sistema Nacional de Cualificaciones y posibles elementos comunes entre componentes/:A","Interoperabilidad con otros sistemas: Mesas sectoriales SENA, Bases de datos de Certificaci�n de Competencias/:A","Interoperabilidad con otros sistemas: SPE vacantes, SPE hojas de vida/:A", "CalificarPropuesta"};
		String[] str_propuesta = {"propuesta", "La propuesta es consistente con el entendimiento del problema/:A","La propuesta toma en consideraci�n los niveles de usuarios y los tipos de informaci�n que se les debe proveer/:A","De ser realizada ayudar�a a cumplir los objetivos de la pol�tica p�blica/:A","Metodologia de priorizaci�n de requerimientos funcionales/:A","La propuesta es adecuada a un contexto de pol�tica p�blica/:A","Coherencia entre requerimientos priorizados/:A","Estadisticas y visualizaciones (requerimientos)/:A", "CalificarPropuesta"};
		String[] str_valoragregado = {"valoragregado", "entendimiento/:A","personalizacion/:M", "CalificarPropuesta"};
		String[] str_procesosFuncionalidades = {"procesosFuncionalidades", "entendimiento/:A","personalizacion/:M", "CalificarPropuesta"};

	public static void main(String[] args) {
		new Enfoque().run();
		
	}
	
	protected void run() {
		Control cntrol = new Control ();
		
		/* solicitd */ Cmpnnt_EvaluarProblema cmpntentendimiento = new Cmpnnt_EvaluarProblema(str_entendimiento);
		/* solicitd */ Cmpnnt_EvaluarProblema cmpntpropuesta = new Cmpnnt_EvaluarProblema(str_propuesta);
		/* solicitd */ Cmpnnt_EvaluarProblema cmpntvaloragregado = new Cmpnnt_EvaluarProblema(str_valoragregado);
		/* solicitd */ Cmpnnt_EvaluarProblema cmpntprocesosFuncionalidades = new Cmpnnt_EvaluarProblema(str_procesosFuncionalidades);
		
		/* llamador */ cntrol.setComando(0, cmpntentendimiento);
		/* llamador */ cntrol.setComando(1, cmpntpropuesta);
		/* llamador */ cntrol.setComando(2, cmpntvaloragregado);
		/* llamador */ cntrol.setComando(3, cmpntprocesosFuncionalidades);

		cntrol.llamarEvaluacion(0);
		cntrol.llamarEvaluacion(1);
		cntrol.llamarEvaluacion(2);
		cntrol.llamarEvaluacion(3);
		
		System.out.println("--- Total " + cntrol.getTotal());
	}
}
