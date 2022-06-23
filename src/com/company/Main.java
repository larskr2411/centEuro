package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Geben Sie den Centbetrag hier ein: ");
        Scanner scan = new Scanner(System.in);
        int cent = scan.nextInt();
        System.out.println("Das ergibt: " + cent / 100 + " Euro und " + cent % 100 + " Cent");
    }
}
