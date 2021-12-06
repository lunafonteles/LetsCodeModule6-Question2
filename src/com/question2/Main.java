package com.question2;

import java.util.Scanner;

    public class Main {
        public static void main (String[] args) {
            Scanner scanTab = new Scanner(System.in);
            System.out.print("Qual tabuada quer fazer? Escolha de 1 a 10: ");
            int tabuada = scanTab.nextInt();

        CalculadorTabuada.calculaTabuada(tabuada);
    }

}
