
package hwo.evtool.propuesta.tecnica;

import java.util.HashMap;
import java.util.Map;

import hwo.evtool.dataeval.DataEvaluacion;

public class AdaptadorCriterioTecnica implements DataEvaluacion {
	Map<String, String> dataTecnica = new HashMap<String, String>();
	String name; 
	
	public AdaptadorCriterioTecnica(String[] evaldata) {
		this.name = "AdaptadorCriterioTecnica";
		escribirEvaluacion(evaldata);
	}

	@Override
	public String leerEvaluacion() {
		return
			dataTecnica.get("i0") + ", " + 
			dataTecnica.get("i1") + ", " +
			dataTecnica.get("i2");
	}

	@Override
	public void escribirEvaluacion(String[] dataeval) {
		dataTecnica.put("i0", dataeval[0]);
		dataTecnica.put("i1", dataeval[1]);
		dataTecnica.put("i2", dataeval[2]);

	}
}
