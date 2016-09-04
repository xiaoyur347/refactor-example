class Main {
	public static void main(String args[]) {
		Movie movie1 = new Movie("movie_regular", Movie.REGULAR);
		Movie movie2 = new Movie("movie_new", Movie.NEW_RELEASE);
		Movie movie3 = new Movie("movie_child", Movie.CHILDRENS);
		Customer customer = new Customer("Jean");
		customer.addRental(new Rental(movie1, 10));
		customer.addRental(new Rental(movie2, 15));
		customer.addRental(new Rental(movie3, 20));
		String result = customer.statement();
		System.out.println(result);
		String expect = "Rental Record for Jean\n";
		expect += "\tmovie_regular\t14.0\n";
		expect += "\tmovie_new\t45.0\n";
		expect += "\tmovie_child\t27.0\n";
		expect += "Amount owed is 86.0\n";
		expect += "You earned 4 frequent renter points";
		if (!result.equals(expect)) {
			System.out.println("unexpected");
		}
	}
}
