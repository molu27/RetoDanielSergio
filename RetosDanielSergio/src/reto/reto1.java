package reto;


import java.util.Scanner;

import reto.funciones1;
import reto.funciones2;
import reto.Funciones;

public class reto1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero1 = 0;
		int numero2 = 0;
		int num = 0;
	do {
		
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		System.out.println("5. Par");
		System.out.println("6. Impar");
		System.out.println("7. Positivo");
		System.out.println("8. Negativo");
		System.out.println("0. Salir");
		System.out.println("Elige la operación:");
		String numero = sc.nextLine();
		 num = Integer.parseInt(numero);
		 int n1 = 0;
		 int n2 = 0;
		
		switch (num) {
		case 1:
			n1=Funciones.dimeEntero("Dime numero1", sc );
			n2=Funciones.dimeEntero("Dime numero2", sc );
			System.out.println("La suma es " + (funciones1.sumar(n1, n2)));
			break;
			
		case 2:
			n1=Funciones.dimeEntero("Dime numero1", sc );
			n2=Funciones.dimeEntero("Dime numero2", sc );
			System.out.println("La resta es " + (funciones1.restar(n1, n2)));
			break;
		case 3:
			n1=Funciones.dimeEntero("Dime numero1", sc );
			n2=Funciones.dimeEntero("Dime numero2", sc );
			
			System.out.println("La multiplicación es " + (funciones2.multiplicar(n1, n2)));
			break;
		case 4:
			n1=Funciones.dimeEntero("Dime numero1", sc );
			n2=Funciones.dimeEntero("Dime numero2", sc );
			System.out.println("La división es " + (funciones2.dividir(n1, n2)));
			break;
		case 5:
			n1=Funciones.dimeEntero("Dime numero1", sc );
		
			System.out.println("El número es par: " + (funciones1.esPar(n1)));
			break;
		case 6:
			n1=Funciones.dimeEntero("Dime numero1", sc );
			
			System.out.println("El número es impar " + (funciones1.esImpar(n1)));
			break;
		case 7:
			n1=Funciones.dimeEntero("Dime numero1", sc );
		
			System.out.println("El número es positivo: " + (funciones2.esPositivo(n1)));
			break;
		case 8:
			n1=Funciones.dimeEntero("Dime numero1", sc );
		
			System.out.println("El número es negativo: " + (funciones2.esNegativo(n1)));
			break;
		case 0:
			System.out.println("Salir");
			break;
			
		default:
		System.out.println("Te has equivocado");
			break;
		}
	} while (num!=0);
	}
}
