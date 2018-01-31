package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite skaiciu: ");
        int sk = sc.nextInt();
        if (sk%2 == 0) {
            System.out.println("Skaicius lyginis.");
        } else {
            System.out.println("Skaicius nelyginis.");
        }

    }
}
