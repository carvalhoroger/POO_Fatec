package ex_45;

import java.util.Scanner;

public class ex45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Entrar via teclado com “N” valores quaisquer. O valor “N” (que representa a quantidade de números) será digitado, deverá ser positivo, mas menor que vinte. Caso a quantidade não satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente. Após a digitação dos “N” valores, exibir:
		a) O maior valor;
		b) O menor valor;
		c) A soma dos valores;
		d) A média aritmética dos valores;
		e) A porcentagem de valores que são positivos;
		f) A porcentagem de valores negativos;
		 */
		
		Scanner ler = new Scanner(System.in);
		int n;
		double numero, maior = 0, menor = 0, media = 0, percNeg = 0, soma = 0;
		System.out.printf("Quantos numeros serão inseridos?: ");
		n = ler.nextInt();
		while(n < 1 || n > 20) 
		{
			System.out.printf("Valor invalido! insira entre 1 e 20: ");
			n = ler.nextInt();
		}
		for(int x = 0; x < n; x++) 
		{
			System.out.printf("Insira um numero: ");
			numero = ler.nextDouble();
			if(numero > maior || x == 0)
			{
				maior = numero;
			}
			if(numero < menor || x == 0)
			{
				menor = numero;
			}
			if(numero < 0)
			{
				percNeg += 1;
			}
			soma += numero; 
		}
		media = media/n;
		System.out.printf("O maior valor e: %.2f\n", maior);
		System.out.printf("O menor valor e: %.2f\n", menor);
		System.out.printf("A soma dos valores e: %.2f\n", soma);
		System.out.printf("A media e: %.2f\n", media);
		System.out.printf("A porcentagem dos valores positivos e: %.2f%%\n", ((n-percNeg)*100)/n);
		System.out.printf("A porcentagem dos valores negativos e: %.2f%%\n", (percNeg*100)/n);

	}

}
