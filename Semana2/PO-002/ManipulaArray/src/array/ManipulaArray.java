package array;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class ManipulaArray {
    private int[] array;

    public void lerDoUsuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();
        array = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
    }

    public void criarAleatorio(int tamanho, int valorMin, int valorMax) {
        array = new int[tamanho];
        Random random = new Random();

        for (int i = 0; i < tamanho; i++) {
            array[i] = random.nextInt(valorMax - valorMin + 1) + valorMin;
        }
    }

    public int calcularSoma() {
        int soma = 0;

        for (int elemento : array) {
            soma += elemento;
        }

        return soma;
    }

    public int encontrarMaior() {
        int maior = Integer.MIN_VALUE;

        for (int elemento : array) {
            if (elemento > maior) {
                maior = elemento;
            }
        }

        return maior;
    }

    public int encontrarMenor() {
        int menor = Integer.MAX_VALUE;

        for (int elemento : array) {
            if (elemento < menor) {
                menor = elemento;
            }
        }

        return menor;
    }

    public static void main(String[] args) {
        ManipulaArray manipulador = new ManipulaArray();

        manipulador.lerDoUsuario();
        System.out.println("Array lido do usuário: " + Arrays.toString(manipulador.array));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do array aleatório: ");
        int tamanhoAleatorio = scanner.nextInt();
        manipulador.criarAleatorio(tamanhoAleatorio, 1, 100);
        System.out.println("Array criado aleatoriamente: " + Arrays.toString(manipulador.array));

        int soma = manipulador.calcularSoma();
        System.out.println("Soma dos elementos do array: " + soma);

        int maiorValor = manipulador.encontrarMaior();
        System.out.println("Maior valor no array: " + maiorValor);

        int menorValor = manipulador.encontrarMenor();
        System.out.println("Menor valor no array: " + menorValor);
    }
}

