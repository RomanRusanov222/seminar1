package org.example.seminar1.hw1;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String [] args) {
        String s = "my name is sed";
        String result = "";
        String [] mass = s.split("");
        for (int i =mass.length-1; i>=0; i--) {
            result = result + mass[i];
            if (i !=0) {
                result = result + "";
            }
        }
        System.out.print(result);
        }
}

