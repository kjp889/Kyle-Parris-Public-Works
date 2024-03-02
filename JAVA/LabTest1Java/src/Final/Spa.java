package Final;

public class Spa extends Reservation {
  private String service;

public Spa(String firstName, String lastName, Date reservationDate, String contact, String methodOfPayment,
		String service) {
	super(firstName, lastName, reservationDate, contact, methodOfPayment);
	this.service = service;
}

public Spa() {
	super();
	// TODO Auto-generated constructor stub
}
  
  
}
