package sef.module7.sample;
// Needs to be completed
//Extending from Exception class makes CustomException a Checked Exception
public class CustomException extends Exception{

	//1 - Override the toString method of Exception.
	//This message gets printed as soon as CustomException is thrown.
	public String toString() {
		return "catch these excepting hands";
	}

	//You can also write more information about this exception in getMessage()
	//2 - Override getMessage()
	public String getMessage() {
		//3 - Enter a message in it and return the same
		
			return "the only way you'll ever get laid is if you crawl up a chickens ass and wait";
	}
	
	
	
	
	
}
