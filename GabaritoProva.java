package aula11;

import java.util.Scanner;

public class GabaritoProva {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String[] gabarito = {"A", "B", "C", "D", "E", "E", "D", "C", "B", "A"};
		int totalAlunos = 0;
		double somaNotas = 0;

		while (true) {
		totalAlunos++;
		int acertos = 0;

		System.out.println("Aluno " + totalAlunos + ", por favor, insira suas respostas (A, B, C ou D):");

		for (int i = 0; i < gabarito.length; i++) {
		System.out.print("Questão " + (i + 1) + ": ");
		String resposta = ler.nextLine();

		if (resposta.equals(gabarito[i])) {
		acertos++;
		}
		}

		double nota = acertos;
		somaNotas += nota;

		System.out.println("Você acertou " + acertos + " questões. Sua nota é: " + nota);

		System.out.print("Outro aluno vai utilizar o sistema? (S/N): ");
		String respostaOutroAluno = ler.nextLine();

		if (!respostaOutroAluno.equals("S")) {
		break;
		}
		}

		double mediaNotas = somaNotas / totalAlunos;

		System.out.println("Total de Alunos que utilizaram o sistema: " + totalAlunos);
		System.out.println("A Média das Notas da Turma: " + mediaNotas);

		ler.close();
	}

}
