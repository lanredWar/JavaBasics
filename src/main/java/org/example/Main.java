package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            int result = 10/0;
        }catch (ArithmeticException e){
            System.out.println("No se puede dividir por cero!");
        }
    }

    public static void contador(){
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }

    public static  void saludo(){
        System.out.printf("Hello and welcome!");
    }
}