package org.example.seminar1.hw1;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        System.out.printf("Summa %d", dz());
    }
    public static int dz() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num1 = sc.nextInt();
        while (num1 !=0) {
            int num2 = sc.nextInt();
            if (num1 > 0 && num2 < 0);{
                sum += num1;
            }
            num1 = num2;
        }
        return sum;



    }

}