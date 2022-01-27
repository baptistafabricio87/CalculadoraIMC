package com.calculadora;

public class Area {

    public double circulo(double raio){
        return 3.14 * (raio*raio);
    }

    public double quadrado(double lado){
        return lado * lado;
    }

    public double retangulo(double base, double altura){
        return base * altura;

    }public double triangulo(double base, double altura){
        return (base * altura) / 2;
    }


}
