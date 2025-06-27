import java.util.Scanner;

public class PartyVote {
    public static void main(String[] args) {
        //Variables
        Scanner in = new Scanner(System.in);
        String menuChoice = "";

        //Scanner/Menu
        System.out.println("Please choose your political party: ");
        System.out.println("D - Democrat");
        System.out.println("R - Republican");
        System.out.println("I - Independent");
        System.out.print("Which are you? ");
        menuChoice = in.nextLine();

        //Outputs
        if (menuChoice.equalsIgnoreCase("D")) {
            System.out.println("You are a Democratic Donkey.");
        } else if (menuChoice.equalsIgnoreCase("R")) {
            System.out.println("You are a Republican Elephant.");
        } else if (menuChoice.equalsIgnoreCase("I")) {
            System.out.println("You are an Independent Person.");
        } else {
            System.out.println("You're weird!");
        }
    }
}