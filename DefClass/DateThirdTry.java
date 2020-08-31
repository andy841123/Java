public class DateThirdTry
{
	private String  month;
	private int day;
	private int year;
	
	public void setDate(int newMonth,int newDate,int newYear)
	{
		this.month = monthString(newMonth);
		this.day = newDate;
		this.year = newYear;
	}
	public void setDate(String monthString,int day,int year)
	{
		this.month=monthString;
		this.day=day;
		this.year=year;
	}
	public String monthString(int monthNumber)
	{
		switch (monthNumber)
		{
		case 1:
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "Octorber";
		case 11:
			return "Novenber";
		case 12:
			return "December";
		default:
			System.out.println("Fatal Error");
			System.exit(0);
			return "Error";
		}
	}
	public void writeOutput()
	{
		System.out.println(month+" "+day+","+year);
	}
	public String toString()
	{
		return(month+" "+day+","+year);
	}
}
