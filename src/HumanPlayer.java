import java.util.Scanner;

public class HumanPlayer extends Player {

    //constructor
    public HumanPlayer (){
       super();
    }

    public void captureName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String playerName = scanner.nextLine();
        setName(playerName);
    }

    @Override
    int makeGuess(Player player ) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter you guess : " );
        int playerNumber = scanner.nextInt();
        player.setGuesses(playerNumber);
        return playerNumber;
    }

}
