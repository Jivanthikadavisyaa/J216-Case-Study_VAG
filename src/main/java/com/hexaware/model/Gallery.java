package com.hexaware.model;

/**
 * Represents a gallery.
 */
public class Gallery {

    private int GalleryID;
    private String Name;
    private String Description;
    private String Location;
    private int Curator;
    private String OpeningHours;

    /**
     * Default constructor for the Gallery class.
     */
    public Gallery() {
        System.out.println("From Gallery Constr...");
    }

    /**
     * Parameterized constructor for the Gallery class.
     * @param GalleryID the ID of the gallery
     * @param Name the name of the gallery
     * @param Description the description of the gallery
     * @param Location the location of the gallery
     * @param Curator the curator of the gallery
     * @param OpeningHours the opening hours of the gallery
     */
    public Gallery(int GalleryID, String Name, String Description, String Location, int Curator, String OpeningHours) {
        this.GalleryID = GalleryID;
        this.Name = Name;
        this.Description = Description;
        this.Location = Location;
        this.Curator = Curator;
        this.OpeningHours = OpeningHours;
    }

    // Getters and setters

    /**
     * Gets the ID of the gallery.
     * @return the gallery ID
     */
    public int getGalleryID() {
        return GalleryID;
    }

    /**
     * Gets the name of the gallery.
     * @return the gallery name
     */
    public String getName() {
        return Name;
    }

    /**
     * Gets the description of the gallery.
     * @return the gallery description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * Gets the location of the gallery.
     * @return the gallery location
     */
    public String getLocation() {
        return Location;
    }

    /**
     * Gets the curator of the gallery.
     * @return the gallery curator
     */
    public int getCurator() {
        return Curator;
    }

    /**
     * Gets the opening hours of the gallery.
     * @return the gallery opening hours
     */
    public String getOpeningHours() {
        return OpeningHours;
    }

    /**
     * Sets the ID of the gallery.
     * @param GalleryID the gallery ID to set
     */
    public void setGalleryID(int GalleryID) {
        this.GalleryID = GalleryID;
    }

    /**
     * Sets the name of the gallery.
     * @param Name the gallery name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Sets the description of the gallery.
     * @param Description the gallery description to set
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Sets the location of the gallery.
     * @param Location the gallery location to set
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Sets the curator of the gallery.
     * @param Curator the gallery curator to set
     */
    public void setCurator(int Curator) {
        this.Curator = Curator;
    }

    /**
     * Sets the opening hours of the gallery.
     * @param OpeningHours the gallery opening hours to set
     */
    public void setOpeningHours(String OpeningHours) {
        this.OpeningHours = OpeningHours;
    }

}
