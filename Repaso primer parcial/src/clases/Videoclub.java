package clases;

import java.util.HashMap;
import java.util.Map;

public class Videoclub {
	
	private int entregados;
	private HashMap<Integer,Elemento>elementos;
	
	public Videoclub()
	{
		elementos=new HashMap<Integer,Elemento>();
	}
	
	public void agregarElementos(Integer numero,Elemento e)
	{
		elementos.put(numero, e);
	}
	
	public boolean eliminarElemento(Integer numero )
	{
		boolean flag = false;
		Elemento el;
		
		for(Map.Entry<Integer,Elemento> entry:elementos.entrySet())
		{
			el=(Elemento)entry.getValue();
			
			if(entry.getKey()==numero && el.isEntregado() )
			{
				elementos.remove(numero);
				flag=true;
			}
			else
			{
				flag=false;
			}
			
		}
		
		return flag;
	}
	
	public void listar()
	{
		Elemento el;
		
		for(Map.Entry<Integer, Elemento> entry:elementos.entrySet())
		{
			el=(Elemento)entry.getValue();
			
			System.out.println(el.toString());
			
		}
		
	}
	
	public void entregar(Integer numero)
	{
		Elemento el;
		
		for(Map.Entry<Integer, Elemento>entry:elementos.entrySet())
		{
			el=(Elemento)entry.getValue();
			
			if(numero==entry.getKey()&& el.isEntregado()==false )
			{
				el.entregar();
			}
		}
		
		entregados++;
	}
	
	public void devolver(Integer numero)
	{
		Elemento el;
		
		for(Map.Entry<Integer, Elemento>entry:elementos.entrySet())
		{
			el=(Elemento)entry.getValue();
			if(numero==entry.getKey())
			{
				el.devolver();
				
				
			}
		}
		entregados--;
	}
	
	public int cantidadEntregados()
	{
		return entregados;
	}
	
	
	
	

}
