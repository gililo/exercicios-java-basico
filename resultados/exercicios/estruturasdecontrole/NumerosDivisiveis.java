// Exercício 4 - Estruturas de Controle em Java
// Escreva um código onde o usuário informa um número, depois informar outros N números,
// a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de 0 na divisão,
// números menores que o primeiro número devem ser ignorados.

package exercicios.estruturasdecontrole;

import java.util.Scanner;

public class NumerosDivisiveis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero2;

        System.out.print("Digite um número: ");
        int numero1 = input.nextInt();

        do {
            System.out.print("Digite outro número: ");
            numero2 = input.nextInt();
        } while (((numero2 % numero1) == 0) || (numero2 < numero1));
    }
}