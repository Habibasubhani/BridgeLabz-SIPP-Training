package LocalRepo.Workshop;

public class MovieTimeApp {
    public static void main(String[] args) {
        Theater theater = new Theater();

        theater.addShow(new MovieShow("Avengers", "15:30"));
        theater.addShow(new MovieShow("Jawan", "11:15"));
        theater.addShow(new MovieShow("Spiderman", "13:45"));
        theater.addShow(new MovieShow("Oppenheimer", "09:30"));

        theater.displayShows();
    }
}

