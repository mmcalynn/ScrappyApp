package scrapApp.domainModel.Elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

import scrapApp.domainModel.Builders.SetMethodResultBuilder;
import scrapApp.domainModel.Tag.Tag;
import scrapApp.domainModel.Type.ItemType;
import scrapApp.domainModel.utilities.SetMethodResult;
import scrapApp.domainModel.utilities.SetMethodResult.ErrorType;

public class Item {
	//an ID of null indicates a newly created item that has not been saved
	private Integer _id;
	private String _name;
	private String _description;
	private Calendar _dateAdded;
	private Calendar _dateObtained;
	private ItemType _itemType;
	private ArrayList<Integer> _relatedItemsIDs;
	private Tag[] _tags;
	
	public Item(Integer id, String name, String description,
			Calendar dateAdded, Calendar dateObtained, ItemType itemType,
			ArrayList<Integer> relatedItemsIDs, Tag[] tags)
	{
		_id = id;
		_name = name;
		_description = description;
		_dateAdded = dateAdded;
		_dateObtained = dateObtained;
		_itemType = itemType;
		_relatedItemsIDs = relatedItemsIDs;
		_tags = tags;
	}
	
	//get methods
	public Integer ID()
	{
		return this._id;
	}
	
	public String Name()
	{
		return this._name;
	}
	
	public String Description()
	{
		return this._description;
	}
	
	public Calendar DateAdded()
	{
		return this._dateAdded;
	}
	
	public Calendar DateObtained()
	{
		return this._dateObtained;
	}
	
	public ItemType ItemType()
	{
		return this._itemType;
	}
		
	public Tag[] Tags()
	{
		return _tags;
	}
	
	public Integer[] RelatedItemIds()
	{
		Integer[] relatedItemIds = new Integer[_relatedItemsIDs.size()];
		return this._relatedItemsIDs.toArray(relatedItemIds);
	}
	
	//set methods
	public SetMethodResult Name(String name)
	{
		this._name = name;
		return SetMethodResultBuilder.CreateSuccess(null);
	}
	
	public SetMethodResult Description(String description)
	{
		this._description = description;
		return SetMethodResultBuilder.CreateSuccess(null);
	}
	
	public SetMethodResult ItemType(ItemType itemType)
	{
		this._itemType = itemType;
		return SetMethodResultBuilder.CreateSuccess(null);
	}
	
	public SetMethodResult DateAdded(Calendar dateAdded)
	{
		this._dateAdded = dateAdded;
		return SetMethodResultBuilder.CreateSuccess(null);
	}
	
	public SetMethodResult DateObtained(Calendar dateObtained)
	{
		this._dateObtained = dateObtained;
		return SetMethodResultBuilder.CreateSuccess(null);
	}
	
	//add the ID of a related Item, returns boolean indicating success or failure
	public SetMethodResult AddRelatedItemId(Integer relatedItemId)
	{
		//null check
		if( relatedItemId == null)
		{
			return SetMethodResultBuilder.CreateFailure("relatedItemId passed to method was null", ErrorType.NULLVALUE);
		}
		//check ID not already in array
		if ( this._relatedItemsIDs.contains(relatedItemId) )
		{
			return SetMethodResultBuilder.CreateFailure("relatedItemId parameter passed to AddRelatedItemId", ErrorType.ALREADYEXISTSINARRAY );
		}
		
		_relatedItemsIDs.add(relatedItemId);
		return SetMethodResultBuilder.CreateSuccess(null);
	}
	
	//remove an ID from RelatedItemIds list
	public SetMethodResult RemoveRelatedItemId(Integer relatedItemId)
	{
		if ( relatedItemId == null )
		{
			return SetMethodResultBuilder.CreateFailure("relatedItemId passed to method was null", ErrorType.NULLVALUE);
		}
		//check ID is in array
		if (!this._relatedItemsIDs.contains(relatedItemId))
		{
			return SetMethodResultBuilder.CreateFailure("relatedItemId passed to method was null", ErrorType.NOTINARRAY);
		}
		this._relatedItemsIDs.remove(relatedItemId);
		return SetMethodResultBuilder.CreateSuccess(null);
	}
}
