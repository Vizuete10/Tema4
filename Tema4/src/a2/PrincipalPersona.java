package a2;

import java.util.Scanner;

public class PrincipalPersona {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
	
		// Persona 1
		
		Persona p1 = new Persona();
		
		System.out.println("----Datos Persona 1----");
		
		System.out.println("Introduce su nombre: ");
		p1.nombre = sc.nextLine();
		
		System.out.println("Introduce su apellido: ");
		p1.apellidos = sc.nextLine();
		
		System.out.println("Introduce su edad: ");
		p1.edad = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Introduce su DNI: ");
		p1.dni = sc.nextLine();
		
		String mayorEdad1;
        if (p1.edad >= 18) {
            mayorEdad1 = " es mayor de edad";
        } else {
            mayorEdad1 = " no es mayor de edad";
        }
		
		// Persona 2
		
		Persona p2 = new Persona();
		
		System.out.println("----Datos Persona 2----");
		
		System.out.println("Introduce su nombre: ");
		p2.nombre = sc.nextLine();
		
		System.out.println("Introduce su apellido: ");
		p2.apellidos = sc.nextLine();
		
		System.out.println("Introduce su edad: ");
		p2.edad = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Introduce su DNI: ");
		p2.dni = sc.nextLine();
	
		String mayorEdad2;
        if (p2.edad >= 18) {
            mayorEdad2 = " es mayor de edad";
        } else {
            mayorEdad2 = " no es mayor de edad";
        }
        
		// Imprimimos los datos de cada persona
		
		System.out.println(p1.nombre + p1.apellidos +"con DNI " + p1.dni + mayorEdad1 );
		
		System.out.println(p2.nombre + p2.apellidos +"con DNI " + p2.dni + mayorEdad2 );
		
		sc.close();
	
	}
}
