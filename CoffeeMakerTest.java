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
	
	//If you collect all items and drink, drink() should return 0
	//This sets each boolean value to be true,
	//then tests the error code of drink
	@Test
	public void testDrinkAllItems(){
		CoffeeMakerQuest testCQ = new CoffeeMakerQuest();
		
		testCQ.setCoffee(true);
		testCQ.setCream(true);
		testCQ.setSugar(true);
		int drinkCode = testCQ.drink();
		assertEquals(0,drinkCode);
	}
	
	//If you don't collect any items and drink, drink should return error code 1
	//This sets all booleans to be false,
	//then tests the error code of drink
	@Test
	public void testDrink000Items(){
		CoffeeMakerQuest testCQ = new CoffeeMakerQuest();
		testCQ.setCoffee(false);
		testCQ.setCream(false);
		testCQ.setSugar(false);
		int drinkCode = testCQ.drink();
		assertEquals(1,drinkCode);
	}
	
	//Drink test for false false true
	@Test
	public void testDrink001Items(){
		CoffeeMakerQuest testCQ = new CoffeeMakerQuest();
		testCQ.setCoffee(false);
		testCQ.setCream(false);
		testCQ.setSugar(true);
		int drinkCode = testCQ.drink();
		assertEquals(1,drinkCode);
	}
	
	//Drink test for false true false
	@Test
	public void testDrink010Items(){
		CoffeeMakerQuest testCQ = new CoffeeMakerQuest();
		testCQ.setCoffee(false);
		testCQ.setCream(true);
		testCQ.setSugar(false);
		int drinkCode = testCQ.drink();
		assertEquals(1,drinkCode);
	}
	
	//Drink test for false true true
	@Test
	public void testDrink011Items(){
		CoffeeMakerQuest testCQ = new CoffeeMakerQuest();
		testCQ.setCoffee(false);
		testCQ.setCream(true);
		testCQ.setSugar(true);
		int drinkCode = testCQ.drink();
		assertEquals(1,drinkCode);
	}
	
	//Drink test for true false false
	@Test
	public void testDrink100Items(){
		CoffeeMakerQuest testCQ = new CoffeeMakerQuest();
		testCQ.setCoffee(true);
		testCQ.setCream(false);
		testCQ.setSugar(false);
		int drinkCode = testCQ.drink();
		assertEquals(1,drinkCode);
	}
	
	//Drink test for true false true
	@Test
	public void testDrink101Items(){
		CoffeeMakerQuest testCQ = new CoffeeMakerQuest();
		testCQ.setCoffee(true);
		testCQ.setCream(false);
		testCQ.setSugar(true);
		int drinkCode = testCQ.drink();
		assertEquals(1,drinkCode);
	}
	
	//This is the last of the drink tests. There are 8 in total for every combination of booleans
	//
	@Test
	public void testDrink110Items(){
		CoffeeMakerQuest testCQ = new CoffeeMakerQuest();
		testCQ.setCoffee(true);
		testCQ.setCream(true);
		testCQ.setSugar(false);
		int drinkCode = testCQ.drink();
		assertEquals(1,drinkCode);
	}
	
	//This tests that you can pick up cream in a respective room.
	//First the room num is set to zero, then look() is called
	//Finally the boolean tracking cream is checked
	@Test
	public void testLookCream(){
		CoffeeMakerQuest testCQ = new CoffeeMakerQuest();
		
		testCQ.setRoom(0);
		testCQ.look();
		assertEquals(testCQ.getCream(),true);
	}
	
	//This tests that you can pick up coffee in a respective room.
	//First the room num is set to two, then look() is called
	//Finally the boolean tracking coffee is checked
	@Test
	public void testLookCoffee(){
		CoffeeMakerQuest testCQ = new CoffeeMakerQuest();
		
		testCQ.setRoom(2);
		testCQ.look();
		assertEquals(testCQ.getCoffee(),true);
	}
	
	//This tests that you can pick up sugar in a respective room.
	//First the room num is set to five, then look() is called
	//Finally the boolean tracking sugar is checked
	@Test
	public void testLookSugar(){
		CoffeeMakerQuest testCQ = new CoffeeMakerQuest();
		
		testCQ.setRoom(5);
		testCQ.look();
		assertEquals(testCQ.getSugar(),true);
	}
	
	//If you look for an item in a room without one the boolean values should be unchanged.
	//This test cycles through the three empty rooms and looks in each one.
	//Then it checks every boolean value to see if they are still false.
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
