package Tests;

import java.io.Console;
import java.util.ArrayList;
import java.util.Calendar;

import Tests.TestData.DefaultItemData;
import scrapApp.domainModel.Elements.Item;
import scrapApp.domainModel.Tag.Tag;
import scrapApp.domainModel.Type.ItemType;

//class for testing the Item class
public class ItemTests {
	
	private static String _defaultItemName = DefaultItemData.DefaultItemName();
	private static String _defaultItemDescription = DefaultItemData.DefaultItemDescription();
	private static Calendar _defaultItemDateAdded = DefaultItemData.DefaultDateAdded();
	private static Calendar _defaultItemDateObtained = DefaultItemData.DefaultDateObtained();
	private static ItemType _defaultItemItemType = DefaultItemData.DefaultItemType();
	private static ArrayList<Integer> _defaultItemRelatedItemsIDs = DefaultItemData.DefaultRelatedItems();
	private static Tag[] _defaultItemTags = DefaultItemData.DefaultTags();	
	
	private static Item testItem = new Item(Integer.valueOf(1), _defaultItemName, _defaultItemDescription, _defaultItemDateAdded, _defaultItemDateObtained, 
			_defaultItemItemType, _defaultItemRelatedItemsIDs, _defaultItemTags);

	
	//test, print the description of an item
	//returns false if description does not match the one originally passed to item
	public static boolean TestItemDescription()
	{
		System.out.println("testItem created with description: "+_defaultItemDescription);
		String itemDescription = testItem.Description();
		System.out.println("testItem description returned as: "+itemDescription);
		
		if ( itemDescription.equals(_defaultItemDescription))
		{
			return true;
		}
		return false;				
	}
	
	public static void main(String[] args)
	{
		ItemTests.TestItemDescription();
	}
}
