package com.example;

public class Main {

    // Method to extract initials from a full name
    public static String extractInitials(String fullName) {
        String[] parts = fullName.trim().split("\\s+");
        StringBuilder initials = new StringBuilder();

        for (String part : parts) {
            initials.append(Character.toUpperCase(part.charAt(0)));
        }

        return initials.toString();
    }

    public static void main(String[] args) {
        String fullName = "Mustafa Hashim";

        String result = extractInitials(fullName);

        System.out.println("Initials: " + result);
    }
}
