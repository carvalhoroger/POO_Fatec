package ex_26;

import java.util.Scanner;

public class ex26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  Encontrar o dobro de um número caso ele seja positivo e o seu triplo caso seja negativo, imprimindo o resultado.
		 */
		
		Scanner ler = new Scanner(System.in);
		
		int a, r;
		
		System.out.printf("Digite um valor: ");
		a = ler.nextInt();
		
		if(a < 0) {
			r = a * 3;
			System.out.printf("Resultado: %d", r);
		}else {
			r = a * 2;
			System.out.printf("Resultado: %d", r);
		}
	}

}
