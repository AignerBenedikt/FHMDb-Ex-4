package at.ac.fhcampuswien.fhmdb.sorting;

import at.ac.fhcampuswien.fhmdb.controllers.MovieListController;

public class NotSortedState extends State{
    public NotSortedState(MovieListController mainController) {
        super(mainController);
    }

    @Override
    public void sort() {
    }

    @Override
    public void changeSortState() {
        movieListController.setSortState(new AscendingState(movieListController));
    }
}
