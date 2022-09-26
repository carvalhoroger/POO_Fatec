package ex_53;

import java.util.Scanner;

public class ex53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crie uma classe conforme o Diagrama de Classe (UML). Crie um programa que utilize essa classe para cadastrar 5 alunos 
		 * em uma lista de alunos. Durante o cadastro do aluno, solicitar para o aluno cadastrar a sigla/iniciais das 6 matérias 
		 * que ela está cursando no momento. Ao final exibir apenas os alunos do período “noite”.
		 */
		
		//Scanner ler = new Scanner(System.in);
				
		Aluno53 [] listaAluno = new Aluno53[5];
        
        try (Scanner ler = new Scanner (System.in)) {
            for (int i=0; i<5; i++) {
                
            Aluno53 a = new Aluno53();
            
            System.out.printf("Digite o RA: ");
            a.ra = ler.next();
            
            System.out.printf("Digite o nome: ");
            a.nome = ler.next();
            
           // System.out.printf("Digite o período: ");
           // a.periodo = ler.next();
            
            do{
            System.out.printf("Digite o periodo (noite | manha | tarde): ");
            a.periodo = ler.next();
            }while(a.periodo .equals("noite") && a.periodo .equals("manha") && a.periodo .equals("tarde"));
            
            for (int j=0;j<6;j++)
            {
            System.out.printf("Digite as iniciais das materias: ");
            a.materias[j] = ler.next();
            }
            
            System.out.printf("\n");
            
            listaAluno [i] = a;
            
            }
        }
        
        for (int k=0; k<5; k++)
        {
            if(listaAluno[k].periodo .equals("noite"))        
            {    
            System.out.printf("\nRA: %s \nNome: %s \nPeriodo: %s", listaAluno[k].ra, listaAluno[k].nome, listaAluno[k].periodo);
            }    
        }    
    }    

	}

