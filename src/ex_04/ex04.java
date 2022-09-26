package ex_04;

import java.util.Scanner;

public class ex04 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados.

		Scanner ler = new Scanner(System.in);

		float a, b, c, d;
		

		System.out.printf("Cálculo de média aritmética!\n");
		
		
		System.out.printf("\nInforme o 1º valor: ");
		a = ler.nextFloat();
		System.out.printf("\nInforme o 2º valor: ");
		b = ler.nextFloat();
		System.out.printf("\nInforme o 3º valor: ");
		c = ler.nextFloat();
		System.out.printf("\nInforme o 4º valor: ");
		d = ler.nextFloat();
		
		System.out.printf("\nA média aritmética para os valores inseridos é: %.2f", (a+b+c+d)/2);
}
}
