package com.calculadora;

import java.util.Scanner;

public class Area {

    public void selecionarArea() {
        double v1, v2;
        Scanner sc = new Scanner(System.in);
        System.out.printf("\n1 - Circulo \n2 - Quadrado \n3 - Retangulo \n4 - Triangulo \n");
        System.out.println("Escolha uma opcao");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                System.out.printf("\nCIRCULO \nInforme valor do raio: ");
                v1 = sc.nextDouble();
                System.out.println(circulo(v1));
                break;
            case 2:
                System.out.printf("\nQUADRADO \nInforme valor do lado: ");
                v1 = sc.nextDouble();
                System.out.println(quadrado(v1));
                break;
            case 3:
                System.out.printf("\nRETANGULO \nInforme base e altura: ");
                v1 = sc.nextDouble();
                v2 = sc.nextDouble();
                System.out.println(retangulo(v1, v2));
                break;
            case 4:
                System.out.printf("\nTRIANGULO \nInforme base e altura: ");
                v1 = sc.nextDouble();
                v2 = sc.nextDouble();
                System.out.println(triangulo(v1, v2));
                break;
            default:
                System.out.println("Opcao nao cadastrada!");
        }
        sc.close();
    }

    public double circulo(double raio){
        return 3.14 * (raio*raio);
    }

    public double quadrado(double lado){
        return lado * lado;
    }

    public double retangulo(double base, double altura){
        return base * altura;
    }

    public double triangulo(double base, double altura){
        return (base * altura) / 2;
    }
}
