package com.voting;

public class Voter {
    private String name;
    private int age;
    private String citizenship;
    private String voterId;
    private boolean isIdValid;

    public Voter(String name, int age, String citizenship, String voterId, boolean isIdValid) {
        this.name = name;
        this.age = age;
        this.citizenship = citizenship;
        this.voterId = voterId;
        this.isIdValid = isIdValid;
    }

    public void checkEligibility() {
        System.out.println("\nEvaluating eligibility for: " + name);
        boolean eligible = true;
        StringBuilder reasons = new StringBuilder();

        if (age < 18) {
            eligible = false;
            reasons.append("- Underage (Must be at least 18 years old)\n");
        }
        if (!"Indian".equalsIgnoreCase(citizenship)) {
            eligible = false;
            reasons.append("- Not a citizen (Must be an Indian citizen)\n");
        }
        if (voterId == null || voterId.trim().isEmpty() || !isIdValid) {
            eligible = false;
            reasons.append("- Invalid Voter ID status\n");
        }

        if (eligible) {
            System.out.println("Result: ELIGIBLE to vote.");
        } else {
            System.out.println("Result: INELIGIBLE to vote. Reasons:\n" + reasons.toString());
        }
    }
}
