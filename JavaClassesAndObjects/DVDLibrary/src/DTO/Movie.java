package DTO;

import java.util.Date;

import static DTO.Movie.MPAARating.UNKNOWN;

public class Movie {
    private String title = "default_title";
    private Date releaseDate;
    private MPAARating mpaaRating = UNKNOWN;
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

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public MPAARating getMpaaRating() {
        return mpaaRating;
    }

    public void setMpaaRating(MPAARating mpaaRating) {
        this.mpaaRating = mpaaRating;
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

    public enum MPAARating{
        G,
        PG,
        PG13,
        R,
        UNKNOWN
    }
}


