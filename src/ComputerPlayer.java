import java.util.Random;

public class ComputerPlayer extends Player{

    public ComputerPlayer (){
        super();
    }
    @Override
    int makeGuess(Player player){
        Random random =  new Random();
        int randomNumberFinal = random.nextInt(100) + 1;
        System.out.println("--- Round: Computer Player ---");
        System.out.println("Enter your guess: " + randomNumberFinal);
        player.setGuesses(randomNumberFinal);
        return randomNumberFinal;
    }
}
