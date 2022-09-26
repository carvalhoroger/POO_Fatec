package ex_10;

import java.util.Scanner;

public class ex10 {

	//Entrar com dois valores quaisquer. Exibir o maior deles, se existir, caso contrário, 
	//enviar mensagem avisando que os números são idênticos.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner ler = new Scanner(System.in);

		float a, b;
		

		System.out.printf("## Identificação do maior valor. ##\n");
		
		
		System.out.printf("\nInforme o valor do 1º valor: ");
		a = ler.nextFloat();
		System.out.printf("\nInforme o valor do 2º valor: ");
		b = ler.nextFloat();

		
			if(a > b) {
			System.out.printf("\nO maior valor é %.2f",a);
			}
			if(b > a){
			System.out.printf("\nO maior valor é %.2f .",b);
			}
			else {
			System.out.printf("\nOs valores são idênticos .");
			}
	}
}
