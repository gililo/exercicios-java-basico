// Exercício 2 - Estruturas de Controle em Java
// Escreva um código onde o usuário entra com sua altura e peso,
// então é feito o cálculo do seu IMC = peso/(altura * altura)
// e exibida a mensagem de acordo com o resultado:
//   - Se for menor ou igual a 18,5 "Abaixo do peso";
//   - se for entre 18,6 e 24,9 "Peso ideal";
//   - Se for entre 25,0 e 29,9 "Levemente acima do peso";
//   - Se for entre 30,0 e 34,9 "Obesidade Grau I";
//   - Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
//   - Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";

package exercicios.estruturasdecontrole;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite sua altura em metros: ");
        float altura = input.nextFloat();

        System.out.print("Digite seu peso em kilos: ");
        float peso = input.nextFloat();

        float imc = peso / (altura * altura);

        if (imc <= 18.5) {
            System.out.print("Abaixo do Peso");
        }
        else if (imc <= 24.9) {
            System.out.print("Peso Ideal");
        }
        else if (imc <= 29.9) {
            System.out.print("Levemente acima do peso");
        }
        else if (imc <= 34.9) {
            System.out.print("Obesidade Grau I");
        }
        else if (imc <= 39.9) {
            System.out.print("Obesidade Grau II (Severa)");
        }
        else {
            System.out.print("Obesidade III (Mórbida)");
        }
    }
}