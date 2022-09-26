package ex_02;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);

		//2. Calcular e exibir a área de um quadrado,
		//a partir do valor de sua aresta que será digitado. 

		double a;

		System.out.printf("Informe o valor das lados do quadrado: ");
		a = ler.nextDouble();

		a = Math.pow(a, 2);

		System.out.printf("A área do quadrado é: %.0f", a);
		
	}
}
