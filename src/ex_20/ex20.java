package ex_20;

import java.util.Scanner;

public class ex20 {

	//Uma escola com cursos em regime semestral realiza duas avaliações durante o semestre e calcula a média do aluno, da seguinte maneira:
	//MEDIA = (P1 + 2.P2) / 3
	//Fazer um programa para entrar via teclado com o valor da primeira nota (P1) e o programa deverá calcular 
	//e exibir quanto o aluno precisa tirar na segunda nota minimamente (P2) para ser aprovado, sabendo que a média de aprovação é igual a cinco.


		public static void main(String[] args) {
			
			Scanner ler = new Scanner(System.in);
			
			double p1, p2, media=5;
			
			System.out.printf("Digite a nota da P1: ");
			p1 = ler.nextDouble();
			
			p2=((3*media) - p1)/2;
			
			System.out.printf("Você precisa de %.1f  na P2 para passar. ",p2);
					
	}
	
}
