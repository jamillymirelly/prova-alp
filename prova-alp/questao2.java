// Elaborar um programa que efetue a leitura de valores positivos inteiros até que um valor negativo seja informado. Ao final, devem ser apresentados o maior e menor valores informados pelo usuário.

import java.util.Scanner;

public class verificarMaiorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior = 0;
        int menor = 0;
        boolean valor1= true;
        int valor;

        while (true) {
            System.out.print("Digite um valor positivo (ou negativo para encerrar): ");
            valor = scanner.nextInt();

            if (valor < 0) {
                break; 
            }

            if (valor1) {
                maior = valor; 
                menor = valor;
                valor1= false; 
            } else {
                if (valor > maior) {
                    maior = valor; 
                }
                if (valor < menor) {
                    menor = valor;
                }
            }
        }

        if (!valor1) {
            System.out.println("Maior valor: " + maior);
            System.out.println("Menor valor: " + menor);
        } else {
            System.out.println("Nenhum valor positivo foi inserido.");
        }

        scanner.close();
    }
}