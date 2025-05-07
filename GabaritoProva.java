package aula11;

import java.util.Scanner;

public class GabaritoProva {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int totalAcertos = 0;
		int totalAlunos = 0;
		int escolha;
		double nota = 0;
		double media = 0;
		double somaNotas = 0;
		String resposta;
		
		do {
			nota = 0;
			totalAcertos = 0;
			System.out.println("Informe a resposta da primeira questão: ");
			resposta = ler.next();
			
			 if (resposta.equals("A")) {
				 totalAcertos++;
				 nota++;
			 }
			
			System.out.println("Informe a resposta da segunda questão: ");
			resposta = ler.next();
				 
			if (resposta.equals("B")) {
				totalAcertos++;
				nota++;
			}
			
			System.out.println("Informe a resposta da terceira questão: ");
			resposta = ler.next();
					 
			if (resposta.equals("C")) {
				totalAcertos++;
				nota++;
			}
			
			System.out.println("Informe a resposta da quarta questão: ");
			resposta = ler.next();
						 
			if (resposta.equals("D")) {
				totalAcertos++;
				nota++;
			}
			
			System.out.println("Informe a resposta da quinta questão: ");
			resposta = ler.next();
							 
			if (resposta.equals("E")) {
				totalAcertos++;
				nota++;
			 }
			
			System.out.println("Informe a resposta da sexta questão: ");
			resposta = ler.next();
			
			if (resposta.equals("E")) {
				totalAcertos++;
				nota++;
			}
			System.out.println("Informe a resposta da sétima questão: ");
			resposta = ler.next();
			
			if (resposta.equals("D")) {
				totalAcertos++;
				nota++;
			}
			System.out.println("Informe a resposta da oitava questão: ");
			resposta = ler.next();
			
			if (resposta.equals("C")) {
				totalAcertos++;
				nota++;
			}
			System.out.println("Informe a resposta da nona questão: ");
			resposta = ler.next();
			
			if (resposta.equals("B")) {
				totalAcertos++;
				nota++;
			}
			System.out.println("Informe a resposta da décima questão: ");
			resposta = ler.next();
			
			if (resposta.equals("A")) {
				totalAcertos++;
				nota++;
			}
			
			System.out.println("Nota: " + nota);
			System.out.println("Acertos: " + totalAcertos);
			
			somaNotas += nota;
			
			totalAlunos ++;
			System.out.println("Outro aluno irá utilizar o sistema? 1(Sim) 2(Não)");
			escolha = ler.nextInt();
						
		} while (escolha == 1);
		
		media = somaNotas/totalAlunos;
		
		System.out.println("A média da sala é " + media);
		System.out.println("Total de alunos: " + totalAlunos);
		
		ler.close();
	}
	

}

