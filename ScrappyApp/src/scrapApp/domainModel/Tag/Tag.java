package scrapApp.domainModel.Tag;

import scrapApp.domainModel.Builders.SetMethodResultBuilder;
import scrapApp.domainModel.utilities.SetMethodResult;

public class Tag {
	private Integer _tagID;
	private String _tagValue;
	
	public Tag(Integer tagID, String tagValue)
	{
		_tagID = tagID;
		_tagValue = tagValue;
	}
	
	//getters
	public Integer TagID()
	{
		return _tagID;
	}
	
	public String TagValue()
	{
		return _tagValue;
	}
	
	//setters
	public SetMethodResult TagValue(String tagValue)
	{
		_tagValue = tagValue;
		return SetMethodResultBuilder.CreateSuccess(null);
	}
}
