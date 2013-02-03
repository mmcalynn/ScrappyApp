package scrapApp.domainModel.Elements;

import java.util.ArrayList;
import java.util.Date;

import scrapApp.domainModel.Builders.SetMethodResultBuilder;
import scrapApp.domainModel.Tag.Tag;
import scrapApp.domainModel.Type.ItemType;
import scrapApp.domainModel.utilities.SetMethodResult;


public class Clothing extends Item {
	
	public enum ClothingType {
		TSHIRT,
		SHIRT,
		JACKET,
		HAT,
		SHOES,
		WRISTBAND,
		GLOVES,
		GLASSES,
		MISC
	}
	
	private ClothingType _clothingType;

	public Clothing(int id, String name, String description, Date dateAdded,
			Date dateObtained, ItemType itemType, ArrayList<Integer> relatedItemsIDs,
			Tag[] tags, ClothingType clothingType) {
		super(id, name, description, dateAdded, dateObtained, itemType,
				relatedItemsIDs, tags);
		_clothingType = clothingType;
	}

	//getters
	public ClothingType ClothingType()
	{
		return this._clothingType;
	}
	
	//setters
	public SetMethodResult ClothingType(ClothingType clothingType)
	{
		this._clothingType = clothingType;
		return SetMethodResultBuilder.CreateSuccess(null);
	}
}
