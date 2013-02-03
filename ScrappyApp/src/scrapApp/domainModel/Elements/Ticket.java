package scrapApp.domainModel.Elements;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import scrapApp.domainModel.Tag.Tag;
import scrapApp.domainModel.Type.ItemType;
import scrapApp.domainModel.Type.TicketType;

public class Ticket extends Item {
	
	private TicketType _ticketType;
	
	public Ticket(int id, String name, String description, Calendar dateAdded,
			Calendar dateObtained, ItemType itemType,
			ArrayList<Integer> relatedItemsIDs, TicketType ticketType, Tag[] tags) 
	{
		super(id, name, description, dateAdded, dateObtained, 
				itemType, relatedItemsIDs, tags);
		_ticketType = ticketType;
	}
	
	//getters
	public TicketType TicketType()
	{
		return _ticketType;
	}
}
