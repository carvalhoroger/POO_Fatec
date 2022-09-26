package ex_27;

import java.util.Scanner;

public class ex27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Faça um algoritmo que leia uma variável e some 5 caso seja par ou some 8 caso seja ímpar, imprimir o resultado desta operação.
		 */
		Scanner ler = new Scanner(System.in);
		
		int a, r;
		
		System.out.printf("Digite um valor: ");
		a = ler.nextInt();
		
		if(a % 2 == 0) {
			r = a + 5;
			System.out.printf("Resultado: %d", r);
		}else {
			r = a + 8;
			System.out.printf("Resultado: %d", r);
		}
		
	}

}
