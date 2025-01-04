package com.variaveis;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double altura, peso, valorImc;
        String sexo;

        Scanner scanner = new Scanner(System.in);

        altura = 1.50;
        sexo = "F";
        peso = 55;

        valorImc = peso/(altura*altura);
        System.out.println("altura: " + altura + " sexo: " + sexo + " peso: " + peso);
        System.out.println("Seu IMC é "  + valorImc);


        System.out.printf("Informe a altura:\n");
        altura = scanner.nextDouble();

        System.out.printf("Informe o sexo:\n");
        sexo = scanner.next();

        System.out.printf("Informe o peso:\n");
        peso = scanner.nextDouble();

        System.out.println("Altura: " + altura + " sexo: " + sexo + " peso: " + peso);
        System.out.println("Seu IMC é "  + peso/(altura*altura));

    }
}