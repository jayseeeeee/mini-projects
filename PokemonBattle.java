import java.util.Random;
import java.util.Scanner;

public class PokemonBattle {
    public static void main(String[] args) {
        Random rng = new Random();
        Scanner input = new Scanner(System.in);

        byte pikachu = 100, bulbasaur = 100, charlszard = 100, squirtle = 100, pidgeotto = 100, gyarados = 100;

        System.out.println("Welcome to Pokemon Battle!");
        System.out.println("Player and their Pokemon: Pikachu, Bulbasaur, Charlszard");
        System.out.println("Computer AI and their Pokemon: Squirtle, Pidgeotto, Gyarados");
        System.out.println();
        System.out.println("It's Player's turn!");
        int playerChoice = rng.nextInt(3)+1;
        if (playerChoice == 1) {
            System.out.println("Player chooses Pikachu");
        } 
        else if (playerChoice == 2) {
            System.out.println("Player chooses Bulbasaur");
        } 
        else if (playerChoice == 3) {
            System.out.println("Player chooses Charlszard");
        }
        System.out.println();
        System.out.println("It's Computer AI's turn!");
        int computerChoice = rng.nextInt(3) + 1;

        if (computerChoice == 1) {
            System.out.println("Computer AI chooses Squirtle");
        } 
        else if (computerChoice == 2) {
            System.out.println("Computer AI chooses Pidgeotto");

        } 
        else if (computerChoice == 3) {
            System.out.println("Computer AI chooses Gyarados");
        }

        // Player choosing moves
        System.out.println();
        if (playerChoice == 1) {
            String pokemon = "Pikachu";
            String firstMove = "Thunderbolt";
            String secondMove = "Quick Attack";
            System.out.println("Choose a move for " + pokemon + "!");
            System.out.println("1. " + firstMove);
            System.out.println("2. " + secondMove);
            
            System.out.print("Enter your choice: ");
            byte playerMove = input.nextByte();
            System.out.println();

            if (playerMove == 1) {
                byte attackDamage = 20;
                System.out.println(pokemon + " uses " + firstMove + "!");
                System.out.println("Attack Damage: " + attackDamage);
                if (computerChoice == 1) {
                    squirtle -= attackDamage;
                } 
                else if (computerChoice == 2) {
                    pidgeotto -= attackDamage;
                } 
                else if (computerChoice == 3) {
                    gyarados -= attackDamage;
                }
            }
            else if (playerMove == 2) {
                byte attackDamage = 10;
                System.out.println(pokemon + " uses " + secondMove + "!");
                System.out.println("Attack Damage: " + attackDamage);
                if (computerChoice == 1) {
                    squirtle -= attackDamage;
                } 
                else if (computerChoice == 2) {
                    pidgeotto -= attackDamage;
                } 
                else if (computerChoice == 3) {
                    gyarados -= attackDamage;
                }
            }
        }
        else if (playerChoice == 2) {
            String pokemon = "Bulbasaur";
            String firstMove = "Vine Whip";
            String secondMove = "Tackle";
            System.out.println("Choose a move for " + pokemon + "!");
            System.out.println("1. " + firstMove);
            System.out.println("2. " + secondMove);
            
            System.out.print("Enter your choice: ");
            byte playerMove = input.nextByte();

            if (playerMove == 1) {
                byte attackDamage = 15;
                System.out.println(pokemon + " uses " + firstMove + "!");
                System.out.println("Attack Damage: " + attackDamage);
                if (computerChoice == 1) {
                    squirtle -= attackDamage;
                } 
                else if (computerChoice == 2) {
                    pidgeotto -= attackDamage;
                } 
                else if (computerChoice == 3) {
                    gyarados -= attackDamage;
                }
            }
            else if (playerMove == 2) {
                byte attackDamage = 10;
                System.out.println(pokemon + " uses " + secondMove + "!");
                System.out.println("Attack Damage: " + attackDamage);
                if (computerChoice == 1) {
                    squirtle -= attackDamage;
                } 
                else if (computerChoice == 2) {
                    pidgeotto -= attackDamage;
                } 
                else if (computerChoice == 3) {
                    gyarados -= attackDamage;
                }
            }
        }
        else if (playerChoice == 3) {
            String pokemon = "Charlszard";
            String firstMove = "Flamethrower";
            String secondMove = "Scratch";
            System.out.println("Choose a move for " + pokemon + "!");
            System.out.println("1. " + firstMove);
            System.out.println("2. " + secondMove);
            
            System.out.print("Enter your choice: ");
            byte playerMove = input.nextByte();

            if (playerMove == 1) {
                byte attackDamage = 25;
                System.out.println(pokemon + " uses " + firstMove + "!");
                System.out.println("Attack Damage: " + attackDamage);
                if (computerChoice == 1) {
                    squirtle -= attackDamage;
                } 
                else if (computerChoice == 2) {
                    pidgeotto -= attackDamage;
                } 
                else if (computerChoice == 3) {
                    gyarados -= attackDamage;
                }
            }
            else if (playerMove == 2) {
                byte attackDamage = 10;
                System.out.println(pokemon + " uses " + secondMove + "!");
                System.out.println("Attack Damage: " + attackDamage);
                if (computerChoice == 1) {
                    squirtle -= attackDamage;
                } 
                else if (computerChoice == 2) {
                    pidgeotto -= attackDamage;
                } 
                else if (computerChoice == 3) {
                    gyarados -= attackDamage;
                }
            }
        }
        
        // Computer choosing moves
        if (computerChoice == 1) {
            String pokemon = "Squirtle";
            String firstMove = "Water Gun";
            String secondMove = "Tackle";
            
            int computerMove = rng.nextInt(2) + 1;

            if (computerMove == 1) {
                byte attackDamage = 20;
                System.out.println(pokemon + " uses " + firstMove + "!");
                System.out.println("Attack Damage: " + attackDamage);
                if (playerChoice == 1) {
                    pikachu -= attackDamage;
                } 
                else if (playerChoice == 2) {
                    bulbasaur -= attackDamage;
                } 
                else if (playerChoice == 3) {
                    charlszard -= attackDamage;
                }
            }
            else if (computerMove == 2) {
                byte attackDamage = 10;
                System.out.println(pokemon + " uses " + secondMove + "!");
                System.out.println("Attack Damage: " + attackDamage);
                if (playerChoice == 1) {
                    pikachu -= attackDamage;
                } 
                else if (playerChoice == 2) {
                    bulbasaur -= attackDamage;
                } 
                else if (playerChoice == 3) {
                    charlszard -= attackDamage;
                }
            }
        }
        else if (computerChoice == 2) {
            String pokemon = "Pidgeotto";
            String firstMove = "Gust";
            String secondMove = "Quick Attack";
            
            int computerMove = rng.nextInt(1) + 1;

            if (computerMove == 1) {
                byte attackDamage = 15;
                System.out.println(pokemon + " uses " + firstMove + "!");
                System.out.println("Attack Damage: " + attackDamage);
                if (playerChoice == 1) {
                    pikachu -= attackDamage;
                } 
                else if (playerChoice == 2) {
                    bulbasaur -= attackDamage;
                } 
                else if (playerChoice == 3) {
                    charlszard -= attackDamage;
                }
            }
            else if (computerMove == 2) {
                byte attackDamage = 10;
                System.out.println(pokemon + " uses " + secondMove + "!");
                System.out.println("Attack Damage: " + attackDamage);
                if (playerChoice == 1) {
                    pikachu -= attackDamage;
                } 
                else if (playerChoice == 2) {
                    bulbasaur -= attackDamage;
                } 
                else if (playerChoice == 3) {
                    charlszard -= attackDamage;
                }
            }
        }
        else if (computerChoice == 3) {
            String pokemon = "Gyarados";
            String firstMove = "Hydro Pump";
            String secondMove = "Bite";

            int computerMove = rng.nextInt(1) + 1;

            if (computerMove == 1) {
                byte attackDamage = 25;
                System.out.println(pokemon + " uses " + firstMove + "!");
                System.out.println("Attack Damage: " + attackDamage);
                if (playerChoice == 1) {
                    pikachu -= attackDamage;
                } 
                else if (playerChoice == 2) {
                    bulbasaur -= attackDamage;
                } 
                else if (playerChoice == 3) {
                    charlszard -= attackDamage;
                }
            }
            else if (computerMove == 2) {
                byte attackDamage = 15;
                System.out.println(pokemon + " uses " + secondMove + "!");
                System.out.println("Attack Damage: " + attackDamage);
                if (playerChoice == 1) {
                    pikachu -= attackDamage;
                } 
                else if (playerChoice == 2) {
                    bulbasaur -= attackDamage;
                } 
                else if (playerChoice == 3) {
                    charlszard -= attackDamage;
                }
            }
        }

        System.out.println();
        System.out.println("BATTLE STATUS");
        System.out.println("Player's Pokemon Health:");
        System.out.println("Pikachu = " + pikachu);
        System.out.println("Bulbasaur = " + bulbasaur);
        System.out.println("Charlszard = " + charlszard);
        System.out.println();
        System.out.println("Computer AI Pokemon Health:");
        System.out.println("Squirtle = " + squirtle);
        System.out.println("Pidgeotto = " + pidgeotto);
        System.out.println("Gyarados = " + gyarados);

        input.close();
    }
}
