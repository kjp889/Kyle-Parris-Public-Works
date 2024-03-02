package Final;

public abstract class Reservation {
	
	protected String firstName;
	protected String lastName;
	protected Date reservationDate;
	protected String contact;
	protected String methodOfPayment;
	
	public Reservation() {
		this.firstName = "";
		this.lastName = "";
		this.reservationDate = 12/04/1999;
		this.contact = "";
		this.methodOfPayment = "";
	}
	
	public Reservation(String firstName, String lastName, Date reservationDate, String contact,
			String methodOfPayment) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.reservationDate = reservationDate;
		this.contact = contact;
		this.methodOfPayment = methodOfPayment;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getReservationDate() {
		return reservationDate;
	}

	public void setReservationDate(Date reservationDate) {
		this.reservationDate = reservationDate;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getMethodOfPayment() {
		return methodOfPayment;
	}

	public void setMethodOfPayment(String methodOfPayment) {
		this.methodOfPayment = methodOfPayment;
	}

	public void review() {
		System.out.println(toString());
	}
	
	public abstract void update();
	
	public abstract void checkIn();
	
	public abstract void cancel();
	
	public String toString() {
		return "First Name: " + firstName + "\nLast Name: " + lastName + "\nContact: " + contact
				+ "\nMethod Of Payment: " + methodOfPayment + "Reservation Date: " + reservationDate;
	}
	
	

}
