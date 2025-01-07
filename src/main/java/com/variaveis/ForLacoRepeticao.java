package com.variaveis;

import java.util.Scanner;

public class ForLacoRepeticao {
    public static void main(String[] args) {
  int num, i;
  Scanner leitorDoTeclado = new Scanner(System.in);
        System.out.println("Digite um número");
        num = leitorDoTeclado.nextInt();
        for (i = 0; i <= num; i++) {
            System.out.println(i);
    }
    }
}
