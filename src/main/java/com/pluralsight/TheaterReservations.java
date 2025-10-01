package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = myScanner.nextLine();
        System.out.println();

        System.out.print("What date will you be coming today(MM/dd/yyyy): ");
        String date = myScanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/dd/yyyy");
        LocalDate dateComing = LocalDate.parse(date, formatter);
        System.out.println();

        System.out.print("How many tickets would you like: ");
        int ticketAmount = myScanner.nextInt();
        System.out.println();


        //change date to dateComing to display 2020-07-9
        String result = ticketAmount + " " + "reserved for " + date + " under " + name;
        System.out.println(result);
    }
}