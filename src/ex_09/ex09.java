package ex_09;

import java.util.Scanner;

public class ex09 {

		//Entrar via teclado, com dois valores distintos. Exibir o menor deles.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner ler = new Scanner(System.in);

		float a, b;
		

		System.out.printf("## Identificação do maior valor. ##\n");
		
		
		System.out.printf("\nInforme o valor do 1º valor: ");
		a = ler.nextFloat();
		System.out.printf("\nInforme o valor do 2º valor: ");
		b = ler.nextFloat();

		
			if(a < b) {
			System.out.printf("\nO menor valor é %.2f",a);
			}
			else {
			System.out.printf("\nO menor valor é %.2f .",b);
			}
	}
}
