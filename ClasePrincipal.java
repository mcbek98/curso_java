package com.incyde;

import java.util.Scanner;

public class ClasePrincipal
{
	boolean siDisponible = false;
	static float capital;
	static float precio = 7.5f ;
	static int horaIda;
    static  int horaPase_1 = 7 ;
	static int horaPase_2 = 9 ;
	static int horaSugerida ;
	static Scanner teclado;
	 
	
	public static void main(String[] args) {
		boolean resultadoCine;
		String siSalir;
		teclado = new Scanner (System.in);
		System.out.println("Programa Cine V4");
		
		do {
		    pedirDatos(); 
		    resultadoCine = comprobarSiVamosAlCine();
		    mostrarResultado (resultadoCine);
		    System.out.println ("Desea continuar (s/n)");
		    teclado.nextLine();
		    siSalir = teclado.nextLine();
		}while (siSalir.equals("s") || siSalir.equals("S"));
		teclado.close();
		System.out.println ("Fin del programa");

	}
	public static void pedirDatos () {
		{
		Scanner teclado ;
		teclado= Scanner ();
		 System.out.println( " Introduzca su dinero" );
		 capital = teclado.nextFloat();
		 System.out.println (" ¿ A que hora desea ir ? : " );
		 horaIda = teclado.nextInt ();
		 teclado.close();
		 return; 
		 }
		 
	}
	public static boolean comprobarSiVamosAlCine() 
	{
		/*if (( capital >= precio)
		     && ((horaIda >= horaPase_1  && horaIda <= horaPase_1) 
		      || ((horaIda >= horaPase_2  && horaIda <= horaPase_2)))) {
		}*/
		    		  		
		if ( capital >= precio ) {
			if (horaIda >= horaPase_1 -1  && horaIda <= horaPase_1 ) {
				horaSugerida = horaPase_1;
				return true;
			}
			else
				if  (horaIda >= horaPase_2 -1 && horaIda <= horaPase_2 ) {
					horaSugerida = horaPase_2;
					return true;
				}

					if (horaIda  == horaSugerida)
						return true;
		
		             }
		                return false;
	 }
	public static void mostrarResultado ( boolean resultado ) {
		if (resultado == true ) {
		System.out.println ("La hora recomendada es : " + horaSugerida);
		System.out.println ("Si que podemos ir al cine");
			
			System.out.println (" NO que podemos ir al cine " );
		} else {
			System.out.println ( " NO podemos ir al cine " ) ;
			}
			
		
		}	
	
	}
	

		
