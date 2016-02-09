import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class CoffeeMakerTest
{
	//--Movement Tests--//
	
	//test moveNorth
	@Test
	public void northTest()
	{
		CoffeeMakerQuest coffeeQ = new CoffeeMakerQuest();
		for (int i = 0; i < 6; i++)
			coffeeQ.moveNorth();
		assertEquals(coffeeQ.getRoomNum(), 5); //Make roomNum increases for every moveNorth call
	}
	
	@Test
	public void northBoundTest()
	{
		CoffeeMakerQuest coffeeQ = new CoffeeMakerQuest();
		coffeeQ.setRoom(5);
		coffeeQ.moveNorth();
		assertEquals(coffeeQ.getRoomNum(), 5); //Make sure can't move past last room
	}
	
	//test moveSouth
	@Test
	public void southTest()
	{
		CoffeeMakerQuest coffeeQ = new CoffeeMakerQuest();
		coffeeQ.setRoom(5);
		for (int i = 0; i < 6; i++)
			coffeeQ.moveSouth();
		assertEquals(coffeeQ.getRoomNum(), 0); //Make roomNum decreases for every moveSouth call
	}
	
	@Test
	public void southBoundTest()
	{
		CoffeeMakerQuest coffeeQ = new CoffeeMakerQuest();
		coffeeQ.moveSouth();
		assertEquals(coffeeQ.getRoomNum(), 0); //Make sure can't move past first room
	}
	
	//
}