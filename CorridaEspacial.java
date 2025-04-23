package aula11;

import java.util.Random;
import java.util.Scanner;

public class CorridaEspacial {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int estrelas = 1;
		int desvio;
		int escolha;
		Random random = new Random();
		
		System.out.println("Bem-vindo a corrida espacial!");
		System.out.println("Você deve coletar as estrelas, mas CUIDADO com os meteoros!");
		System.out.println("Preparado? Vamos lá!!!" );
		
		escolha = random.nextInt(3)+1 ; 
		
		do {
			System.out.println("Sua pontuação é: " + estrelas);
			if (estrelas % 10 == 0) {
				System.out.println("CUIDADO COM O METEORO! Digite 1 para desviar para a esquerda ou 2 para desviar para direita.");
				desvio = ler.nextInt();
				
				if ( desvio != escolha) {
					System.out.println("Você perdeu!");
					break;
				}
			}
			estrelas ++;
			
		} while (estrelas < 50);
		
		if (estrelas == 50) {
			System.out.println("Sua pontuação é: " + estrelas);
			System.out.println("Parabéns, você venceu!");
		}
		ler.close();
	}
}
