package ex_03;

import java.util.Scanner;

public class ex03 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.

		Scanner ler = new Scanner(System.in);

		int b, h;

		System.out.printf("Informe a base do triângulo: ");
		b = ler.nextInt();
		System.out.printf("Informe a altura do triângulo: ");
		h = ler.nextInt();
		
		System.out.printf("O valor da área desse triângulo é: %d", b*h/2);
}
}
