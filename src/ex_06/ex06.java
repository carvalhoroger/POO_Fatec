package ex_06;

import java.util.Scanner;

public class ex06 {

	//Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de dólares. 
	//Calcular e exibir o valor correspondente em Reais (R$).
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner ler = new Scanner(System.in);

		float a, b;
		

		System.out.printf("## Conversão Dólar x Real. ##\n");
		
		
		System.out.printf("\nDigite o valor da cotação para conversão: ");
		a = ler.nextFloat();

		System.out.printf("\nDigite o valor em DÓLAR para conversão: ");
		b = ler.nextFloat();
		
		System.out.printf("\n%.2f em Dólar representa %.2f em Real.", a, a*b);
}
}
