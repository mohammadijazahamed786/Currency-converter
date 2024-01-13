package Currencyconverter;

import java.util.Scanner;

public class Currencyconverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stubpublic static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Currency Converter");
            System.out.print("Enter amount: ");
            double amount = input.nextDouble();

            System.out.println("Select the currency to convert from:");
            System.out.println("1. INDIA (ruppes)");
            System.out.println("2. USD (US Dollar)");
            System.out.println("3. GBP (British Pound)");
            System.out.println("4. JPY (Japanese Yen)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choiceFrom = input.nextInt();

            if (choiceFrom == 5) {
                System.out.println("Exiting the Currency Converter. Goodbye!");
                break;
            }

            System.out.println("Select the currency to convert to:");
            System.out.println("1. INDIA (RUPEES)");
            System.out.println("2. USD (US DOLLAR)");
            System.out.println("3. GBP (British Pound)");
            System.out.println("4. JPY (Japanese Yen)");
            System.out.print("Enter your choice: ");
            int choiceTo = input.nextInt();

            if (choiceTo == 5) {
                System.out.println("Exiting the Currency Converter. Goodbye!");
                break;
            }

            double convertedAmount = convertCurrency(amount, choiceFrom, choiceTo);

            System.out.println("Converted amount: " + amount + " " + getCurrencySymbol(choiceFrom) + " = " +
                               convertedAmount + " " + getCurrencySymbol(choiceTo));
        }

        input.close();
    }

    public static double convertCurrency(double amount, int choiceFrom, int choiceTo) {
        double rateFrom = getExchangeRate(choiceFrom);
        double rateTo = getExchangeRate(choiceTo);

        return amount * (rateTo / rateFrom);
    }

    public static double getExchangeRate(int choice) {
        switch (choice) {
            case 1:
                return 65.0;  // 1 RS = 65 USD
            case 2:
                return 0.88; // 1 USD = 0.88 EUR
            case 3:
                return 0.74; // 1 USD = 0.74 GBP
            case 4:
                return 110.34; // 1 USD = 110.34 JPY
            default:
                System.out.println("Invalid choice. Please select a valid option.");
                return -1.0; // Return a negative rate to indicate an error.
        }
    }

    public static String getCurrencySymbol(int choice) {
        switch (choice) {
            case 1:
                return "RS/-";
            case 2:
                return "USD";
            case 3:
                return "GBP";
            case 4:
                return "JPY";
            default:
                return "UNKNOWN";
        }
    }


	}

