package ex_33;

import java.util.Scanner;

public class ex33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Entrar via teclado com o sexo de determinado usuário, aceitar somente “F” ou “M” como respostas válidas.
		 */
		
		Scanner ler = new Scanner(System.in);
		
		char a;
       
        do {
        	System.out.printf("Digite o sexo fo usuÃ¡rio (F/M): ");
            a = ler.next().charAt(0);
        }
        while(a != 'F' && a != 'M');
        
        System.out.printf("Fim da execução!");
	}

}
