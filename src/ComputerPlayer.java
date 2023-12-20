import java.util.Random;

public class ComputerPlayer extends Player{

    public ComputerPlayer(){

    }
    @Override
    int makeGuess(Player player){
        Random random =  new Random();
        int randomNumberFinal = random.nextInt(100) + 1;
        player.setGuesses(randomNumberFinal);
        return randomNumberFinal;
    }
}
