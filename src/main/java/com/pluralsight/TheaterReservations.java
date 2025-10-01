package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = myScanner.nextLine();
        String[] nameSplit = name.split(" ");
        String firstName = nameSplit[0];
        String lastName = nameSplit.length > 1 ? nameSplit[1] : "";
        System.out.println();

        System.out.print("What date will you be coming today(MM/dd/yyyy): ");
        String date = myScanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate dateComing = LocalDate.parse(date, formatter);
        String formattedDate = dateComing.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        System.out.println();

        System.out.print("How many tickets would you like: ");
        int ticketAmount = myScanner.nextInt();
        System.out.println();

        String result = ticketAmount + " " + "reserved for " + formattedDate + " under " + lastName + ", " + firstName;
        System.out.println(result);
    }
}