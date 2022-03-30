package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı girin = ");
        int fibonacci = input.nextInt();

        int a = 1, b = 1, c = 1, sum =0;

        for (int i = 0; i < fibonacci; i++){

            c = a;
            sum = c + b;

            a = sum;
            b = c;

            System.out.println(sum + " ");
        }
    }
}
