import java.util.Scanner;

public class HumanPlayer extends Player {

    //constructor
    public HumanPlayer (){
        captureName();
        System.out.println("--- Round: " + getName() + " ---");
        makeGuess();

    }

    public void captureName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un nombre:");
        String playerName = scanner.nextLine();
        setName(playerName);
    }

    @Override
    int makeGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter you guess : " );
        int playerNumber = scanner.nextInt();
        setGuesses(playerNumber);
        return playerNumber;
    }
}
