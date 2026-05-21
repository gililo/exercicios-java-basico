// Exercício 3 - Estruturas de Controle em Java
// Escreva um código que o usuário entre com um número, depois com outro número maior que o primeiro
// e escolhe entre a opção par ou impar.
// O código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial)
// no intervalo de números informados, incluindo os números informados e em ordem decrescente;

package exercicios.estruturasdecontrole;

import java.util.Scanner;

public class ListaParOuImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero1 = input.nextInt();

        System.out.print("Digite outro número, maior que o primeiro: ");
        int numero2 = input.nextInt();

        System.out.print("Digite 1 para Par ou 2 para Ímpar: ");
        int tipo = input.nextInt();

        int inicio;

        if ((tipo == 1 && numero2 % 2 != 0) || (tipo == 2 && numero2 % 2 == 0)) {
            inicio = numero2 - 1;
        }
        else {
            inicio = numero2;
        }

        if (tipo == 1) {
            System.out.print("Esses são os números pares entre sua seleção: ");
        }
        else if (tipo == 2) {
            System.out.print("Esses são os números ímpares entre sua seleção: ");
        }
        else {
            System.out.print("Você não selecionou entre Par e Ímpar.");
            return;
        }

        for (int j = inicio; j >= numero1; j -= 2) {
            if (j - 2 < numero1) {
                System.out.print(j + ".");
            }
            else {
                System.out.print(j + ", ");
            }
        }
    }
}