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
        captureName();
        System.out.println("--- Round: " + getName() + " ---");
        System.out.print("Enter you guess : ");
        int numero_from_console = scanner.nextInt();
        setNumber(numero_from_console);


    }

    public void captureName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un nombre:");
        String playerName = scanner.nextLine();
        setName(playerName);
    }
}
