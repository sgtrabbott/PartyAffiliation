public class PartyVote
{
    public static void main(String[] args) {
        String menuChoice = "";
        String menu = "D - Democrat, R - Republican, I - Independent O - Other";
        menuChoice = "R";

        if (menuChoice.equalsIgnoreCase ("D")) ;
        {
            System.out.println("You're a Democrat, you get a Donkey!");
        }
        else if (menuChoice.equalsIgnoreCase("R"));
        {
            System.out.println("You're a Republican, you get an Elephant!");
        }
        else if (menuChoice.equalsIgnoreCase("I"));
        {
            System.out.println("You're a Independent, you get a Human!");
        }
        else if (menuChoice.equalsIgnoreCase("O"));
        {
            System.out.println("You're from a different party, you get null!");
        }

    }
}