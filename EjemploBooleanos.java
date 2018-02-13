/* ProgramaEclpsT1:

 */

import java.util.Scanner;

public class ProgramaEclpsT1 {
	public static void main(String[] args) {
		boolean siIrAlCine = false;
		boolean siDisponible = false;
		double precioEntrada = 7.50 ;
		int hora = 0;
		int horaCine_1 = 21;
		int horaCine_2 = 23;
		
		
		System.out.println("introduzca su nombre");
		Scanner escaner = new Scanner(System.in);
		String nombre = escaner.nextLine();
		System.out.println("El nombre es: " + nombre + " Introduzca capital ");
	    double capital = escaner.nextDouble();
	    
	    System.out.println(" Introduzca la hora a la que puede ir: ");
	    hora = escaner.nextInt();
	   System.out.println(" Su hora de preferencia es : " + hora );

	    
	   siDisponible = siHayPase (horaCine_1 & horaCine_2, hora);
		siIrAlCine = siDisponible && siTenemosCapital(precioEntrada, capital);
		
		if (siIrAlCine)
	        System.out.println("Si podemos ir al cine");
		else
		    System.out.println("No podemos ir al cine");
		escaner.close();
		
	}
    static boolean siTenemosCapital (double precio, double capital) {
		if (capital < precio) {
		    return false;
		} else {
			return true; 
		}
	}
	static boolean siHayPase (double hora, double preferencia ) {
		if (preferencia != hora) {
			return false;
		} else {
			return true;
		}
	}
}	
