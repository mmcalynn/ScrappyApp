package scrapApp.domainModel.utilities;

public class SetMethodResult {
	public enum ErrorType {
		NOERRORTYPESPECIFIED,
		NULLVALUE,
		ALREADYEXISTSINARRAY,
		NOTINARRAY
	}
	
	private String _message;
	private boolean _success = false;
	private ErrorType _errorType = ErrorType.NOERRORTYPESPECIFIED;
	
	public SetMethodResult(String message, boolean success)
	{
		_message = message;		
		_success = success;
	}
	
	public SetMethodResult(String message, boolean success, ErrorType errorType)
	{	
		_message = message;		
		_success = success;
		_errorType = errorType;
	}
	
	public String Message()
	{
		return _message;
	}
	
	public boolean Success()
	{
		return _success;
	}
	
	public ErrorType ErrorType()
	{
		return _errorType;
	}
}
