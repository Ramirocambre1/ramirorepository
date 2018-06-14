package clases;

public abstract class Animal {
	
	private String raza;
	private int velocidad;
	private String hablar;
	
	public Animal(String raza,int velocidad,String hablar)
	{
		this.raza=raza;
		this.velocidad=velocidad;
		this.hablar=hablar;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public String getHablar() {
		return hablar;
	}

	public void setHablar(String hablar) {
		this.hablar = hablar;
	}
	
	public abstract void cantar();

	@Override
	public String toString() {
		return "Animal [raza=" + raza + ", velocidad=" + velocidad + ", hablar=" + hablar + "]";
	}

	

}
