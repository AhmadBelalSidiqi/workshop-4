package com.pluralsight;

import java.util.Scanner;

public class UserInput {
    private static final Scanner scanner = new Scanner(System.in);
    private UserInput(){}

    public static int getUserInteger(String menu){
        do {
            System.out.println(menu);
            String userInput = scanner.nextLine();
            try {
                return Integer.parseInt(userInput);
            } catch (NumberFormatException n){
                System.out.println(userInput+" is not valid Integer");
            }
        }while(true);
    }
    public static Double getUserDouble(String menu){
        do {
            System.out.println(menu);
            String userInput = scanner.nextLine();
            try {
                return Double.parseDouble(userInput);
            } catch (NumberFormatException n){
                System.out.println(userInput+" is not valid Double");
            }
        }while(true);
    }

    public static String getUserString(String menu){
        System.out.println(menu);
        return scanner.nextLine();
    }
}
