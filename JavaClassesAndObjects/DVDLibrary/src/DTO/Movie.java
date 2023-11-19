package DTO;

import java.util.Objects;

public class Movie {
    private String title = "default_title";
    private String releaseDate;
    private String MPAARating = "UNKNOWN";
    private String director = "unknown_director";
    private String studio = "unknown_studio";
    private int userRating;

    public Movie(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getMpaaRating(String pg) {
        return MPAARating;
    }

    public void setMpaaRating(String string) {
        this.MPAARating = string;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public int getUserRating() {
        return userRating;
    }

    public void setUserRating(int userRating) {
        this.userRating = userRating;
    }

    public void addDvd(Movie m) {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return userRating == movie.userRating && title == movie.title && Objects.equals(releaseDate, movie.releaseDate) && MPAARating == movie.MPAARating && director == movie.director && studio == movie.studio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, releaseDate, MPAARating, director, studio, userRating);
    }

    @Override
    public String toString() {
        return "MOVIE: " + getTitle() + ", "+
                getReleaseDate() + ", " + getMpaaRating("PG") +
                ", " + getDirector() + ", " + getStudio().toString() + ", "+
                getUserRating();
    }

    public enum MPAARating {
        G,
        PG,
        PG13,
        R,
        UNKNOWN
    }
}


