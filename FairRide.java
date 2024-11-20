import java.util.Scanner;
//
// SM Trece Martires - 11km
// 4km 
public class FairRide {
    public static void main(String[] args) {
        // Set and initialize variables first for global use
        float fare = 0.00f, minimumFare = 0.00f, extraFare = 0.00f, distance = 0.00f;
        Scanner input = new Scanner(System.in);
        
        // Introduction for Fair Ride System
        System.out.println("Welcome to Fair Ride System!");
        System.out.println("1 for Jeep, or 2 for Bus");
        System.out.print("Please choose mode of transportation: ");
        byte transpoChoice = input.nextByte();

        // Set the minimum and extra fare for Jeep
        if (transpoChoice == 1) { 
            minimumFare = 20.00f;
            extraFare = 1.80f;
        }
        // Set the minimum and extra fare for Bus
        else if (transpoChoice == 2 ) {
            minimumFare = 30.00f;
            extraFare = 2.56f;
        }
        else {
            System.err.println("Error: Incorrect selection");
        }

        // Display and let user select SM location choices
        System.out.println("1 - SM Trece Martires, 2 - SM Tanza, 3 - SM Dasmarinas, 4 - SM Bacoor, 5 - SM Rosario");
        System.out.print("Please choose location of SM: ");
        byte location = input.nextByte();
        
        // Set distance based on SM location
        if (location == 1) {
            distance = 11;
        } else if (location == 2) {
            distance = 18;
        } else if (location == 3) {
            distance = 25;
        } else if (location == 4) {
            distance = 29;
        } else if (location == 5) {
            distance = 38;
        } else {
            System.err.println("Error: Incorrect selection");
        }

        // Calculate first to see initial fare before applicable discounts
        if (transpoChoice == 1) {
            fare = minimumFare + ((distance - 4) * extraFare);
        } else {
            fare = ((distance / 4) * minimumFare) + ((distance - 4) * extraFare);
        }

        // Apply fair discount on selected individuals
        System.out.println("Are you a student, senior citizen, or PWD?");
        System.out.print("Enter 1 to apply discount: ");
        byte discountChoice = input.nextByte();
        if (discountChoice == 1) {
            fare = fare -(fare * .20f);
        }

        // Display final price
        System.out.printf("Your fair for your ride is %.2f\n", fare);
    }
}
