
package hwo.evtool.dataeval;

public class AdaptadorCriterioTecnica implements DataEvaluacion {
	String[] dataProblema = {"5","4","3","2","1","0"};
	String name; 
	
	public AdaptadorCriterioTecnica() {
		this.name = "AdaptadorCriterioTecnica";
	}

	@Override
	public void leerEvaluacion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String[] escribirEvaluacion(String[] dataeval) {
		return dataeval; 
	}
}
