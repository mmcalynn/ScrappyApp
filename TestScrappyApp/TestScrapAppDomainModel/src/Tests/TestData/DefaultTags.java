package Tests.TestData;

import scrapApp.domainModel.Tag.Tag;

public class DefaultTags {

	private static String _tagValue1 = "Tag 1";
	private static String _tagValue2 = "Tag 2";
	
	public static Tag DefaultTagOne()
	{
		return new Tag(Integer.valueOf(1), _tagValue1);
	}
	
	public static Tag DefaultTagTwo()
	{
		return new Tag(Integer.valueOf(2), _tagValue2);
	}
	
}
