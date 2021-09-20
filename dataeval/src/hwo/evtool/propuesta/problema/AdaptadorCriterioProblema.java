package hwo.evtool.propuesta.problema;

import java.util.HashMap;
import java.util.Map;

class AdaptadorCriterioProblema {
	Map<String, String> dataProblema = new HashMap<String, String>();
	String name; 
	
	public AdaptadorCriterioProblema() {
		this.name = "AdaptadorCriterioProblema";
	}

	public String leerEvaluacion() {
		String str_data;

		str_data = dataProblema.get("item") + ", ";
		for (int i = 1; i <= dataProblema.size() - 2; i++) {
			str_data += dataProblema.get("i"+i) + ", ";
		}
		str_data += dataProblema.get("tipo");
		
		return str_data;
	}

	public Map<String, String> escribirEvaluacion(String[] evaldata) {
		dataProblema.put("tipoitem", evaldata[0]);
		dataProblema.put("item", evaldata[1]);
		dataProblema.put("tipo", evaldata[evaldata.length - 1]);
		for (int i = 1; i <= evaldata.length - 3; i++) {
			String[] str_campo = evaldata[i+1].split("/:"); 
			dataProblema.put("i"+i, str_campo[1]);
		}
		
		return dataProblema;
	}}

