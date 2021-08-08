package hwo.evtool.dataeval.del;

import java.util.Map;

public interface DataEvaluacion {
	String leerEvaluacion ();
	Map<String, String> escribirEvaluacion(String[] evaldata);
}

