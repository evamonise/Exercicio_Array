package Avengers;

import java.util.Scanner;

public class Exercício_3 {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("--------------NOTAS DO ALUNO--------------\n");
		System.out.print("Digite o nome do aluno(a): ");
		String nome = S.nextLine();
		double notas[] = new double[4];
		double soma = 0;
		double media;

		for (int i = 0; i < notas.length; i++) {
			System.out.print("Digite a " + (i + 1) + "° nota do aluno:  ");
			notas[i] = S.nextDouble();
			S.nextLine();
		}

		for (int i = 0; i < notas.length; i++) {
			soma += notas[i];
		}
		
		
		media = soma/notas.length;
		
		if (media >= 7) {
			System.out.printf("\nAluno(a) " + nome +", aprovado com a média: %.1f" , media);
			
			
		} else {
			System.out.printf("\nAluno(a) " + nome +", está em recuperação com a média: %.1f" , media);
			

		}
				
		S.close();

	}

}
