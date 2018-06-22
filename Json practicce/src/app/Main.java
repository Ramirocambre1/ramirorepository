package app;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import clases.Entrenador;
import clases.Hashmap;
import clases.Persona;

public class Main {

	public static void main(String[] args) {
		
		Hashmap hashmap1=new Hashmap();
		Persona persona1 = new Persona("Ramiro","Cambre",20);
		Persona persona2= new Persona("Ivan","Kappa",12);
		Entrenador entrenador1=new Entrenador("LOL","jiiji",40,"tu vieja en tanga","Noice");
		
		
		hashmap1.agregarelemento(1, persona1);
		hashmap1.agregarelemento(2, persona2);
		hashmap1.agregarelemento(3, entrenador1);
		
		JSONArray jsonarray=new JSONArray();
		JSONObject jsonObject=new JSONObject();
		int i=0;
		try {
			jsonObject.put("Cantidad",hashmap1.getSize());
			hashmap1.agregaraJSONArray(jsonarray);
		} catch (JSONException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		
		
		
		String salida=jsonarray.toString();
		
		System.out.println(salida);

	}

}
