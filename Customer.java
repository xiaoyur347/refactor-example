import java.util.Vector;
import java.util.Enumeration;
class Customer {
	private String _name;
	private Vector<Rental> _rentals = new Vector<Rental>();

	public Customer(String name) {
		_name = name;
	}
	public void addRental(Rental rental) {
		_rentals.addElement(rental);
	}
	public String getName() {
		return _name;
	}
	public double getTotalCharge() {
		double result = 0;
		Enumeration rentals = _rentals.elements();
		while (rentals.hasMoreElements()) {
			Rental each = (Rental)rentals.nextElement();
			result += each.getCharge();
		}
		return result;
	}
	public int getTotalFrequentRenterPoints() {
		int result = 0;
		Enumeration rentals = _rentals.elements();
		while (rentals.hasMoreElements()) {
			Rental each = (Rental)rentals.nextElement();
			result += each.getFrequentRenterPoints();
		}
		return result;
	}
	public String statement() {
		String result = "Rental Record for " + getName() + "\n";
		Enumeration rentals = _rentals.elements();
		while (rentals.hasMoreElements()) {
			Rental each = (Rental)rentals.nextElement();

			//show figures for this rental
			result += "\t" + each.getMovie().getTitle() + "\t" +
				String.valueOf(each.getCharge()) + "\n";
		}

		//add footer lines
		result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
		result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) +
			" frequent renter points";
		return result;
	}
}
