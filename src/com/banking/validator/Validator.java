package src.com.banking.validator;

import java.io.BufferedReader;
import java.io.IOException;

public class Validator{

    public static boolean isValidAmount(double amount, double balance) {

        return (amount > 0 && amount <= balance);
    }

    public static int getValidInteger(BufferedReader reader) {
        {
            while (true) {
                try {

                    return Integer.parseInt(reader.readLine());

                } catch (NumberFormatException | IOException e) {
                    System.out.print("Invalid number, try again: ");
                }
            }
        }
    }

    public static double getValidDouble(BufferedReader reader) {
        while (true) {
            try {
                String input = reader.readLine();
                return Double.parseDouble(input);
            } catch (Exception e) {
                System.out.println("Enter a valid number...");
            }
        }
    }

// A small utility to hash passwords using SHA-256



    public static double getValidAmount(BufferedReader reader) {
        while (true) {
            try {
                String input = reader.readLine();
                double amount = Double.parseDouble(input);
                if (amount > 0) {
                    return amount;
                } else {
                    System.out.println("Amount must be greater than 0.");
                }
            } catch (NumberFormatException | IOException e) {
                System.out.println("Enter a valid amount...");
            }
        }
    }


}
