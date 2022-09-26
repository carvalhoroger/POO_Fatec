package ex_37;

import java.util.Scanner;

public class ex37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Exibir a tabuada dos valores de um a vinte, no intervalo de um a dez. Entre as tabuadas, solicitar que o usuário pressione uma tecla.
		 */
		
		Scanner ler = new Scanner(System.in);
		int x,y;
		for(x = 1; x <= 20; x++) {
			System.out.printf("\nTabuado do %d", x);
			for(y = 1; y <= 10; y++) {
				System.out.printf("\n%d X %d = %d", y, x, (y*x));
			}
		System.out.println("\n Aperte Enter para continuar");
		ler.nextLine();

	}
	}

}
