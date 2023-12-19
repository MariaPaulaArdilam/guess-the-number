import java.util.Random;

public class GuessTheNumberGame {

    public static void main (String[] args) {
        //Atributo
        int target_number = genereRandomNumber();
        System.out.println(target_number);
        //objeto
        HumanPlayer player1 = new HumanPlayer();
        ComputerPlayer compuPlayer = new ComputerPlayer();
        rangeDifference(target_number, player1.getNumber());
        rangeDifference(target_number, compuPlayer.getCompuNumber());
        while (target_number != player1.getNumber()) {
            //new HumanPlayer();
            //new ComputerPlayer();
        } if(target_number == player1.getNumber()){
            System.out.println("¡finish!");
        }
    }

    public static int genereRandomNumber() {
        Random random_number = new Random();
        int final_random_number = random_number.nextInt(100)+1;
        return final_random_number;
    }

    //metodo checkGuess(Player player)

    public static int rangeDifference(int targetNumber, int playerNumber) {
        int difference = Math.abs(targetNumber - playerNumber);

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