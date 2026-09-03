package com.voting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Voter> voters = new ArrayList<>();

        System.out.print("Enter number of voters to evaluate: ");
        int count = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < count; i++) {
            System.out.println("\n--- Entering details for Voter " + (i + 1) + " ---");
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Citizenship (e.g., Indian): ");
            String citizenship = scanner.nextLine();

            System.out.print("Enter Voter ID: ");
            String voterId = scanner.nextLine();

            System.out.print("Is the Voter ID valid? (true/false): ");
            boolean isIdValid = scanner.nextBoolean();
            scanner.nextLine();

            voters.add(new Voter(name, age, citizenship, voterId, isIdValid));
        }

        System.out.println("\n====== VOTING ELIGIBILITY REPORT ======");
        for (Voter voter : voters) {
            voter.checkEligibility();
        }
        scanner.close();
    }
}
