package com.pluralsight;

import java.util.Scanner;

public class TheaterReservations {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String name = scanner.nextLine();
        String date = scanner.nextLine();
        int ticketAmount = scanner.nextInt();

        System.out.println("Please enter your name: ");
        System.out.println("What date will you be coming: (MM/dd/yyyy)");
        System.out.println("How many tickets would you like: ");

        System.out.printf("""
             Name: %s
             Date: %s
             Number of tickets: %d""", name, date, ticketAmount);
    }
}
