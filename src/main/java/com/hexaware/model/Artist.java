package com.hexaware.model;

/**
 * Represents an artist.
 */
public class Artist {

    private int ArtistID;
    private String Name;
    private String Biography;
    private String BirthDate;
    private String Nationality;
    private String Website;
    private String ContactInformation;

    /**
     * Default constructor for the Artist class.
     */
    public Artist() {
        System.out.println("From Artist Constr...");
    }

    /**
     * Parameterized constructor for the Artist class.
     * @param ArtistID the ID of the artist
     * @param Name the name of the artist
     * @param Biography the biography of the artist
     * @param BirthDate the birth date of the artist
     * @param Nationality the nationality of the artist
     * @param Website the website of the artist
     * @param ContactInformation the contact information of the artist
     */
    public Artist(int ArtistID, String Name, String Biography, String BirthDate, String Nationality,
            String Website, String ContactInformation) {
        super();
        this.ArtistID = ArtistID;
        this.Name = Name;
        this.Biography = Biography;
        this.BirthDate = BirthDate;
        this.Nationality = Nationality;
        this.Website = Website;
        this.ContactInformation = ContactInformation;
    }

    // Getters and setters

    /**
     * Gets the ID of the artist.
     * @return the artist ID
     */
    public int getArtistID() {
        return ArtistID;
    }

    /**
     * Gets the name of the artist.
     * @return the artist name
     */
    public String getName() {
        return Name;
    }

    /**
     * Gets the biography of the artist.
     * @return the artist biography
     */
    public String getBiography() {
        return Biography;
    }

    /**
     * Gets the birth date of the artist.
     * @return the artist birth date
     */
    public String getBirthDate() {
        return BirthDate;
    }

    /**
     * Gets the nationality of the artist.
     * @return the artist nationality
     */
    public String getNationality() {
        return Nationality;
    }

    /**
     * Gets the website of the artist.
     * @return the artist website
     */
    public String getWebsite() {
        return Website;
    }

    /**
     * Gets the contact information of the artist.
     * @return the artist contact information
     */
    public String getContactInformation() {
        return ContactInformation;
    }

    /**
     * Sets the ID of the artist.
     * @param ArtistID the artist ID to set
     */
    public void setArtistID(int ArtistID) {
        this.ArtistID = ArtistID;
    }

    /**
     * Sets the name of the artist.
     * @param Name the artist name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Sets the biography of the artist.
     * @param Biography the artist biography to set
     */
    public void setBiography(String Biography) {
        this.Biography = Biography;
    }

    /**
     * Sets the birth date of the artist.
     * @param BirthDate the artist birth date to set
     */
    public void setBirthDate(String BirthDate) {
        this.BirthDate = BirthDate;
    }

    /**
     * Sets the nationality of the artist.
     * @param Nationality the artist nationality to set
     */
    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    /**
     * Sets the website of the artist.
     * @param Website the artist website to set
     */
    public void setWebsite(String Website) {
        this.Website = Website;
    }

    /**
     * Sets the contact information of the artist.
     * @param ContactInformation the artist contact information to set
     */
    public void setContactInformation(String ContactInformation) {
        this.ContactInformation = ContactInformation;
    }

}
