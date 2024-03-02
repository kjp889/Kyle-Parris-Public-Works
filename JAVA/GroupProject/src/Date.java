/**
 * Date class - manages dates within the system
 * Wrapper around java.time.LocalDate
 * 
 * @author Brandon Franklyn
 */
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Date {
    private int day; // 1-31 based on month
    private int month; // 1-12 
    private int year;

    // builtin java datetime API
    // our Date class will act as a proxy to this object
    private LocalDate internalInstance;

    public Date() {
        LocalDate date = LocalDate.now(); // get current date
		setInternalInstance(date);
	}

    public Date(int day, int month, int year) throws DateTimeException {
        // doing this validates the date for us
        // a DateTimeException is thrown for invalid dates;
        LocalDate date = LocalDate.of(year, month, day);

        setInternalInstance(date);
	}
	
	public Date(Date date) {
        setInternalInstance(LocalDate.of(date.year, date.month, date.day));
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

    /**
     * Checks if this date is after the specified date.
     * @param date
     * 
     * @return true if this date is after the specified date
     */
    public boolean isAfter(Date date) {
        return this.internalInstance.isAfter(date.internalInstance);
    }

    /**
     * Returns the number of days until the given date
     * @param date
     * @return 
     */
    public int daysUntil(Date date) {
        return this.internalInstance.until(date.internalInstance).getDays();
    }

    @Override
	public String toString() {
		return  String.format("%02d/%02d/%d", day, month, year);
	}

    /**
     * Helper method to assist with instantiating Date objects by setting the attributes
     * based on the give LocalDate instance.
     * 
     * @param date
     */
    private void setInternalInstance(LocalDate date) {
        this.day = date.getDayOfMonth();
		this.month = date.getMonthValue();
		this.year = date.getYear();
        this.internalInstance = date;
    }

    /**
     * Obtains an instance of Date from a text string such as 3/12/2007
     * @param dateString
     * @return
     * @throws DateTimeParseException
     */
    public static Date parse (String dateString) throws DateTimeParseException {
        String[] dateParts = dateString.split("/");
        int day, month, year;

        if (dateParts.length == 3) {
            day = Integer.parseInt(dateParts[0]);
            month = Integer.parseInt(dateParts[1]);
            year = Integer.parseInt(dateParts[2]);
        } else {
            LocalDate date = LocalDate.parse(dateString);
            day = date.getDayOfMonth();
            month = date.getMonthValue();
            year = date.getYear();
        }
        
        return new Date(day, month, year);
    }
}
