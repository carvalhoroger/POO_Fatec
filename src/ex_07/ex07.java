package ex_07;

import java.util.Scanner;

public class ex07 {
	
	// Entrar via teclado com o valor de cinco produtos. Após as entradas, 
	//digitar um valor referente ao pagamento da somatória destes valores. 
	//Calcular e exibir o troco que deverá ser devolvido.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner ler = new Scanner(System.in);

		float a, b, c, d, e, pag, s;
		

		System.out.printf("## Cálculo do troco do pagamento. ##\n");
		
		
		System.out.printf("\nInforme o valor do 1º produto: ");
		a = ler.nextFloat();
		System.out.printf("\nInforme o valor do 2º produto: ");
		b = ler.nextFloat();
		System.out.printf("\nInforme o valor do 3º produto: ");
		c = ler.nextFloat();
		System.out.printf("\nInforme o valor do 4º produto: ");
		d = ler.nextFloat();
		System.out.printf("\nInforme o valor do 5º produto: ");
		e = ler.nextFloat();
		
		s = a+b+c+d+e;
		
		System.out.printf("\nInforme o valor do pagamento: ");
		pag = ler.nextFloat();
		
		if(pag<s) {
			System.out.printf("\nO total dos produtos deu %.2f e o valor pago %.2f é insuficiente.",s , pag);

			
		}
		else {
			System.out.printf("\nO total dos produtos deu %.2f e o troco é %.2f .",s , pag-s);
		}
}
}
