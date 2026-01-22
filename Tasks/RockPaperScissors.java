import java.util.Random;
import java.util.Scanner;

class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] rps = {"Rock", "Paper", "Scissors"};
        
        while (true) {
            String computerMove = rps[random.nextInt(3)];
            
           
            String playerMove;
            while (true) {
                System.out.println("Enter move (Rock, Paper, or Scissors). To quit, type 'exit': ");
                playerMove = scanner.nextLine();
                
                if (playerMove.equalsIgnoreCase("exit")) {
                    System.out.println("Thanks for playing!");
                    return;
                }
                
                if (playerMove.equalsIgnoreCase("Rock") || 
                    playerMove.equalsIgnoreCase("Paper") || 
                    playerMove.equalsIgnoreCase("Scissors")) {
                    break;
                }
                System.out.println(playerMove + " is not a valid move.");
            }

            System.out.println("Computer played: " + computerMove);

          
            if (playerMove.equalsIgnoreCase(computerMove)) {
                System.out.println("It's a tie!");
            } else if (playerMove.equalsIgnoreCase("Rock")) {
                if (computerMove.equals("Scissors")) {
                    System.out.println("You win! Rock blunts Scissors.");
                } else {
                    System.out.println("You lose! Paper covers Rock.");
                }
            } else if (playerMove.equalsIgnoreCase("Paper")) {
                if (computerMove.equals("Rock")) {
                    System.out.println("You win! Paper covers Rock.");
                } else {
                    System.out.println("You lose! Scissors cuts Paper.");
                }
            } else if (playerMove.equalsIgnoreCase("Scissors")) {
                if (computerMove.equals("Paper")) {
                    System.out.println("You win! Scissors cuts Paper.");
                } else {
                    System.out.println("You lose! Rock blunts Scissors.");
                }
            }
            System.out.println("------------------------------");
            scanner.close();
        }
    }
}