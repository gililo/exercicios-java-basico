// Exercício 4 - Fundamentos da Linguagem de Programação Java
// Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas.

package exercicios.fundamentos;

import java.util.Scanner;

public class DiferencaIdade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome da primeira pessoa: ");
        String nome1 = input.nextLine();

        System.out.print("Digite a idade da primeira pessoa: ");
        int idade1 = input.nextInt();

        input.nextLine();

        System.out.print("Digite o nome da segunda pessoa: ");
        String nome2 = input.nextLine();

        System.out.print("Digite a idade da segunda pessoa: ");
        int idade2 = input.nextInt();

        input.nextLine();

        int diferencaIdade = idade1 - idade2;

        if (diferencaIdade < 0) {
            diferencaIdade = diferencaIdade * -1;
        }

        System.out.print("A diferença de idade entre " + nome1 + " e " + nome2 + " é " + diferencaIdade + " anos.");
    }
}