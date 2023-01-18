package practicasII;

public class Caballo extends Animal {

	public Caballo() {
		
	}

	public Caballo(String nombre, String comida, int edad, String raza) {
   super(nombre,comida,edad,raza);
	}

	
	public void mostrarDatos() {
		System.out.println("Caballo" );
	}
	
	@Override
	public void Alimentacion() {
		System.out.println("El caballo se alimenta de pasto y agua");
	}

	public void Info() {
		System.out.println(nombre + comida + edad + raza );
	}
	
}
