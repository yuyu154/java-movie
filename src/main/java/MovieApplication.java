import domain.Movie;
import domain.MovieRepository;
import domain.Reservation;
import view.InputView;
import view.OutputView;

import java.util.List;

public class MovieApplication {
    public static void main(String[] args) {
        List<Movie> movies = MovieRepository.getMovies();
        OutputView.printMovies(movies);
        int movieId = InputView.inputMovieId();
        Movie movie = MovieRepository.getMovie(movieId);
        System.out.println(movie);
        int scheduleId = InputView.inputScheduleIndex();
        int buyCount = InputView.inputBuyCount();
        Reservation reservation = new Reservation(movie, scheduleId, buyCount);
        System.out.println(reservation);
    }
}
