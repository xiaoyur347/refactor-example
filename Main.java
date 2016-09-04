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
	}
}
