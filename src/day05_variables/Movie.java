package day05_variables;

public class Movie {
    public static void main(String[] args) {
        String nameOfTheMovie = "Star Wars";
        String genre = "Fiction";
        String duration = "90 minutes";
        String releaseDate = "05/31/1990";
        String rating = "PG";
        boolean sequels = true;
        int rottenTomatoesRating = 80;
        boolean isOnDvd = true;

        System.out.println("-------Welcome to the Cinema-------" + "\n");
        System.out.println("Tonight we are streaming " +"'" + nameOfTheMovie + "'"+ " which was released on " + releaseDate+ ".");
        System.out.println("This " + genre + " movie got a " + rottenTomatoesRating + " rating on Rotten Tomatoes.");
        System.out.println("The rating is " + rating + " and it runs for " + duration + ".");
        System.out.println("This is a sequel: " + sequels + "\n" + "It is on dvd: " + isOnDvd);







    }
}
