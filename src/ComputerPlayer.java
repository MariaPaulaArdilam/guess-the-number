import java.util.Random;

public class ComputerPlayer extends Player{
    Random randomNumberComputer =  new Random();
    public int compuNumber;

    public int getCompuNumber() {
        return compuNumber;
    }

    public void setCompuNumber(int compuNumber) {
        this.compuNumber = compuNumber;
    }

    public ComputerPlayer(){
        System.out.println("--- Round: Computer Player ---");
        int randomNumberFinal = randomNumberComputer.nextInt(100) + 1;
        setCompuNumber(randomNumberFinal);
        System.out.println("Computer Player, enter your guess: " + getCompuNumber());
    }
    @Override
    int makeGuess(){
        return 0;
    }
}
