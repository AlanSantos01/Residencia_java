package adivinhacao;

import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;

        int tentativas = 0;
        int palpite;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");

        do {
    
            System.out.print("Digite o seu palpite: ");

           
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, digite um número válido.");
                System.out.print("Digite o seu palpite: ");
                scanner.next(); // 
            }

            palpite = scanner.nextInt();
            tentativas++;

            if (palpite == numeroSecreto) {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
            } else if (palpite < numeroSecreto) {
                System.out.println("Muito baixo. Tente novamente.");
            } else {
                System.out.println("Muito alto. Tente novamente.");
            }

        } while (palpite != numeroSecreto);

        scanner.close();
    }
}
