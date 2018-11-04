package com.dom.samouczek.zadanie1;

/** Create by Sylwester Garstecki
 * Program sprawdza czy temperatura jest dodatnia czy ujemna.
 */
public class Main {

    public boolean temperaturePosOrNeg(int temp){
        boolean isPositive = temp > 0;
        if (isPositive){
            System.out.println("Temperatura " + temp + " jest dodatnia");
        }else{
            System.out.println("Temperatura " + temp + " jest ujemna");
        }

        return isPositive;
    }


    public static void main(String[] args) {
            Main main = new Main();
            main.temperaturePosOrNeg(-2);
            main.temperaturePosOrNeg(5);
    }
}
