package com.variaveis;

import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {

//
//        //Tipo dele(Scanner) + Nome = Criar objeto
//        Scanner leitorDoTeclado = new Scanner(System.in); //Cria objeto para ler do teclado
//
//        System.out.println("Digite um número "); //sout
//        numero = leitorDoTeclado.nextInt(); //Le do teclado

        // Criar um vetor de 10 posicoes com os valores 1,2,3,4..10 e mudar a posicao 5 e a posicao 10 para o número 100
        // e imprimir o vetor com os valores novos

        int i;
        int numero [] = {1,2,3,4,5,6,7,8,9,10};
        numero [5] = 100;
        numero [9] = 100;
        for (i = 0; i < 10; i++){
            System.out.println(numero [i]);
        }

    }
}
