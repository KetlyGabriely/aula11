package aula11;

import java.util.Random;
import java.util.Scanner;

public class NumeroSecreto {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		Random random = new Random();
		int num;
		int adivinha = 0;
		int tentativas = 0;

		adivinha = random.nextInt(100);
		
		System.out.println("Bem vindo ao jogo de adivinhação! ");
		System.out.println("Tente adivinhar o número secreto (de 1 a 100)");
		
		System.out.println("Informe seu palpite: ");
		num = ler.nextInt();
		
		do { if (num > adivinha) {
			System.out.println("Numero é menor ... ");
			num = ler.nextInt();
		} else {
			System.out.println("Numero é maior ... ");
			num = ler.nextInt();
			} tentativas ++;
		
		} while (num != adivinha);
		
		System.out.println("Parabéns você acertou! O número secreto é: " + adivinha);
		System.out.println( tentativas + " tentativas");
		
		ler.close();
		
	}

}
