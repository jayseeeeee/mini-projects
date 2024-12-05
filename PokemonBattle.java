import java.util.Random;
import java.util.Scanner;

public class PokemonBattle {
    public static void main(String[] args) {
        Random rng = new Random();
        Scanner input = new Scanner(System.in);

        byte playerDamage = 0, computerDamage = 0;
        String playerPokemon = "", playerMove = "", computerPokemon = "", computerMove = "";
        // Set Pokémon starting health value to maximum first
        byte pikachu = 100, bulbasaur = 100, charlszard = 100, squirtle = 100, pidgeotto = 100, gyarados = 100;

        // Introduction of player and computer Pokémon
        System.out.println("Welcome to Pokemon Battle!");
        System.out.println("Player and their Pokemon: Pikachu, Bulbasaur, Charlszard");
        System.out.println("Computer AI and their Pokemon: Squirtle, Pidgeotto, Gyarados");
        
        // Generate random Pokémon for player
        System.out.println("\nIt's Player's turn!");
        int playerChoice = rng.nextInt(3)+1;
        if (playerChoice == 1) {
            playerPokemon = "Pikachu";
        } 
        else if (playerChoice == 2) {
            playerPokemon = "Bulbasaur";
        } 
        else {
            playerPokemon = "Charlszard";
        }
        System.out.println("Player chooses " + playerPokemon);

        // Generate random Pokémon for computer
        System.out.println("\nIt's Computer AI's turn!");
        int computerChoice = rng.nextInt(3) + 1;
        if (computerChoice == 1) {
            computerPokemon = "Squirtle";
        } 
        else if (computerChoice == 2) {
            computerPokemon = "Pidgeotto";
        } 
        else {
            computerPokemon = "Gyarados";
        }
        System.out.println("Computer chooses" + computerPokemon);

        // Let player choose their move based on generated player pokemon
        System.out.println("\nChoose a move for " + playerPokemon + "!");
        if (playerChoice == 1) {
            System.out.println("1. " + "Thunderbolt");
            System.out.println("2. " + "Quick Attack");
            
            System.out.print("Enter your choice: ");
            byte playerChosenMove = input.nextByte();

            // Set player damage based on chosen move
            if (playerChosenMove == 1) {
                playerMove = "Thunderbolt";
                playerDamage = 20;
            } else if (playerChosenMove == 2) {
                playerMove = "Quick Attack";
                playerDamage = 10;
            } else {
                System.out.println("Error: Incorrect input");
            }
        }

        else if (playerChoice == 2) {
            System.out.println("1. Vine Whip");
            System.out.println("2. Tackle");
            
            System.out.print("Enter your choice: ");
            byte playerChosenMove = input.nextByte();

            // Set player damage based on chosen move
            if (playerChosenMove == 1) {
                playerMove = "Vine Whip";
                playerDamage = 15;
            } else if (playerChosenMove == 2) {
                playerMove = "Tackle";
                playerDamage = 10;
            } else {
                System.out.println("Error: Incorrect input");
            }
        }

        else {
            System.out.println("1. Flamethrower");
            System.out.println("2. Scratch");
            
            System.out.print("Enter your choice: ");
            byte playerChosenMove = input.nextByte();

            // Set player damage based on chosen move
            if (playerChosenMove == 1) {
                playerMove = "Flamethrower";
                playerDamage = 25;
            } else if (playerChosenMove == 2) {
                playerMove = "Scratch";
                playerDamage = 10;
            } else {
                System.out.println("Error: Incorrect input");
            }
        }

        // Announce player Pokémon, move, and damage
        System.out.println(playerPokemon + " uses " + playerMove + "!");
        System.out.println("Attack Damage: " + playerDamage);

        // Damage computer Pokémon with player move
        if (computerChoice == 1) {
            squirtle -= playerDamage;
        } 
        else if (computerChoice == 2) {
            pidgeotto -= playerDamage;
        } 
        else {
            gyarados -= playerDamage;
        }

        // Generate computer Pokémon move
        int computerChosenMove = rng.nextInt(2) + 1;
        if (computerChoice == 1) {
            if (computerChosenMove == 1) {
                computerMove = "Water Gun";
                computerDamage = 20;
            }
            else {
                computerMove = "Tackle";
                computerDamage = 10;
            }
        }
        else if (computerChoice == 2) {
            if (computerChosenMove == 1) {
                computerMove = "Gust";
                computerDamage = 15;
            }
            else {
                computerMove = "Quick Attack";
                computerDamage = 10;
            }
        }
        else {
            if (computerChosenMove == 1) {
                computerMove = "Hydro Pump";
                computerDamage = 25;
            }
            else {
                computerMove = "Bite";
                computerDamage = 15;
            }
        }

        // Announce computer Pokémon, move, and damage
        System.out.println(computerPokemon + " uses " + computerMove + "!");
        System.out.println("Attack Damage: " + computerDamage);

        // Damage player Pokémon with computer move
        if (playerChoice == 1) {
            pikachu -= computerDamage;
        } 
        else if (playerChoice == 2) {
            bulbasaur -= computerDamage;
        } 
        else {
            charlszard -= computerDamage;
        }

        // Display battle status after damage
        System.out.println("\nBATTLE STATUS");
        System.out.println("Player's Pokemon Health:");
        System.out.println("Pikachu = " + pikachu);
        System.out.println("Bulbasaur = " + bulbasaur);
        System.out.println("Charlszard = " + charlszard);
        System.out.println("\nComputer AI Pokemon Health:");
        System.out.println("Squirtle = " + squirtle);
        System.out.println("Pidgeotto = " + pidgeotto);
        System.out.println("Gyarados = " + gyarados);

        input.close();
    }
}