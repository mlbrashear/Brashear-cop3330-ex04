package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Mary Brashear
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //Declare all variables of the Mad Libs
        String noun;
        String verb;
        String adjective;
        String adverb;
        Scanner sc = new Scanner(System.in);

        //Ask user for each variable
        System.out.println("Enter a noun: ");
        noun = sc.next();
        System.out.println("Enter a verb: ");
        verb = sc.next();
        System.out.println("Enter an adjective: ");
        adjective = sc.next();
        System.out.println("Enter an adverb: ");
        adverb = sc.next();

        //print out findings
        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "?");

        sc.close();
    }
}