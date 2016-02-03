import java.util.Scanner;

public class CoffeeMakerQuest
{
    private boolean hasCreamer;
    private boolean hasCoffee;
    private boolean hasSugar;

    public static void main (String[] args)
    {
        while(true)
        {
                char userChoice = getInput();
                selectChoice(userChoice);
        }
    }

    public static char getInput(){
        System.out.println("INSTRUCTIONS (N,S,L,I,D,H) >");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        char choice = userInput.charAt(0);
        return choice;
    }

    public static void selectChoice(char input){
        if (input == 'N' || input == 'n'){
            moveNorth();
        }
        else if (input == 'S' || input == 's'){
            moveSouth();
        }
        else if (input == 'L' || input == 'l'){
            look();
        }
        else if (input == 'I' || input == 'i'){
            showInventory();
        }
        else if (input == 'D' || input == 'd'){
            drink();
        }
        else if (input == 'H' || input == 'h'){
            help();
        }
    }

    //move player north if north door exists
    public static int moveNorth(){
        return 0;
    }

    //move player south if south door exists
    public static int moveSouth(){
        return 0;
    }

    //look in room for item
    public static void look(){

    }

    //display inventory
    public static void showInventory(){

    }

    //drink contents of inventory
    public static void drink(){

    }

    //display help message
    public static void help(){
        System.out.println("\nHere are the controls:");
        System.out.println("N -> Move North");
        System.out.println("S -> Move South");
        System.out.println("L -> Look");
        System.out.println("I -> Inspect Inventory");
        System.out.println("D -> Drink");
        System.out.println("H -> Help\n");
    }
}
