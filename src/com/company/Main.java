package com.company;

import Uzdaviniai.LyginisNelyginis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite skaiciu: ");
        int sk = sc.nextInt(); //nustatomas kintamasis


        LyginisNelyginis objektas = new LyginisNelyginis(); //kuriamas klases objektas

        objektas.set_a(sk); //objekto verte sulyginama su sk

        System.out.println("Skaicius: " + objektas.get_a()); //
        objektas.skaiciuok();
    }
}
