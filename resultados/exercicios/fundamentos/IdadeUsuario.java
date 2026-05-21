// Exercício 1 - Fundamentos da Linguagem de Programação Java
// Escreva um código que receba o nome e o ano de nascimento de alguém e
// imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"

package exercicios.fundamentos;

import java.time.LocalDate;
import java.util.Scanner;

public class IdadeUsuario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.print("Digite seu ano de nascimento: ");
        int anoNascimento = input.nextInt();

        int anoAtual = LocalDate.now().getYear();
        int idade = anoAtual - anoNascimento;

        System.out.println("Olá " + nome + ", você tem " + idade + " anos.");
    }
}