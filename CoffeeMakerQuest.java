import java.util.Scanner;

public class CoffeeMakerQuest
{
    private static boolean foundCream;
    private static boolean foundCoffee;
    private static boolean foundSugar;
    private static int roomNum = 0;
    private static String[] roomDescriptions = {
        "You see a Small room.\nIt has a Quaint sofa.\nA Magenta door leads North.",
        "You see a Funny room.\nIt has a Sad record player.\nA Beige door leads North.\nA Massive door leads South.",
        "You see a Refinanced room.\nIt has a Tight pizza.\nA Dead door leads North.\nA Smart door leads South.",
        "You see a Dumb room.\nIt has a Flat energy drink.\nA Vivacious door leads North.\nA Slim door leads South.",
        "You see a Bloodthirsty room.\nIt has a Beautiful bag of money.\nA Purple door leads North.\nA Sandy door leads South.",
        "You see a Rough room.\nIt has a Perfect air hockey table.\nA Minimalist door leads South."
    };

    public static void main (String[] args)
    {
        while(true)
        {
                System.out.println("\n"+roomDescriptions[roomNum]+"\n");
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
    public static void moveNorth(){
        if (roomNum < 5){
            roomNum++;
        }
        else{
            System.out.println("There is no door to move North through!");
        }
    }

    //move player south if south door exists
    public static void moveSouth(){
        if (roomNum > 0){
            roomNum--;;
        }
        else{
            System.out.println("There is no door to move South through!");
        }
    }

    //look in room for item; update booleans if anything is found
    public static void look(){
        switch(roomNum)
        {
            case 0 :
                System.out.println("There might be something here...\nYou found some creamy cream!");
                foundCream = true;
                break;
            case 1 :
                System.out.println("You don't see anything out of the ordinary.");
                break;
            case 2 :
                System.out.println("There might be something here...\nYou found some caffeinated coffee!");
                foundCoffee = true;
                break;
            case 3 :
                System.out.println("You don't see anything out of the ordinary.");
                break;
            case 4 :
                System.out.println("You don't see anything out of the ordinary.");
                break;
            case 5 :
                System.out.println("There might be something here...\nYou found some sweet sugar!");
                foundSugar = true;
                break;
        }
    }

    //display inventory
    public static void showInventory(){
        if (!foundCoffee) System.out.println("YOU HAVE NO COFFEE!");
        if (foundCoffee) System.out.println("You have a cup of delicious coffee.");
        if (!foundCream) System.out.println("YOU HAVE NO CREAM!");
        if (foundCream) System.out.println("You have some fresh cream.");
        if (!foundSugar) System.out.println("YOU HAVE NO SUGAR!\n");
        if (foundSugar) System.out.println("You have some tasty sugar.\n");

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
