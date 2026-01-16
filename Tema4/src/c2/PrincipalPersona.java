package c2;

import java.util.Scanner;

public class PrincipalPersona {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		// --- Persona 1 ---
		
		System.out.println("----Datos Persona 1----");
		
		System.out.println("Introduce su nombre: ");
		String nombre1 = sc.nextLine();
		
		System.out.println("Introduce su apellido: ");
		String apellidos1 = sc.nextLine();
		
		System.out.println("Introduce su edad: ");
		int edad1 = sc.nextInt();
		
		// Limpiamos el buffer 
		sc.nextLine();
		
		System.out.println("Introduce su DNI: ");
		
		String dni1 = sc.nextLine();
		
		// Creamos objeto Persona 1
		Persona p1 = new Persona(dni1, nombre1, apellidos1, edad1);
		
		// Calculamos mayor de edad
		String mayorEdad1;

        if (p1.getEdad() >= 18) { 
            mayorEdad1 = " es mayor de edad";
        } else {
            mayorEdad1 = " no es mayor de edad";
        }
		
		// --- Persona 2 ---
		System.out.println("----Datos Persona 2----");
		
		System.out.println("Introduce su nombre: ");
		String nombre2 = sc.nextLine();
		
		System.out.println("Introduce su apellido: ");
		String apellidos2 = sc.nextLine();
		
		System.out.println("Introduce su edad: ");
		int edad2 = sc.nextInt();
		
		sc.nextLine(); // Limpiar buffer
		
		System.out.println("Introduce su DNI: ");
		String dni2 = sc.nextLine();
	
		Persona p2 = new Persona(dni2, nombre2, apellidos2, edad2);

		// Calculamos mayor de edad para p2
		String mayorEdad2;
     
        if (p2.getEdad() >= 18) {
            mayorEdad2 = " es mayor de edad";
        } else {
            mayorEdad2 = " no es mayor de edad";
        }
        
		// --- IMPRIMIR DATOS ---
		System.out.println("----RESULTADOS----");
		System.out.println(p1.getNombre() + " " + p1.getApellidos() + " con DNI " + p1.getDni() + mayorEdad1);
		
		System.out.println(p2.getNombre() + " " + p2.getApellidos() + " con DNI " + p2.getDni() + mayorEdad2);
		
		sc.close();
	}
}