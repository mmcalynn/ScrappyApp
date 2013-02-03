package scrapApp.domainModel.Builders;

import scrapApp.domainModel.utilities.SetMethodResult;
import scrapApp.domainModel.utilities.SetMethodResult.ErrorType;

public class SetMethodResultBuilder {

	public static SetMethodResult CreateSuccess(String message)
	{
		return new SetMethodResult(message, true);
	}
	
	public static SetMethodResult CreateFailure(String message)
	{
		return new SetMethodResult(message, false);
	}
	
	public static SetMethodResult CreateFailure(String message, ErrorType errorType)
	{
		return new SetMethodResult(message, false, errorType);
	}	
}
