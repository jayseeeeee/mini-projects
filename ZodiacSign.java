import java.util.Scanner;

public class ZodiacSign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user birth month first
        System.out.print("Enter your birth month: ");
        byte birthMonth = input.nextByte();

        // Validate if birth month is within accepted number range
        if (birthMonth >= 1 && birthMonth <= 12) {
            System.out.print("Enter your birth date: ");
            byte birthDate = input.nextByte();
            // January
            if (birthMonth == 1) {
                if (birthDate >= 1 && birthDate <= 19)  {
                    System.out.println("Your zodiac sign is: Capricorn");
                } else if (birthDate >= 20 && birthDate <= 31) {
                    System.out.println("Your zodiac sign is: Aquarius");
                } else {
                    System.out.println("Error: Please input a valid birth date.");
                }
            } 
            // Feburary
            else if (birthMonth == 2) {
                if (birthDate >= 1 && birthDate <= 18)  {
                    System.out.println("Your zodiac sign is: Aquarius");
                } else if (birthDate >= 19 && birthDate <= 28) {
                    System.out.println("Your zodiac sign is: Pisces");
                // Special check for leap year birthday
                } else if (birthDate == 29) {
                    System.out.println("Error: No one has a birthday on February 29.");
                } else {
                    System.out.println("Error: Please input a valid birth date.");
                }
            } 
            // March
            else if (birthMonth == 3) {
                if (birthDate >= 1 && birthDate <= 20)  {
                    System.out.println("Your zodiac sign is: Pisces");
                } else if (birthDate >= 21 && birthDate <= 31) {
                    System.out.println("Your zodiac sign is: Aries");
                } else {
                    System.out.println("Error: Please input a valid birth date.");
                }
            } 
            // April
            else if (birthMonth == 4) {
                if (birthDate >= 1 && birthDate <= 19)  {
                    System.out.println("Your zodiac sign is: Aries");
                } else if (birthDate >= 20 && birthDate <= 30) {
                    System.out.println("Your zodiac sign is: Taurus");
                } else {
                    System.out.println("Error: Please input a valid birth date.");
                }
            } 
            // May
            else if (birthMonth == 5) {
                if (birthDate >= 1 && birthDate <= 20)  {
                    System.out.println("Your zodiac sign is: Taurus");
                } else if (birthDate >= 21 && birthDate <= 31) {
                    System.out.println("Your zodiac sign is: Gemini");
                } else {
                    System.out.println("Error: Please input a valid birth date.");
                }
            } 
            // June
            else if (birthMonth == 6) {
                if (birthDate >= 1 && birthDate <= 20)  {
                    System.out.println("Your zodiac sign is: Gemini");
                } else if (birthDate >= 21 && birthDate <= 30) {
                    System.out.println("Your zodiac sign is: Cancer");
                } else {
                    System.out.println("Error: Please input a valid birth date.");
                }
            }
            // July
            else if (birthMonth == 7) {
                if (birthDate >= 1 && birthDate <= 22)  {
                    System.out.println("Your zodiac sign is: Cancer");
                } else if (birthDate >= 23 && birthDate <= 31) {
                    System.out.println("Your zodiac sign is: Leo");
                } else {
                    System.out.println("Error: Please input a valid birth date.");
                }
            }
            // August
            else if (birthMonth == 8) {
                if (birthDate >= 1 && birthDate <= 22)  {
                    System.out.println("Your zodiac sign is: Leo");
                } else if (birthDate >= 23 && birthDate <= 31) {
                    System.out.println("Your zodiac sign is: Virgo");
                } else {
                    System.out.println("Error: Please input a valid birth date.");
                }
            }
            // September
            else if (birthMonth == 9) {
                if (birthDate >= 1 && birthDate <= 22)  {
                    System.out.println("Your zodiac sign is: Virgo");
                } else if (birthDate >= 23 && birthDate <= 30) {
                    System.out.println("Your zodiac sign is: Libra");
                } else {
                    System.out.println("Error: Please input a valid birth date.");
                }
            }
            // October
            else if (birthMonth == 10) {
                if (birthDate >= 1 && birthDate <= 22)  {
                    System.out.println("Your zodiac sign is: Libra");
                } else if (birthDate >= 23 && birthDate <= 31) {
                    System.out.println("Your zodiac sign is: Scorpio");
                } else {
                    System.out.println("Error: Please input a valid birth date.");
                }
            }
            // November
            else if (birthMonth == 11) {
                if (birthDate >= 1 && birthDate <= 21)  {
                    System.out.println("Your zodiac sign is: Scorpio");
                } else if (birthDate >= 22 && birthDate <= 30) {
                    System.out.println("Your zodiac sign is: Sagittarius");
                } else {
                    System.out.println("Error: Please input a valid birth date.");
                }
            }
            // December
            else if (birthMonth == 12) {
                if (birthDate >= 1 && birthDate <= 21)  {
                    System.out.println("Your zodiac sign is: Scorpio");
                } else if (birthDate >= 22 && birthDate <= 31) {
                    System.out.println("Your zodiac sign is: Capricorn");
                } else {
                    System.out.println("Error: Please input a valid birth date.");
                }
            }
        // Display an error immediately if not within range to avoid redundancy
        } else {
            System.out.println("Error: Please input a valid birth month.");
        }
        input.close();
    }
}