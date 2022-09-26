package ex_16;

import java.util.Scanner;

public class ex16 {

	//Verificar se três valores quaisquer (A, B, C) que serão digitados formam ou não um triângulo retângulo. 
	//Lembre-se que o quadrado da hipotenusa é igual a soma dos quadrados dos catetos.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);

		float a, b, c;

		System.out.printf("\nInforme o valor do 1º valor: ");
		a = ler.nextFloat();
		System.out.printf("\nInforme o valor do 2º valor: ");
		b = ler.nextFloat();
		System.out.printf("\nInforme o valor do 2º valor: ");
		c = ler.nextFloat();
		
		
		if(a + b > c && b + c > a && a + c > b){
			System.out.printf("Os 3 lados formam um triângulo!");
			
			if((Math.pow(a, 2) == ((Math.pow(b, 2)+Math.pow(c, 2))))){
				System.out.printf("\nÉ um triângulo retângulo.");
			}
			else if((Math.pow(b, 2) == ((Math.pow(a, 2)+Math.pow(c, 2))))){
				System.out.printf("\nÉ um triângulo retângulo.");
			}
			else if((Math.pow(c, 2) == ((Math.pow(a, 2)+Math.pow(b, 2))))){
				System.out.printf("\nÉ um triângulo retângulo.");
			}
			else {
				System.out.printf("\nNão é um triângulo retângulo.");
			}
		}
		else{
			System.out.printf("\nOs 3 lados NÃO formam um triângulo!");
		}
		
	}
}
