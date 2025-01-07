package com.variaveis;

import java.util.Scanner;

public class ForLacoRepeticao2 {
    public static void main(String[] args) {
  int num1, num2, i;
  Scanner leitorDoTeclado = new Scanner(System.in);
        System.out.println("Digite um número");
        num1 = leitorDoTeclado.nextInt();
        System.out.println("Digite outro número");
        num2 = leitorDoTeclado.nextInt();
        for (i = num1; i  <= num2; i++){
            System.out.println(i);
        }

    }
}
