package clases;

import java.util.HashMap;
import java.util.Map;

public class Generica <T> {
	
	private HashMap<Integer,T>hashmap1;
	
	
	public Generica()
	{
		hashmap1=new HashMap<Integer,T>();
	}
	
	public void agregarelemento(Integer numero,T values)
	{
		hashmap1.put(numero, values);
	}
	
	public void listar()
	{
		for(Map.Entry<Integer, T>entry:hashmap1.entrySet())
		{
			T el;
			
			el=entry.getValue();
			
			System.out.println(el.toString());
		}
		
	}
	
	
	
}
