package com.StreamAPI.StreamAPI.TrendingMovies;

class Movie {
    private String title;
    private int releaseYear;
    private double rating;

    public Movie(String title, int releaseYear, double rating) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return title + " | Year: " + releaseYear + " | Rating: " + rating;
    }
}
