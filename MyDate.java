import java.util.GregorianCalendar;

public class MyDate {
	private int day;
	private int month; // 0-indexed
	private int year;

	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public MyDate(long elapsedTime) {
		setDate(elapsedTime);
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public void setDate(long elapsedTime) {
		// elapsedTime = ms since Jan 1, 1970

		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTimeInMillis(elapsedTime);

		this.day = calendar.get(GregorianCalendar.DATE);
		this.month = calendar.get(GregorianCalendar.MONTH);
		this.year = calendar.get(GregorianCalendar.YEAR);
	}

	public static void main(String[] args) {
		MyDate date = new MyDate(951368400000L); // My birthday to test

		System.out.println("Year: " + date.getYear());
		System.out.println("Month: " + date.getMonth());
		System.out.println("Day: " + date.getDay());
	}
}