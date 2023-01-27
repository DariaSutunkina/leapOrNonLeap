package edu.dashasutunkina;

import java.util.Scanner;

public class practiceIfElseSwitch2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year % 4 == 0 && year % 400 == 0 && year % 100 == 0)
        {
            System.out.println("this is leap year");
        } else if (year % 4 == 0 && year % 100 == 0) {
            System.out.println("this is non-leap year");
        } else if (year % 4 == 0) {
            System.out.println("this is leap year");
        } else {
            System.out.println("this is non-leap year");
        }
    }
}
