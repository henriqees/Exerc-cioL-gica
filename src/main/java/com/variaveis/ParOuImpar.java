package com.variaveis;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        int numero;

        //Tipo dele(Scanner) + Nome = Criar objeto
        Scanner leitorDoTeclado = new Scanner(System.in); //Cria objeto para ler do teclado

        System.out.println("Digite um número "); //sout
        numero = leitorDoTeclado.nextInt(); //Le do teclado
        if (numero % 2 == 0) {
            System.out.println("PAR!");
        } else {
            System.out.println("IMPAR");
        }
    }
}
