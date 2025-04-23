package aula11;

import java.util.Random;
import java.util.Scanner;

public class CavernaDosDragoes {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Random random = new Random();
		
		int pontuacao = 0;
		int encontro;
		int escolha;
		
		encontro = random.nextInt(2)+1;
		
		System.out.println("Bem- vindo a Caverna dos Dragões!");
		System.out.println("Prepare -se para uma aventura incrível");
	
		do {
			System.out.println("Pontuação: " + pontuacao);
			System.out.println("Infome 1 para frente, 2 para esquerda e 3 para direita.");
			escolha = ler.nextInt();
			if (escolha == encontro) {
				System.out.println("Você encontrou um dragão! Você perdeu!");
				break;
			}else {
				System.out.println("Você encontrou um tesouro! Você ganhou 10 pontos");
				pontuacao +=10;
			}
		
		}while (pontuacao<=90);
		
		System.out.println("Fim de jogo! Sua pontuação foi de : " + pontuacao + "pontos.");
		
		
		ler.close();
		}
	}


