package ex_24;

import java.util.Scanner;

public class ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Faça um algoritmo que leia o nome, o sexo e o estado civil de uma pessoa. Caso sexo seja “F” e estado civil seja “CASADA”, 
		 * solicitar o tempo de casada (anos).
		 */
		
		Scanner ler = new Scanner(System.in);
		
		String nome, sexo, estadoCivil;
		int anos;
		
		System.out.printf("Digite seu nome: ");
		nome = ler.nextLine();
		
		System.out.printf("Digite seu sexo (F) para feminino e (M) para masculino: ");
		sexo = ler.nextLine();
		
		System.out.printf("Digite seu estado civil:");
		estadoCivil = ler.nextLine();
		
		if(sexo .equals("F")  || estadoCivil .equals("casada")) {
			System.out.printf("Digite há quantos anos é casada:");
			anos = ler.nextInt();
			System.out.printf("Nome: %s; Sexo: %s; Estado civil: %s; Anos de casamento:%d ", nome, sexo, estadoCivil, anos);
		}
		else {
			System.out.printf("Nome: %s; Sexo: %s; Estado civil: %s.", nome, sexo, estadoCivil);
		}
	}

}
