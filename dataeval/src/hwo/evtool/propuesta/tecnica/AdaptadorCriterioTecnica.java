
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
		return
			dataTecnica.get("i0") + ", " + 
			dataTecnica.get("i1") + ", " +
			dataTecnica.get("i2");
	}

	public Map<String, String> escribirEvaluacion(String[] dataeval) {
		dataTecnica.put("i0", dataeval[0]);
		dataTecnica.put("i1", dataeval[1]);
		dataTecnica.put("i2", dataeval[2]);
		
		return dataTecnica;
	}
}
