package clases;

public class Gato  extends Animal{

	public Gato(String raza, int velocidad, String hablar) {
		super(raza, velocidad, hablar);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void cantar() {
		System.out.println("Miau");
		
	}
	

}
