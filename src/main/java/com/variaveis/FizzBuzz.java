package com.variaveis;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        int numero;

        //Tipo dele(Scanner) + Nome = Criar objeto
        Scanner leitorDoTeclado = new Scanner(System.in); //Cria objeto para ler do teclado

        System.out.println("Digite um número "); //sout
        numero = leitorDoTeclado.nextInt(); //Le do teclado

        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("Fizzbuzz");
        }
        else if (numero % 3 == 0) {
            System.out.println("Fizz!");
        }
        else if (numero % 5 == 0) {
            System.out.println("Buzz");
        }
        else {
            System.out.println(numero);
        }
    }
}
