package com.calculadora;

import java.util.Scanner;

public class Padrao {

    public void selecionarPadrao(){
        double v1, v2;
        Scanner sc = new Scanner(System.in);
        System.out.printf("\n1 - Soma \n2 - Subtracao \n3 - Divisao \n4 - Multiplicacao \n5 - Potencicao");
        System.out.println("Escolha uma opcao");
        int op = sc.nextInt();
        switch (op){
            case 1:
                System.out.printf("\nSOMA \nInforme dois valores: ");
                v1 = sc.nextDouble();
                v2 = sc.nextDouble();
                System.out.println(somar(v1, v2));
                break;
            case 2:
                System.out.printf("\nSUBTRACAO \nInforme dois valores: ");
                v1 = sc.nextDouble();
                v2 = sc.nextDouble();
                System.out.println(substrair(v1, v2));
                break;
            case 3:
                System.out.printf("\nDIVISAO \nInforme dois valores: ");
                v1 = sc.nextDouble();
                v2 = sc.nextDouble();
                System.out.println(dividir(v1, v2));
                break;
            case 4:
                System.out.printf("\nMULTIPLICACAO \nInforme dois valores: ");
                v1 = sc.nextDouble();
                v2 = sc.nextDouble();
                System.out.println(multiplicar(v1, v2));
                break;
            case 5:
                System.out.printf("\nPOTENCIACAO \nInforme dois valores: ");
                System.out.println("BASE e EXPOENTE");
                v1 = sc.nextDouble();
                v2 = sc.nextDouble();
                System.out.println(potenciacao(v1, v2));
                break;
        }
        sc.close();
    }

    public double somar(double valor1, double valor2){
        return valor1 + valor2;
    }

    public double substrair(double valor1, double valor2){
        return valor1 - valor2;
    }

    public double dividir(double valor1, double valor2){
        return valor1 / valor2;
    }

    public double multiplicar(double valor1, double valor2){
        return valor1 * valor2;
    }

    public double potenciacao(double base, double expoente){
        if(expoente == 0){
            return 1;
        }else if (expoente == 1){
            return base;
        }else{
            double resultado = 1;
            for (int i = 0; i < expoente; i++){
                resultado = resultado *= base;
            }
            return resultado;
        }
    }
}
