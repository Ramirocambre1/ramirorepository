package clases;

import java.util.HashMap;

public class Elemento {
	
	private String titulo;
	private boolean entregado;
	private String genero;
	private int duracion;
	private String creador;
	private int stock;
	HashMap<Integer, String>registros;
	
	public Elemento(int duracion)
	{
		titulo="";
		stock=0;
		entregado=false;
		genero="";
		this.duracion=duracion;
		creador="";
		registros=new HashMap<Integer,String>();
		
		
	}
	
	public Elemento(String titulo,String creador,int duracion)
	{
		this.titulo=titulo;
		stock=0;
		entregado=false;
		genero="";
		this.duracion=duracion;
		this.creador=creador;
		registros=new HashMap<Integer,String>();
		
	}
	
	public Elemento(String titulo,int duracion)
	{
		this.titulo=titulo;
		stock=0;
		entregado=false;
		genero="";
		this.duracion=duracion;
		creador="";
		registros=new HashMap<Integer,String>();
	}
	
	public Elemento(String titulo,String genero,int duracion,String creador)
	{
		this.titulo=titulo;
		stock=0;
		entregado=false;
		this.genero=genero;
		this.duracion=duracion;
		this.creador=creador;
		registros=new HashMap<Integer,String>();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}


	@Override
	public String toString() {
		return "Elemento [titulo=" + titulo + ", entregado=" + entregado + ", genero=" + genero + ", duracion="
				+ duracion + ", creador=" + creador + "]";
	}
	
	public void entregar()
	{
		if(entregado!=true && stock>0)
		{
			entregado=true;
			stock--;
		}
		
	}
	
	public void devolver()
	{
		if(entregado!=false)
		{
			entregado=false;
			stock++;
		}
		
	}
	
	public boolean isEntregado()
	{
		return entregado;
	}
	
	public boolean compararTitulo(String titulo)
	{
		return this.titulo.equalsIgnoreCase(titulo);
		
	}
	
	public boolean comparar(int duracion)
    {
		boolean flag;
		
		if(duracion>this.duracion)
		{
			flag=true;
			
		}
		else
		{
			flag=false;
		}
    	
    	return flag;
    }
    
	public void agregarStock(int numero)
	{
		stock=stock+numero;
	}
	
	

}
