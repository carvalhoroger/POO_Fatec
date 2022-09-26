package ex_19;

import java.util.Scanner;

public class ex19 {

	//Uma escola com cursos em regime semestral, realiza duas avaliações durante o semestre e calcula a média do aluno, 
	//da seguinte maneira:
	//MEDIA = (P1 + 2.P2) / 3
	//Fazer um programa para entrar via teclado com os valores das notas (P1 e P2) e calcular a média. 
	//Exibir a situação final do aluno (“Aprovado ou Reprovado”), sabendo que a média de aprovação é igual a cinco.


	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double p1, p2, media;
		
		System.out.printf("Digite a nota da P1: ");
		p1 = ler.nextDouble();
		
		System.out.printf("Digite a nota da P2: ");
		p2 = ler.nextDouble();
		
		media = (p1 + (2*p2))/3;
		
		if(media>=5) 
			System.out.printf("Sua média é de %.2f. Você foi APROVADO.", media);
		else 
			System.out.printf("Sua média é de %.2f. Você foi REPROVADO.", media);
		
		
	}
	
}
