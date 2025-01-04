package com.variaveis;

import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {

        double peso, altura, imc;

        //Tipo dele(Scanner) + Nome = Criar objeto
        Scanner leitorDoTeclado = new Scanner(System.in); //Cria objeto para ler do teclado

        System.out.println("Digite o seu peso? "); //sout
        peso = leitorDoTeclado.nextDouble(); //Le do teclado
        System.out.println("Digite a sua altura? "); //sout
        altura = leitorDoTeclado.nextDouble(); //Le do teclado

        imc = peso / (altura * altura);
        System.out.println("Seu IMC equivale a " + imc);

    }
}