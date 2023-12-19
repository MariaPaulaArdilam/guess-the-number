import java.util.Random;

public class GuessTheNumberGame {

    public static void main (String[] args) {
        //Atributo
        int target_number = genereRandomNumber();
        System.out.println(target_number);
        //objeto
        HumanPlayer player = new HumanPlayer();
        ComputerPlayer compuPlayer = new ComputerPlayer();

    }

    public static int genereRandomNumber() {
        Random random_number = new Random();
        int final_random_number = random_number.nextInt(100)+1;
        return final_random_number;
    }

    //metodo checkGuess(Player player)

    public static int rangeDifference(int targetNumber, int makeGuess) {
        int difference = Math.abs(targetNumber - makeGuess);

        if (difference <= 5) {
            System.out.println("to close.");
        } else if (difference <= 10) {
            System.out.println("Close.");
        } else {
            System.out.println("Far away.");
        }
        return difference;
    }



}