// Exercício 3 - Fundamentos da Linguagem de Programação Java
// Escreva um código que receba a base e a altura de um retângulo, calcule sua área e exiba na tela

package exercicios.fundamentos;

import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o tamanho da base do retângulo: ");
        int base = input.nextInt();
        System.out.print("Digite o tamanho da altura do retângulo: ");
        int altura = input.nextInt();

        int area = base * altura;

        System.out.println("A área desse retângulo é: " + area);
    }
}