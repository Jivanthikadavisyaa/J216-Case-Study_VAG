package com.hexaware.model;

/**
 * Represents an artwork.
 */
public class Artwork {

    private int ArtworkID;
    private String Title;
    private String Description;
    private String CreationDate;
    private String Medium;
    private String ImageUrl;

    /**
     * Default constructor for the Artwork class.
     */
    public Artwork() {
        System.out.println("From Artworks Constr...");
    }

    /**
     * Parameterized constructor for the Artwork class.
     * @param ArtworkID the ID of the artwork
     * @param Title the title of the artwork
     * @param Description the description of the artwork
     * @param CreationDate the creation date of the artwork
     * @param Medium the medium of the artwork
     * @param ImageUrl the URL of the image of the artwork
     */
    public Artwork(int ArtworkID, String Title, String Description, String CreationDate, String Medium, String ImageUrl) {
        this.ArtworkID = ArtworkID;
        this.Title = Title;
        this.Description = Description;
        this.CreationDate = CreationDate;
        this.Medium = Medium;
        this.ImageUrl = ImageUrl;
    }

    // Getters and setters

    /**
     * Gets the ID of the artwork.
     * @return the artwork ID
     */
    public int getArtworkID() {
        return ArtworkID;
    }

    /**
     * Gets the title of the artwork.
     * @return the artwork title
     */
    public String getTitle() {
        return Title;
    }

    /**
     * Gets the description of the artwork.
     * @return the artwork description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * Gets the creation date of the artwork.
     * @return the artwork creation date
     */
    public String getCreationDate() {
        return CreationDate;
    }

    /**
     * Gets the medium of the artwork.
     * @return the artwork medium
     */
    public String getMedium() {
        return Medium;
    }

    /**
     * Gets the image URL of the artwork.
     * @return the artwork image URL
     */
    public String getImageUrl() {
        return ImageUrl;
    }

    /**
     * Sets the ID of the artwork.
     * @param ArtworkID the artwork ID to set
     */
    public void setArtworkID(int ArtworkID) {
        this.ArtworkID = ArtworkID;
    }

    /**
     * Sets the title of the artwork.
     * @param Title the artwork title to set
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Sets the description of the artwork.
     * @param Description the artwork description to set
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Sets the creation date of the artwork.
     * @param CreationDate the artwork creation date to set
     */
    public void setCreationDate(String CreationDate) {
        this.CreationDate = CreationDate;
    }

    /**
     * Sets the medium of the artwork.
     * @param Medium the artwork medium to set
     */
    public void setMedium(String Medium) {
        this.Medium = Medium;
    }

    /**
     * Sets the image URL of the artwork.
     * @param ImageUrl the artwork image URL to set
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Returns a string representation of the artwork.
     * @return a string representation of the artwork
     */
    @Override
    public String toString() {
        return "Artwork{" +
                "ArtworkID=" + ArtworkID +
                ", Title='" + Title + '\'' +
                ", Description='" + Description + '\'' +
                ", CreationDate='" + CreationDate + '\'' +
                ", Medium='" + Medium + '\'' +
                ", ImageUrl='" + ImageUrl + '\'' +
                '}';
    }

}
