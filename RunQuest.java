public class RunQuest
{
	public static void main (String[] args)
	{
		CoffeeMakerQuest newQ = new CoffeeMakerQuest();

		while (true)
		{
			System.out.println("\n"+newQ.getRoomAt(newQ.getRoomNum())+"\n");
            String userChoice = newQ.getInput();
            int choiceCode = newQ.selectChoice(userChoice);
            choiceCode = choiceCode - 6;
            if (choiceCode == 0){
            	System.exit(0);
            }
            else if (choiceCode == 1){
            	System.exit(1);
            }
		}
	}
}