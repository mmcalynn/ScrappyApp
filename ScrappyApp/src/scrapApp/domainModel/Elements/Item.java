package scrapApp.domainModel.Elements;

import java.util.Date;

import scrapApp.domainModel.Tag.Tag;
import scrapApp.domainModel.Type.ItemType;

public class Item {
	private int _id;
	private String _name;
	private String _description;
	private Date _dateAdded;
	private Date _dateObtained;
	private ItemType _itemType;
	private int[] _relatedItemsIDs;
	private Tag[] _tags;
	
	public Item(int id, String name, String description,
			Date dateAdded, Date dateObtained, ItemType itemType,
			int[] relatedItemsIDs, Tag[] tags)
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
	public int ID()
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
	
	public Date DateAdded()
	{
		return this._dateAdded;
	}
	
	public Date DateObtained()
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
	
	//set methods
	public void Name(String name)
	{
		this._name = name;
	}
	
	public void Description(String description)
	{
		this._description = description;
	}
	
	public void ItemType(ItemType itemType)
	{
		this._itemType = itemType;
	}
	
	public void DateAdded(Date dateAdded)
	{
		this._dateAdded = dateAdded;
	}
	
	public void DateObtained(Date dateObtained)
	{
		this._dateObtained = dateObtained;
	}
}
