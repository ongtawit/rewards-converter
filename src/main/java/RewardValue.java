import java.util.Scanner;

public class RewardValue{
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");
        System.out.println("Please enter a cash value to convert to airline miles: ");
    }
    private double cashValue;
    private double milesValue;

    // Constructor accepting cash value
    public RewardValue(double cash) {
        this.cashValue = cash;
        this.milesValue = cash / 0.0035;
    }

    // Constructor accepting miles value
    public RewardValue(int miles) {
        this.milesValue = miles;
        this.cashValue = miles * 0.0035;
    }

    // Method to get cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get miles value
    public double getMilesValue() {
        return milesValue;
    }

    // Convert miles to cash at a rate of 0.0035
    public void convertMilesToCash() {
        cashValue = milesValue * 0.0035;
    }
}

