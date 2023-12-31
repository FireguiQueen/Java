// RESTO DA DIVISÃO: %
/* 
    Em Java, e em outras diversas outras linguagens, o operador de resto de divisão é representado pela porcentagem (%).

    O resto da divisão é um número maior ou igual a zero e menor que o divisor.
    Ele é o que sobra na quando fazemos uma divisão.

    Qual a sua utilidade? Este operador nos permite por exemplo, saber se determinado número é ímpar ou par. 
    - Qualquer número dividido por dois que tenha o resto da divisão IGUAL (=) a zero, será par. 
    - Qualquer número dividido por dois que tenha o resto da divisão DIFERENTE (!=) de zero, será ímpar.

    E claro, há outras inúmeras utilidades deste operador.
*/

import java.util.Scanner; 

public class Aula_14{
    public static void main(String[] args)
    {
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Digite o dividendo: ");
        int dividendo = inputUser.nextInt();

        System.out.print("Digite o divisor: ");
        int divisor = inputUser.nextInt();

        // A divisão normal seria: 10 / 5; O que resulta em dois.
        // Para pegar o resto da divisão, será: 10 % 5;
        // O que singifica "Qual será o resto da divisão quando dividimos 10 por 5?"
        int resto = dividendo % divisor;
        System.out.println("Resto da divisão: " + resto);
    }
}