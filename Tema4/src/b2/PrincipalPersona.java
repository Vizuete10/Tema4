package b2;

import java.util.Scanner;

public class PrincipalPersona {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		// Persona 1
		System.out.println("----Datos Persona 1----");
		
		// Recogemos los datos en variables auxiliares
		System.out.println("Introduce su nombre: ");
		String nombre1 = sc.nextLine();
		
		System.out.println("Introduce su apellido: ");
		String apellidos1 = sc.nextLine();
		
		System.out.println("Introduce su edad: ");
		int edad1 = sc.nextInt();
		
		// Limpiamos el buffer del scanner
		sc.nextLine();
		
		System.out.println("Introduce su DNI: ");
		String dni1 = sc.nextLine();
		
		// Instanciamos el objeto usando el constructor
		// El orden de los argumentos debe coincidir con el del constructor en Persona
		Persona p1 = new Persona(dni1, nombre1, apellidos1, edad1);
		
		// Calculamos si es mayor de edad (usando ya el objeto p1)
		String mayorEdad1;
        if (p1.edad >= 18) {
            mayorEdad1 = " es mayor de edad";
        } else {
            mayorEdad1 = " no es mayor de edad";
        }
		
		// Persona 2
		System.out.println("----Datos Persona 2----");
		
		// Recogemos los datos (podemos crear nuevas variables o reutilizar las anteriores)
		System.out.println("Introduce su nombre: ");
		String nombre2 = sc.nextLine();
		
		System.out.println("Introduce su apellido: ");
		String apellidos2 = sc.nextLine();
		
		System.out.println("Introduce su edad: ");
		int edad2 = sc.nextInt();
		
		sc.nextLine(); // Limpiar buffer del scanner
		
		System.out.println("Introduce su DNI: ");
		String dni2 = sc.nextLine();
	
		// Instanciamos el objeto p2 usando el constructor
		Persona p2 = new Persona(dni2, nombre2, apellidos2, edad2);

		// Calculamos mayor de edad para p2
		String mayorEdad2;
        if (p2.edad >= 18) {
            mayorEdad2 = " es mayor de edad";
        } else {
            mayorEdad2 = " no es mayor de edad";
        }
        
		// Imprimimos los datos de cada persona
		// Agrego un espacio en blanco en la cadena para que no salga "apellidoscon" pegado
		System.out.println(p1.nombre + " " + p1.apellidos + " con DNI " + p1.dni + mayorEdad1);
		System.out.println(p2.nombre + " " + p2.apellidos + " con DNI " + p2.dni + mayorEdad2);
		
		sc.close();
	}
}
