package ex_15;

import java.util.Scanner;

public class ex15 {

	//A partir de três valores que serão digitados, verificar se formam ou não um triângulo. 
	//Em caso positivo, exibir sua classificação: “Isósceles, escaleno ou eqüilátero”. 
	//Um triângulo escaleno possui todos os lados diferentes, o isósceles, dois lados iguais e o eqüilátero, todos os lados iguais. 
	//Para existir triângulo é necessário que a soma de dois lados quaisquer seja maior que o outro, isto, para os três lados.
	
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
			
			if(a != b && a != c && b != c){
				System.out.printf("\nO triângulo é Escaleno.");
			}
			else if (a == b && a == c) {
				System.out.printf("\nO triângulo é Equilátero.");
			}
			else {
				System.out.printf("\nO triângulo é Isósceles.");
			}
		}
		else{
			System.out.printf("\nOs 3 lados NÃO formam um triângulo!");
		}
		
	}
}
