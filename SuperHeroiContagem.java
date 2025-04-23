package aula11;

import java.util.Scanner;

public class SuperHeroiContagem {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int end;
		int num = 1;
		
		System.out.println(" Bem-vindo, Super-Herói! Você precisa salvar a cidade. ");
		System.out.println(" Informe o número final: ");
		end = ler.nextInt();
		
		do {
			System.out.println(num);
			if (num % 10 == 0) {
				System.out.println("ARMADILHA! Digite o código da armadilha para continuar: ");
				String codigo = ler.next();
				if (!codigo.equals("972hu")) {
					System.out.println("Código errado! Você falhou!");
					break;
				}
			}
			num ++;
		} while (num <= end);
		
		if (num > end) {
			System.out.println("Você salvou a cidade!");
		}
		
		ler.close();
	}

}
