package Tests.TestData;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import scrapApp.domainModel.Tag.Tag;
import scrapApp.domainModel.Type.ItemType;

public class DefaultItemData {

	private static String _defaultItemName = "Test Item Name";
	private static String _defaultItemDescription = "Test Item Description";
	private static Calendar _defaultItemDateAdded = null;
	private static Calendar _defaultItemDateObtained = null;
	private static ItemType _defaultItemItemType = ItemType.MISC;
	private static ArrayList<Integer> _defaultItemRelatedItemsIDs = new ArrayList<Integer>();
	private static Tag[] _defaultItemTags;
	
	public static String DefaultItemName()
	{
		return _defaultItemName;
	}
	
	public static String DefaultItemDescription()
	{
		return _defaultItemDescription;
	}
	
	public static Calendar DefaultDateAdded()
	{
		if ( _defaultItemDateAdded == null )
		{
			_defaultItemDateAdded = Calendar.getInstance();
		}
		return _defaultItemDateAdded;
	}
	
	public static Calendar DefaultDateObtained()
	{
		if ( _defaultItemDateObtained == null )
		{
			_defaultItemDateObtained = Calendar.getInstance();
			_defaultItemDateObtained.set(1987, 8, 22);
		}
		return _defaultItemDateObtained;
	}
	
	public static ItemType DefaultItemType()
	{
		return _defaultItemItemType;
	}
	
	public static ArrayList<Integer> DefaultRelatedItems()
	{
		return _defaultItemRelatedItemsIDs;
	}
	
	public static Tag[] DefaultTags()
	{
		if(_defaultItemTags == null)
		{
			Tag testTagOne = DefaultTags.DefaultTagOne();
			Tag testTagTwo = DefaultTags.DefaultTagTwo();
			_defaultItemTags = new Tag[] { testTagOne, testTagTwo };
		}
		
		return _defaultItemTags;
	}
}
