package com.hexaware.dao;

import java.util.List;
/**
 * Interface for managing virtual art gallery operations.
 */

import com.hexaware.exception.ArtWorkNotFoundException;
import com.hexaware.exception.UserNotFoundException;
import com.hexaware.model.Artwork;

public interface IVirtualArtGallery {
	
	//Artwork Management
	
	 /**
     * Adds a new artwork to the virtual art gallery.
     *
     * @param art the artwork to add
     * @return true if the artwork is successfully added, false otherwise
     */

	public boolean addartwork(Artwork art);
	
	 /**
     * Updates an existing artwork in the virtual art gallery.
     *
     * @param art the artwork to update
     * @return true if the artwork is successfully updated, false otherwise
     * @throws ArtWorkNotFoundException if the artwork is not found
     */

	public boolean updateartwork(Artwork art) throws ArtWorkNotFoundException;
	
	/**
     * Searches for artworks in the virtual art gallery based on a keyword.
     *
     * @return a list of artworks that match the search keyword
     */
	
	public List<Artwork> searchArtworks();
	
	
	 /**
     * Removes an artwork from the virtual art gallery.
     *
     * @return true if the artwork is successfully removed, false otherwise
     * @throws ArtWorkNotFoundException if the artwork is not found
     */
	
	public boolean removeartwork()throws ArtWorkNotFoundException;
	
	
	 /**
     * Retrieves an artwork from the virtual art gallery based on its ID.
     *
     * @throws ArtWorkNotFoundException if the artwork is not found
     */
	
	public void getartworkbyid()throws ArtWorkNotFoundException;
	

	
	// User Favorites
	
	/**
     * Adds an artwork to a user's list of favorite artworks.
     *
     * @return true if the artwork is successfully added to the favorites, false otherwise
     */
	
	
	public boolean addArtworkToFavourite();
	
	 /**
     * Removes an artwork from a user's list of favorite artworks.
     *
     * @return true if the artwork is successfully removed from the favorites, false otherwise
     */
		
	public boolean removeArtworkFromFavorite();
	
	/**
     * Retrieves a list of a user's favorite artworks.
     *
     * @return a list of favorite artworks
     * @throws UserNotFoundException if the user is not found
     */
	
	public boolean getUserFavoriteArtworks()throws UserNotFoundException;

	


	


}

