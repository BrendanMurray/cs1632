import java.util.Scanner;

public class CoffeeMakerQuest{
    public static void main (String[] args){


    }

    public char getInput(){
        System.out.println("INSTRUCTIONS (N,S,L,I,D,H) >");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        char choice = userInput.charAt(0);
        return choice;
    }

    public void selectChoice(char input){
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
    public int moveNorth(){

    }

    //move player south if south door exists
    public int moveSouth(){

    }

    //look in room for item
    public void look(){

    }

    //display inventory
    public void showInventory(){

    }

    //drink contents of inventory
    public void drink(){

    }

    //display help message
    public void help(){

    }
}
