package ex_32;

import java.util.Scanner;

public class ex32 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		/*
		 * Entrar com dois valores via teclado, onde o segundo deverá ser maior que o primeiro. 
		 * Caso contrário solicitar novamente apenas o segundo valor.
		 */
				
				int a,b;
				System.out.printf("Digite o primeiro valor!!.");
				a= ler.nextInt();
				
				do{	
				System.out.printf("Digite segunddo valor, sendo ele maior que o primeiro!!.");
				b= ler.nextInt();
				}
				while(a>=b);

			}
}
