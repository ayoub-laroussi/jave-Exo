package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // compterString();
        afficherMinEtMaj();
    }
    static void compterString(){
        String result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Laissez un mot :");
        result = scanner.nextLine();
        System.out.println(result.length());
    }
    static void afficherMinEtMaj(){
        String result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Laissez un mot :");
        result = scanner.nextLine();
        System.out.println(result.toLowerCase());
        System.out.println(result.toUpperCase());

    }
}