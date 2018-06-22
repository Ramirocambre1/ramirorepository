package clases;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;

public class Hashmap <T> {
	
	private HashMap<Integer,T>federacion;
	
	public Hashmap()
	{
		federacion=new HashMap<>();
	}
	
	public void agregarelemento(int numero,T t)
	{
		
		federacion.put(numero, t);
	}
	
	

	public void listar()
	{
		Persona el;
		
		for(Map.Entry<Integer, T> entry:federacion.entrySet())
		{
			el=(Persona)entry.getValue();
			
			System.out.println(el.toString());
			
		}
		
	}
	
	public  void agregaraJSONArray(JSONArray a) throws JSONException
	{
		Persona el;
		for(Map.Entry<Integer, T>entry:federacion.entrySet())
		{
			el=(Persona)entry.getValue();
			a.put(el.getJsonobject());
			
		}
		
	}
	
	public int getSize()
	{
		return federacion.size();
		
	}
	
	

	
}
