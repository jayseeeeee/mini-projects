import java.util.Scanner;

public class FareRide {
    public static void main(String[] args) {

        // Set and initialize variables first for global use
        float fare = 0.00f, minimumFare = 0.00f, extraFare = 0.00f, distance = 0.00f;
        String destination = null;
        Scanner input = new Scanner(System.in);

        // Introduction for Fare Ride System
        System.out.println("= = = SELECT MODE OF TRANSPORTATION = = =");
        System.out.println("1. JEEP\n2. BUS");
        System.out.print("Enter your choice: ");
        int transpoChoice = input.nextInt();
        
        // Set the minimum and extra fare for Jeep
        if (transpoChoice == 1) { 
            minimumFare = 20.00f;
            extraFare = 1.80f;
        }

        // Set the minimum and extra fare for Bus
        else if (transpoChoice == 2 ) {
            minimumFare = 30.00f;
            extraFare = 2.65f;
        }
        else {
            System.out.println("Error: Invalid Mode of Transportation");
            input.close();
            return;
        }

        // Set distance based on SM location
        System.out.println("= = = SELECT YOUR DESTINATION = = =");

        // Display and let user select SM location choices
        System.out.println("1 - SM City Trece Martires\n2 - SM City Dasmarinas\n3 - SM City Tanza\n4 - SM City Molino\n5 - SM City Bacoor");
        System.out.print("Enter your choice: ");
        byte location = input.nextByte();
        if (location == 1) {
            destination = "SM City Trece Martires";
            distance = 11;
        } else if (location == 2) {
            destination = "SM City Dasmarinas";
            distance = 22;
        } else if (location == 3) {
            destination = "SM City Tanza";
            distance = 25;
        } else if (location == 4) {
            destination = "SM City Molino";
            distance = 34;
        } else if (location == 5) {
            destination = "SM City Bacoor";
            distance = 38;
        } else {
            System.out.println("Error: Invalid Destination");
            input.close();
            return;
        }

        // Calculate first to see initial fare before applicable discounts
        if (transpoChoice == 1) {
            fare = minimumFare + ((distance - 4) * extraFare);
        } else {
            fare = ((distance / 4) * minimumFare) + ((distance - 4) * extraFare);
        }

        // Ask user for fare discount
        System.out.print("Are you a student/PWD/senior citizen? (1. Yes/ 2. No): ");
        byte discountChoice = input.nextByte();
        
        // Error handling for wrong input
        if (!(discountChoice == 1 || discountChoice == 2)) {
            System.out.println("Error: Invalid Passenger Type");
            input.close();
            return;
        }

        // Display final price
        System.out.println("====================\nTicket\n====================");
        System.out.println("From: Indang Terminal");
        System.out.println("To: " + destination);
        System.out.println("Fare: " + Math.round(fare));

        // Apply fare discount on selected individuals
        if (discountChoice == 1) {
            fare = fare - (fare * .20f);
            System.out.println("Discounted Fare: " + Math.round(fare));
        }

        input.close();
    }
}