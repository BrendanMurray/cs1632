import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import static org.junit.Assert.*;
import org.junit.Test;

public class CoffeeMakerTest
{
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
	
	@Test
	public void testDrinkAllItems(){
		CoffeeMakerQuest testCQ = new CoffeeMakerQuest();
		
		testCQ.setCoffee(true);
		testCQ.setCream(true);
		testCQ.setSugar(true);
		int drinkCode = testCQ.drink();
		assertEquals(0,drinkCode);
	}
	
	@Test
	public void testLookCream(){
		CoffeeMakerQuest testCQ = new CoffeeMakerQuest();
		
		testCQ.setRoom(0);
		testCQ.look();
		assertEquals(testCQ.getCream(),true);
	}
	
	@Test
	public void testLookCoffee(){
		CoffeeMakerQuest testCQ = new CoffeeMakerQuest();
		
		testCQ.setRoom(2);
		testCQ.look();
		assertEquals(testCQ.getCoffee(),true);
	}
	
	@Test
	public void testLookSugar(){
		CoffeeMakerQuest testCQ = new CoffeeMakerQuest();
		
		testCQ.setRoom(5);
		testCQ.look();
		assertEquals(testCQ.getSugar(),true);
	}
	
	@Test
	public void testLookEmpty(){
		CoffeeMakerQuest testCQ = new CoffeeMakerQuest();
		testCQ.setRoom(1);
		testCQ.look();
		testCQ.setRoom(3);
		testCQ.look();
		testCQ.setRoom(4);
		testCQ.look();
		assertEquals(testCQ.getCream(),false);
		assertEquals(testCQ.getCoffee(),false);
		assertEquals(testCQ.getSugar(),false);
	}

}

