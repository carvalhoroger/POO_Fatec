package ex_08;

import java.util.Scanner;

public class ex08 {
	//Entrar via teclado, com dois valores distintos. Exibir o maior deles.
	
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
			System.out.printf("\nO maior valor é %.2f",b);
			}
			else {
			System.out.printf("\nO maior valor é %.2f .",a);
			}
	}
}
