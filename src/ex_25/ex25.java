package ex_25;

import java.util.Scanner;

public class ex25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Faça um algoritmo para receber um número qualquer e informar na tela se é par ou ímpar. Utilize o operador %
		 */
		Scanner ler = new Scanner(System.in);
		
		int a;
		
		System.out.printf("Digite um valor: ");
		a = ler.nextInt();
		
		if(a%2 == 0) {
			System.out.printf("O valor digitado é par! ");
		}else {
			System.out.printf("O valor digitado é ímpar! ");
		}
	}

}
