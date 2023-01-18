package practicasII;

public class Gato extends Animal {

	public Gato() {
	
	}

	public Gato(String nombre, String comida, int edad, String raza) {
		 super(nombre,comida,edad,raza);
	}
	
	public void mostrarDatos() {
		System.out.println("Gato");
		
	}
	

	@Override
	public void Alimentacion() {
    System.out.println("Se alimenta de alimento balanceado sabor a pescado /pollo ");
	}

	public void Info() {
		System.out.println(nombre + comida + edad + raza );
	}
	
}
