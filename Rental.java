class Rental {
	private Movie _movie;
	private int _daysRented;

	public Rental(Movie movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
	}
	public int getDaysRented() {
		return _daysRented;
	}
	public Movie getMovie() {
		return _movie;
	}
	public double getCharge() {
		return getMovie().getCharge(getDaysRented());
	}
	public int getFrequentRenterPoints() {
		int points = 1;
		//add bonus for a two day new release rental
		if ((getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
			getDaysRented() > 1)
			points ++;
		return points;
	}
}
