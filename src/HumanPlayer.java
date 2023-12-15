import java.util.Scanner;

public class HumanPlayer extends Player {
    Scanner scanner = new Scanner(System.in);
    public int att_number;
    public int getNumber() {
        return att_number;
    }
    public void setNumber(int number) {
        this.att_number = number;
    }
    //constructor
    public HumanPlayer (){
        System.out.println("--- Round: Player 1 ---");
        System.out.print("Player 1, enter you guess :");
        int numero_from_console = scanner.nextInt();
        setNumber(numero_from_console);
    }
}
