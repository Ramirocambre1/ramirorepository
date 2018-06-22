package clases;

import org.json.JSONException;
import org.json.JSONObject;

public class Entrenador extends Persona {
	
	private String sistema;
	private String estilo;
	
	public Entrenador(String nombre, String apellido, int edad,String sistema,String estilo) {
		super(nombre, apellido, edad);
		this.sistema=sistema;
		this.estilo=estilo;
		// TODO Auto-generated constructor stub
	}

	public String getSistema() {
		return sistema;
	}

	public void setSistema(String sistema) {
		this.sistema = sistema;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	
	public JSONObject getJsonobject() throws JSONException 
	{
		
		JSONObject jsonObject = new JSONObject();
		jsonObject=super.getJsonobject();
		jsonObject.put("Sistema", sistema);
		jsonObject.put("Estilo", estilo);
		
		
		return jsonObject;
		
		
	}
	

}
