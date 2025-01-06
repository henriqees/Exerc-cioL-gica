package com.variaveis;

import java.util.Scanner;

public class CalculoMediaConceito {
    public static void main(String[] args) {

        double nota1, nota2, nota3, media;


        //Se média for menor que 7 conceito D
        //Se media entre 7 e 8 conceito C
        //Se media entre 8 e 9 - Conceito B
        // Se media entre 9 e 10 - Conceito A


        //Tipo dele(Scanner) + Nome = Criar objeto
        Scanner leitorDoTeclado = new Scanner(System.in); //Cria objeto para ler do teclado

        System.out.println("Digite a primeira nota? "); //sout
        nota1 = leitorDoTeclado.nextDouble(); //Le do teclado
        System.out.println("Digite a segunda nota? "); //sout
        nota2 = leitorDoTeclado.nextDouble(); //Le do teclado
        System.out.println("Digite a terceira nota? "); //sout
        nota3 = leitorDoTeclado.nextDouble(); //Le do teclado


       media = (nota1 + nota2 + nota3)/ 3;

        System.out.println("Média do aluno " + media);

        if (media <7) {
            System.out.println("Conceito D");
        }
        if (media >=7 && media<8) {
            System.out.println("Conceito C");
        }
        if (media>=8 && media <9) {
            System.out.println("Conceito B");
        }
        if (media>9) {
            System.out.println("Conceito A");
        }

    }
}