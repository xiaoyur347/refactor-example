class RegularPrice implements Price {
	public int getPriceCode() {
		return Movie.REGULAR;
	}
	public double getCharge(int daysRented) {
		double result = 2;
		if (daysRented > 2)
			result += (daysRented - 2) * 1.5;
		return result;
	}
	public int getFrequentRenterPoints(int daysRented) {
		return 1;
	}
}
