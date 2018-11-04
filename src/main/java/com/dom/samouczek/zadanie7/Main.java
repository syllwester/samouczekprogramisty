package com.dom.samouczek.zadanie7;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Main main = new Main();
        Computation computation;

        if(main.shouldChooseAddOrMultiplication()){
            computation = new AddNumbers();
        }else {
            computation = new MultiplicationNumbers();
        }

        double argument1 = main.getNumber();
        double argument2 = main.getNumber();

        double result = computation.compute(argument1, argument2);
        System.out.println("Result: " + result);

    }

    private boolean shouldChooseAddOrMultiplication(){
        boolean bool = false;
        System.out.println("What do you want to do?" + "\n"
                + "1. Add numbers." + "\n"
                + "2. Multiplication numbers.");
        int chose = scanner.nextInt();

        if(chose == 1){
            bool = true;
        }else if(chose == 2){
            bool = false;
        }
        return bool;
    }

    private double getNumber(){
        System.out.println("Enter the number: ");
        return scanner.nextDouble();
    }
}
