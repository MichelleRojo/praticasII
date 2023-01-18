package practicasII;

public class MainAnimal extends Animal {

	public static void main(String[] args) {
	
    Perro perro = new Perro(" Luna" , "come  Dogui , su edad es de :", 7 , "su raza es caniche ");
    perro.mostrarDatos();
    perro.Alimentacion();
    perro.Info();
    
    Gato gato =new Gato(" Luz" , "  Su Alimento es balanceado , su edad es de : ", 3 , " este animal no es de raza ");
    gato.mostrarDatos();
    gato.Alimentacion();
	gato.Info();
	
	Caballo caballo =new Caballo(" Larguirucho" , " come pasto, su edad es de : ", 5 , " es muy fuerte no es de raza ");
	
	caballo.mostrarDatos();
	caballo.Alimentacion();
	caballo.Info();
	}

	
	}


    
	

   
   

