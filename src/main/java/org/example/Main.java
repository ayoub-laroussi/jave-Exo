package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez un mot :");
        result = scanner.nextLine();

        int count = 0;
        for (int i = 1; i < result.length(); i++) {
            count =+ i;
        }
        System.out.print(count);
    }
}