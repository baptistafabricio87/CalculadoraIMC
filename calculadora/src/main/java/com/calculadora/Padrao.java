package com.calculadora;

public class Padrao {

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
        }else if ( expoente == 1){
            return base;
        }else{
            double resultado = 1;
            for (int i = 0; i < expoente; i++) {
                resultado = resultado *= base;
            }
            return resultado;
        }
    }
}
