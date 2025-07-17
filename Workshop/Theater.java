package LocalRepo.Workshop;

import java.util.ArrayList;

public class Theater {
    private ArrayList<MovieShow> shows;

    public Theater() {
        shows = new ArrayList<>();
    }

    public void addShow(MovieShow newShow) {
        int i = shows.size() - 1;
        shows.add(null);

        while (i >= 0 && shows.get(i).getTime().isAfter(newShow.getTime())) {
            shows.set(i + 1, shows.get(i));
            i--;
        }

        shows.set(i + 1, newShow);
    }

    public void displayShows() {
        System.out.println("\nUpcoming Shows:");
        for (MovieShow show : shows) {
            System.out.println("- " + show);
        }
    }
}

