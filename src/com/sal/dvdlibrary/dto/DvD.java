package com.sal.dvdlibrary.dto;

public class DvD {
    private String title;
    private String ReleaseDate;
    private String MPAA;
    private String DirectorsName;
    private String Studio;
    private String UserRating;

    // Initialize the DvD constructor
    public DvD(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public String getReleaseDate() {
        return ReleaseDate;
    }
    public void setReleaseDate(String releaseDate) {
        ReleaseDate = releaseDate;
    }
    public String getMPAA() {
        return MPAA;
    }
    public void setMPAA(String mpaa) {
        MPAA = mpaa;
    }
    public String getDirectorsName() {
        return DirectorsName;
    }
    public void setDirectorsName(String directorsName) {
        DirectorsName = directorsName;
    }
    public String getStudio() {
        return Studio;
    }
    public void setStudio(String studio) {
        Studio = studio;
    }
    public String  getUserRating() {
        return UserRating;
    }
    public void setUserRating(String userRating) {
        UserRating = userRating;
    }
}
