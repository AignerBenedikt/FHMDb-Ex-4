package at.ac.fhcampuswien.fhmdb.sorting;

import at.ac.fhcampuswien.fhmdb.controllers.MovieListController;

public abstract class State {
    protected MovieListController movieListController;
    public State(MovieListController movieListController) {
        this.movieListController = movieListController;
    }
    public abstract void sort();
    public abstract void changeSortState();
}
