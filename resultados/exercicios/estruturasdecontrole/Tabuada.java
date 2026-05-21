// Exercício 1 - Estruturas de Controle em Java
// Escreva um código onde o usuário entra com um número e uma tabuada é gerada.

package exercicios.estruturasdecontrole;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        for (int i = 1; i <=10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}