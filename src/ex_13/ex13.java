package ex_13;

import java.util.Scanner;

public class ex13 {

		//Entrar via teclado com três valores distintos. Exibir o maior deles.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);

	float a, mai=0, men=0;
	
		
		for(int i = 0; i <= 2; i++) {
			
			System.out.printf("Informe %dº número: ",i+1);
			a = ler.nextFloat();
			
			if(i == 0) {
				men = mai = a; 
			}
			else{
				
				if(a > mai) {
					mai = a;
				}

				if(a < men) {
					men = a;
				}
			}
		}
		
		System.out.printf("\nO maior número é : %.2f.", mai);

			
	}
}
