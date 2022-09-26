package ex_31;

import java.util.Scanner;

public class ex31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Criar uma rotina de entrada que aceite somente um valor positivo.
		 */
		
	Scanner ler = new Scanner(System.in);
		
		int a;
		
		do{	
		System.out.printf("Digite um valor de entrada (positivo)!!.");
		a= ler.nextInt();
		}
		while(a<0);
	}

}
