package com.variaveis;

import java.util.Scanner;

public class CalculoMédia {
    public static void main(String[] args) {

        double nota1, nota2, nota3, media;


        //Tipo dele(Scanner) + Nome = Criar objeto
        Scanner leitorDoTeclado = new Scanner(System.in); //Cria objeto para ler do teclado

        System.out.println("Digite a primeira nota? "); //sout
        nota1 = leitorDoTeclado.nextInt(); //Le do teclado
        System.out.println("Digite a segunda nota? "); //sout
        nota2 = leitorDoTeclado.nextInt(); //Le do teclado
        System.out.println("Digite a terceira nota? "); //sout
        nota3 = leitorDoTeclado.nextInt(); //Le do teclado


       media = (nota1 + nota2 + nota3)/ 3;

        System.out.println("Média do aluno " + media);

    }
}