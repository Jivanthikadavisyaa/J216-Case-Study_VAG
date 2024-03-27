package com.hexaware.model;

/**
 * Represents a user of the system.
 */
public class User {

    private int UserID;
    private String UserName;
    private String Password;
    private String Email;
    private String FirstName;
    private String LastName;
    private String DateOfBirth;
    private String ProfilePicture;
    private String FavouriteArtworks;

    /**
     * Default constructor for the User class.
     */
    public User() {
        System.out.println("From User Constr...");
    }

    /**
     * Parameterized constructor for the User class.
     * @param UserID the ID of the user
     * @param UserName the username of the user
     * @param Password the password of the user
     * @param Email the email of the user
     * @param FirstName the first name of the user
     * @param LastName the last name of the user
     * @param DateOfBirth the date of birth of the user
     * @param ProfilePicture the profile picture of the user
     * @param FavouriteArtworks the favourite artworks of the user
     */
    public User(int UserID, String UserName, String Password, String Email, String FirstName, String LastName, String DateOfBirth, String ProfilePicture, String FavouriteArtworks) {
        this.UserID = UserID;
        this.UserName = UserName;
        this.Password = Password;
        this.Email = Email;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.DateOfBirth = DateOfBirth;
        this.ProfilePicture = ProfilePicture;
        this.FavouriteArtworks = FavouriteArtworks;
    }

    // Getters and setters

    /**
     * Gets the ID of the user.
     * @return the user ID
     */
    public int getUserID() {
        return UserID;
    }

    /**
     * Gets the username of the user.
     * @return the username
     */
    public String getUserName() {
        return UserName;
    }

    /**
     * Gets the password of the user.
     * @return the password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * Gets the email of the user.
     * @return the email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * Gets the first name of the user.
     * @return the first name
     */
    public String getFirstName() {
        return FirstName;
    }

    /**
     * Gets the last name of the user.
     * @return the last name
     */
    public String getLastName() {
        return LastName;
    }

    /**
     * Gets the date of birth of the user.
     * @return the date of birth
     */
    public String getDateOfBirth() {
        return DateOfBirth;
    }

    /**
     * Gets the profile picture of the user.
     * @return the profile picture
     */
    public String getProfilePicture() {
        return ProfilePicture;
    }

    /**
     * Gets the favourite artworks of the user.
     * @return the favourite artworks
     */
    public String getFavouriteArtworks() {
        return FavouriteArtworks;
    }

    /**
     * Sets the ID of the user.
     * @param UserID the user ID to set
     */
    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    /**
     * Sets the username of the user.
     * @param UserName the username to set
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Sets the password of the user.
     * @param Password the password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Sets the email of the user.
     * @param Email the email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Sets the first name of the user.
     * @param FirstName the first name to set
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * Sets the last name of the user.
     * @param LastName the last name to set
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * Sets the date of birth of the user.
     * @param DateOfBirth the date of birth to set
     */
    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    /**
     * Sets the profile picture of the user.
     * @param ProfilePicture the profile picture to set
     */
    public void setProfilePicture(String ProfilePicture) {
        this.ProfilePicture = ProfilePicture;
    }

    /**
     * Sets the favourite artworks of the user.
     * @param FavouriteArtworks the favourite artworks to set
     */
    public void setFavouriteArtworks(String FavouriteArtworks) {
        this.FavouriteArtworks = FavouriteArtworks;
    }
     public String toString() {
        return "User [UserID=" + UserID + ", UserName=" + UserName + ", Password=" + Password + ", Email=" + Email
                + ", FirstName=" + FirstName + ", LastName=" + LastName + ", DateOfBirth=" + DateOfBirth
                + ", ProfilePicture=" + ProfilePicture + ", FavouriteArtworks=" + FavouriteArtworks + "]";
    }
}

