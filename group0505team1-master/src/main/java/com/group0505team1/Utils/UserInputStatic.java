package com.group0505team1.Utils;

import java.time.LocalDate;
import java.util.Scanner;

public class UserInputStatic {

    static Scanner scanner = new Scanner(System.in);

    public static String inputText(String message){
        System.out.println(message);
        return scanner.nextLine();
    }

    public static int inputInt(String message){
        while(true){
            System.out.println(message);
            String input = scanner.nextLine().trim();
            if (input.isEmpty()){
                System.out.println("Input is empty, try again");
                continue;
            }
            try{
                return Integer.parseInt(input);
            }catch (NumberFormatException e) {
                System.out.println("Invalid number format . Please enter an Integer!");
            }
        }
    }

    public static double inputDouble(String message){
        while(true){
            System.out.println(message);
            String input = scanner.nextLine().trim();
            if (input.isEmpty()){
                System.out.println("Input is empty, try again");
                continue;
            }
            try{
                return Double.parseDouble(input);
            }catch (NumberFormatException e) {
                System.out.println("Invalid number format . Please enter an Integer!");
            }
        }
    }

    public static LocalDate inputDate(String message){
        while(true){
            System.out.println(message);
            String date = scanner.nextLine().trim();
            if (date.isEmpty()){
                System.out.println("Date is empty");
                continue;
            }
            try {
                return LocalDate.parse(date);
            }catch (Exception e){
                System.out.println("Invalid date format . Use YEAR-MONTH-DAY");
            }
        }
    }

    public static void close(){
        scanner.close();
    }

}
