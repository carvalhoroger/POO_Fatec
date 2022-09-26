package ex_05;

import java.util.Scanner;

public class ex05 {

	//Entrar via teclado com o valor de uma temperatura em graus Celsius, 
	//calcular e exibir sua temperatura equivalente em Fahrenheit.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		Scanner ler = new Scanner(System.in);

		float a;
		

		System.out.printf("## Conversão de Graus Celsius em Fahrenheit. ##\n");
		
		
		System.out.printf("\nDigite a termperatura que deseja converter: ");
		a = ler.nextFloat();

		
		System.out.printf("\n%.2f Graus Celsius representa %.2f em Grasu Fahrenheit.", a, ((a*9/5)+32));
}
}
