package ex_11;

import java.util.Scanner;

public class ex11 {

	//Calcular e exibir a área de um retângulo, a partir dos valores da base e altura que serão digitados. 
	//Se a área for maior que 100, exibir a mensagem “Terreno grande”.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);

		float a, b, c;

		System.out.printf("Informe a base do retângulo: ");
		a = ler.nextFloat();
		System.out.printf("Informe a altura do retângulo: ");
		b = ler.nextFloat();
		
		c = a * b;
		
		if(c > 100){
		System.out.printf("\nO terreno é grande, cuja área corresponde a: %.2",c);
		}
		else {
			System.out.printf("O valor da área desse retângulo é: %.2f", c);
		}
		
		
	}
}
