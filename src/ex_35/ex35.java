package ex_35;

import java.util.Scanner;

public class ex35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Entrar via teclado com um valor qualquer. Travar a digitação, no sentido de aceitar somente valores positivos. 
		 * Após a digitação, exibir a tabuada do valor solicitado, no intervalo de um a dez.
		 */
		Scanner ler = new Scanner(System.in);
		
		int a,x;
		
		do{	
		System.out.printf("Digite um valor de entrada (positivo)!!.");
		a= ler.nextInt();
		}
		while(a<0);
		System.out.printf("Taboada do %d",a);
		for(x=1; x<=10; x++) {			
			System.out.printf("\n %d X %d = %d",x,a,(a*x));
		}
	}

}
