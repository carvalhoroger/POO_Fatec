package ex_01;

import java.util.Scanner;


public class ex01 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Entrar via teclado com a base e a altura de um retângulo,
		//calcular e exibir sua área.

		Scanner ler = new Scanner(System.in);

		int a, b;

		System.out.printf("Informe a base do retângulo: ");
		a = ler.nextInt();
		System.out.printf("Informe a altura do retângulo: ");
		b = ler.nextInt();
		
		System.out.printf("O valor da área desse retângulo é: %d", a*b);
}


}