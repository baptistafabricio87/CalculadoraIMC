package com.calculadora;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Padrao padrao = new Padrao();
        Area area = new Area();
        IMC imc = new IMC();

        double v1, v2;

        System.out.println("Calculadora!");
        System.out.printf("1 - Padrão \n2 - IMC \n3 - Area \nEscohla uma opcao: ");
        int op = sc.nextInt();
        switch (op){
            case 1:
                padrao.selecionarPadrao();
                break;
            case 2:
                System.out.println("Informe peso e altura:");
                v1 = sc.nextDouble();
                v2 = sc.nextDouble();
                System.out.println(imc.calcularIMC(v1, v2));
                break;
            case 3:
                area.selecionarArea();
                break;
            default:
                System.out.println("Opcao nao cadastrada!");
        }
        sc.close();
    }
}
