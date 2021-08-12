
package hwo.evtool.propuesta.tecnica;

import java.util.HashMap;
import java.util.Map;

class AdaptadorCriterioTecnica {
	Map<String, String> dataTecnica = new HashMap<String, String>();
	String name; 
	
	public AdaptadorCriterioTecnica() {
		this.name = "AdaptadorCriterioTecnica";
	}

	public String leerEvaluacion() {
		String str_data;

		str_data = dataTecnica.get("item") + ", ";
		for (int i = 1; i <= dataTecnica.size() - 2; i++) {
			str_data += dataTecnica.get("i"+i) + ", ";
		}
		str_data += dataTecnica.get("tipo");
		
		return str_data;
	}

	public Map<String, String> escribirEvaluacion(String[] evaldata) {
		dataTecnica.put("item", evaldata[0]);
		dataTecnica.put("tipo", evaldata[evaldata.length - 1]);
		for (int i = 1; i <= evaldata.length - 2; i++) {
			String[] str_campo = evaldata[i].split("/:"); 
			dataTecnica.put("i"+i, str_campo[1]);
		}
		
		return dataTecnica;
	}
}
