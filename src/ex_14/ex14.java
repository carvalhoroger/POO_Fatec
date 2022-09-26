package ex_14;

import java.util.Scanner;

public class ex14 {

	//Entrar com o peso e a altura de uma determinada pessoa. Após a digitação, exibir se esta pessoa está ou não com seu peso ideal. 
	//Fórmula: peso/altura².

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);

		double a, b, imc;
		
		System.out.printf("## Peso Ideal ##\n");

		System.out.printf("Informe o peso da pessoa: ");
		a = ler.nextDouble();
		System.out.printf("Informe a altura da pessoa: ");
		b = ler.nextDouble();
		
		imc = a / Math.pow(b, 2);
		
		if(imc < 20){
			System.out.printf("\nEssa pessoa está abaixo do peso com imc = %.2f.", imc);
		}
		else if(imc >= 20 && imc < 25){
			System.out.printf("\nEssa pessoa está com peso ideal com imc = %.2f.", imc);
		}
		else {
			System.out.printf("\nEssa pessoa está acima do peso com imc = %.2f.", imc);
		}

		
	}
}
