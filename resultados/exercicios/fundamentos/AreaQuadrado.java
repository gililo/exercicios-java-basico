// Exercício 2 - Fundamentos da Linguagem de Programação Java
// Escreva um código que receba o tamanho do lado de um quadrado, calcula sua área e exiba na tela

package exercicios.fundamentos;

import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o tamanho do lado do quadrado: ");
        int lado = input.nextInt();
        int area = lado * lado;

        System.out.println("A área desse quadrado é: " + area);
    }
}