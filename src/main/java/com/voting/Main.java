package com.voting;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Voter> voters = new ArrayList<>();

        System.out.println("====== AUTOMATIC INPUT INJECTION ======");
        System.out.println("Injecting test voter details automatically...\n");

        // The program inputs these entries completely by itself
        voters.add(new Voter("Rahul", 20, "Indian", "IND123", true));
        voters.add(new Voter("Alex", 16, "Indian", "IND456", true));
        voters.add(new Voter("John", 25, "American", "USA789", true));

        System.out.println("====== VOTING ELIGIBILITY REPORT ======");
        for (Voter voter : voters) {
            voter.checkEligibility();
        }
    }
}
