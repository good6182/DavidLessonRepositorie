
public class ReferInformation {
	
	private final String[] months = {
		"January","February","March",
		"April","May","June",
		"July","August","September",
		"October","November","December"};
	
	public String[] getMonthsArray(){
		return months;
	}
	
	public String getMonth(int input){
		return months[input-1].toString();
	}
}
