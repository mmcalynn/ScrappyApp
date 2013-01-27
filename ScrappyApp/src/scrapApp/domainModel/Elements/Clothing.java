package scrapApp.domainModel.Elements;

import java.util.Date;

import scrapApp.domainModel.Tag.Tag;
import scrapApp.domainModel.Type.ItemType;


public class Clothing extends Item {

	public Clothing(int id, String name, String description, Date dateAdded,
			Date dateObtained, ItemType itemType, int[] relatedItemsIDs,
			Tag[] tags) {
		super(id, name, description, dateAdded, dateObtained, itemType,
				relatedItemsIDs, tags);
		// TODO Auto-generated constructor stub
	}


}
