public class RunQuest
{
	public static void main (String[] args)
	{
		CoffeeMakerQuest newQ = new CoffeeMakerQuest();

		while (true)
		{
			System.out.println("\n"+newQ.getRoomAt(newQ.getRoomNum())+"\n");
            String userChoice = newQ.getInput();
            newQ.selectChoice(userChoice);
		}
	}
}