package com.hexaware.dao;

import java.sql.Connection;
/**
 * Implementation of the IVirtualArtGallery interface that provides methods for managing artworks and galleries.
 */
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hexaware.exception.ArtWorkNotFoundException;
import com.hexaware.exception.UserNotFoundException;
import com.hexaware.model.*;

import com.hexaware.util.DbConnUtil;

public class ImplementationVirtualArtGallery implements IVirtualArtGallery {
	Scanner sc = new Scanner(System.in);
	Connection con;
	Statement stmt;
	PreparedStatement ps;
	ResultSet rs;
	
	  /**
     * Adds a new artwork to the database.
     *
     * @param art the artwork object to be added
     * @return true if the artwork is added successfully, false otherwise
     */

	
	public boolean addartwork(Artwork art) {
	    try {
	        con = DbConnUtil.getDBConn();
	        
	     
	        System.out.println("Enter Artwork ID:");
            art.setArtworkID(sc.nextInt());
            System.out.println("Enter  Title:");
            art.setTitle(sc.next());
            System.out.println("Enter Description:");
            art.setDescription(sc.next());
            System.out.println("Enter Creationdate:");
            art.setCreationDate(sc.next());
            System.out.println("Enter Medium:");
            art.setMedium(sc.next());
            System.out.println("Enter Image URL:");
            art.setImageUrl(sc.next());
            
	        ps = con.prepareStatement("insert into artwork (artworkid,title,description,creationdate,medium,imageurl) VALUES (?,?, ?, ?, ?,?)");
	        ps.setInt(1, art.getArtworkID());
	        ps.setString(2, art.getTitle());
	        ps.setString(3, art.getDescription());
	        ps.setString(4, art.getCreationDate());
	        ps.setString(5, art.getMedium());
	        ps.setString(6,art.getImageUrl());
	        
	       
	        
	        int rowsAffected = ps.executeUpdate();
	        if (rowsAffected > 0) {
	            System.out.println("Added");
	            return true;
	        } 
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
		return false;
	}

	 /**
     * Updates an existing artwork in the database.
     *
     * @param art the artwork object with updated information
     * @return true if the artwork is updated successfully, false otherwise
     * @throws ArtWorkNotFoundException if the artwork is not found in the database
     */

	public boolean updateartwork(Artwork art) throws ArtWorkNotFoundException {
		 try {
		        con = DbConnUtil.getDBConn();
		        System.out.println("Enter Artwork ID:");
	            art.setArtworkID(sc.nextInt());
	            System.out.println("Enter new Title:");
	            art.setTitle(sc.next());
	            System.out.println("Enter new Description:");
	            art.setDescription(sc.next());
	            System.out.println("Enter new Creationdate:");
	            art.setCreationDate(sc.next());
	            System.out.println("Enter new Medium:");
	            art.setMedium(sc.next());
	            System.out.println("Enter Image URL:");
	            art.setImageUrl(sc.next());
		       
		        
		        ps = con.prepareStatement("UPDATE artwork SET title = ?, description = ?, medium = ?, imageurl=? WHERE artworkid = ?");
		        ps.setString(1, art.getTitle());
		        ps.setString(2, art.getDescription());
		        ps.setString(3, art.getMedium());
		        ps.setString(4, art.getImageUrl()); 
		        ps.setInt(5, art.getArtworkID());
		        int rowsUpdated = ps.executeUpdate();
		        if (rowsUpdated > 0) {
		            System.out.println("Artwork updated successfully");
		            return true;
		        } else {
		           throw new ArtWorkNotFoundException("ARtwork Not Found");
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		    return false;
		}
	
	
	
	  /**
     * Removes an artwork from the database.
     *
     * @return true if the artwork is removed successfully, false otherwise
     * @throws ArtWorkNotFoundException if the artwork is not found in the database
     */
	public boolean removeartwork() throws ArtWorkNotFoundException
	{
		System.out.println("Enter Artwork ID:");
		int n=sc.nextInt();
		return removeartworkbydb(n);
		
	}

	public boolean removeartworkbydb(int artworkID) throws ArtWorkNotFoundException {
	    try {
	        con = DbConnUtil.getDBConn();
	        
	        ps = con.prepareStatement("DELETE FROM artwork WHERE artworkid = ?");
	        ps.setInt(1, artworkID);
	        int rowsDeleted = ps.executeUpdate();
	        if (rowsDeleted > 0) {
	            System.out.println("Artwork removed successfully");
	            return true;
	        } else {
	        	throw new ArtWorkNotFoundException("Artwork Not Found");
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } 
	    return false;
	}
	
	
	
	
	 /**
     * Removes an artwork from the database.
     *
     * @return true if the artwork is removed successfully, false otherwise
     * @throws ArtWorkNotFoundException if the artwork is not found in the database
     */
	
	public void getartworkbyid() throws ArtWorkNotFoundException {
		System.out.println("Enter Artwork ID: ");
		int aid=sc.nextInt();
		getArtworkByIddb(aid);
	}
	
	
	

	public Artwork getArtworkByIddb(int artworkID) throws ArtWorkNotFoundException{
	    Artwork art = null; 
	    try {
	        con = DbConnUtil.getDBConn();
	        ps = con.prepareStatement("SELECT * FROM artwork WHERE artworkid = ?");
	        ps.setInt(1, artworkID);
	        ResultSet rs = ps.executeQuery();
	        if (rs.next()) {
	            art = new Artwork(); 
	            art.setArtworkID(rs.getInt("artworkid"));
	            art.setTitle(rs.getString("title"));
	            art.setDescription(rs.getString("description"));
	            art.setCreationDate(rs.getString("creationdate"));
	            art.setMedium(rs.getString("medium"));
	            art.setImageUrl(rs.getString("imageurl"));
	            
	          
	            System.out.println("Artwork ID: " + art.getArtworkID());
	            System.out.println("Title: " + art.getTitle());
	            System.out.println("Description: " + art.getDescription());
	            System.out.println("Creation Date: " + art.getCreationDate());
	            System.out.println("Medium: " + art.getMedium());
	            System.out.println("Image URL: " + art.getImageUrl());
	        } else {
	        	throw new ArtWorkNotFoundException("Artwork Not Found");
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } 
	    return art;
	}

	
	/**
	 * Prompts the user to enter a user ID and artwork ID, then adds the artwork to the user's favorites.
	 *
	 * @return true if the artwork is added to the user's favorites successfully, false otherwise
	 */

	public boolean addArtworkToFavourite()
	{
		System.out.println("Enter User ID:");
		int n=sc.nextInt();
		System.out.println("Enter Artwork ID:");
		int m=sc.nextInt();
		return addArtworkToFavoriteFromdb(n,m);
	}

	public boolean addArtworkToFavoriteFromdb(int userID, int artworkID) {
	    try {
	        con = DbConnUtil.getDBConn();
	        ps = con.prepareStatement("insert into User_Favorite_Artwork (UserID, ArtworkID) values (?, ?)");
	        ps.setInt(1, userID);
	        ps.setInt(2, artworkID);
	        int rowsInserted = ps.executeUpdate();
	        
	        return rowsInserted > 0;
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } 
	    
	    return false;
	}

	/**
	 * Prompts the user to enter a user ID and removes all artworks from the user's favorites.
	 *
	 * @return true if the artworks are removed from the user's favorites successfully, false otherwise
	 */
	
	


	public boolean removeArtworkFromFavorite() {
		
		System.out.println("Enter User ID:");
		int a=sc.nextInt();
		
		return removeArtworkFromFavoritefromdb(a);
		
	}



	public boolean removeArtworkFromFavoritefromdb(int userid) {
		  try {
		        con = DbConnUtil.getDBConn();
		        ps = con.prepareStatement("delete from User_Favorite_Artwork where userid=?");
		        ps.setInt(1, userid);
		        int rowsInserted = ps.executeUpdate();
		        return rowsInserted > 0;
		    } catch (SQLException e) {
		        e.printStackTrace();
		    } 
		    
		    return false;
		
		
		
	}
	
	/**
	 * Prompts the user to enter a user ID and retrieves the user's favorite artworks from the database.
	 *
	 * @return true if the user's favorite artworks are retrieved successfully, false otherwise
	 * @throws UserNotFoundException if the user is not found in the database
	 */
	
	
	public boolean getUserFavoriteArtworks()throws UserNotFoundException
	{
		System.out.println("Enter the User ID: ");
		int s=sc.nextInt();
		return getUserFavoriteArtworksfromdb(s);
		
	}
	
	

	public boolean getUserFavoriteArtworksfromdb(int userId) throws UserNotFoundException {
	    try {
	        con = DbConnUtil.getDBConn();
	        ps = con.prepareStatement("select uf.artworkid, a.title from User_Favorite_Artwork uf join artwork a on uf.artworkid=a.artworkid where userid=?");
	        ps.setInt(1, userId);
	        ResultSet rs = ps.executeQuery();
	       
	        boolean f=false;
	       
	        while (rs.next()) {
	        	f=true;
	            int artworkId = rs.getInt("artworkid");
	            String title = rs.getString("title");
	            System.out.println("Artwork ID: " + artworkId + ", Title: " + title);
	        }
	        if (!f) {
	            throw new UserNotFoundException("User with ID " + userId + " not found");
	        }
	       
	        return true; 
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } 
	    
	    return false; 
	}

	
	
	
	
	/**
	 * Prompts the user to enter a keyword and searches for artworks in the database based on the keyword.
	 *
	 * @return a list of Artwork objects that match the search keyword
	 */
	
	
	
	public List<Artwork> searchArtworks() {
		
		String s=sc.nextLine();
		return searchArtworksfromdb(s);
	}


	public List<Artwork> searchArtworksfromdb(String keyword) {
	    List<Artwork> searchResults = new ArrayList<>();
	    try {
	        con = DbConnUtil.getDBConn();
	        ps = con.prepareStatement("SELECT * FROM artwork WHERE title LIKE ? OR description LIKE ?");
	        ps.setString(1, "%" + keyword + "%");
	        ps.setString(2, "%" + keyword + "%");
	        ResultSet rs = ps.executeQuery();
	        while (rs.next()) {
	            Artwork art = new Artwork();
	            art.setArtworkID(rs.getInt("artworkid"));
	            art.setTitle(rs.getString("title"));
	            art.setDescription(rs.getString("description"));
	            art.setCreationDate(rs.getString("creationdate"));
	            art.setMedium(rs.getString("medium"));
	            art.setImageUrl(rs.getString("imageurl"));
                searchResults.add(art);
	                      
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } 
	    return searchResults;
	}

	
	

	 public boolean addGallery(int galleryid, String name, String description, String location, int curator, String openingHours) {
	        try (Connection conn = DbConnUtil.getDBConn();
	             PreparedStatement ps = conn.prepareStatement("INSERT INTO Gallery (Name, Description, Location, Curator, OpeningHours) VALUES (?, ?, ?, ?, ?)")) {
	            ps.setString(1, name);
	            ps.setString(2, description);
	            ps.setString(3, location);
	            ps.setInt(4, curator);
	            ps.setString(5, openingHours);
	            int rowsInserted = ps.executeUpdate();
	            return rowsInserted > 0;
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return false;
	        }
	    }
	    public boolean updateGallery(int galleryId, String name, String description, String location, int curator, String openingHours) {
	        try (Connection conn = DbConnUtil.getDBConn();
	             PreparedStatement ps = conn.prepareStatement("UPDATE Gallery SET Name = ?, Description = ?, Location = ?, Curator = ?, OpeningHours = ? WHERE GalleryID = ?")) {
	            ps.setString(1, name);
	            ps.setString(2, description);
	            ps.setString(3, location);
	            ps.setInt(4, curator);
	            ps.setString(5, openingHours);
	            ps.setInt(6, galleryId);
	            int rowsUpdated = ps.executeUpdate();
	            return rowsUpdated > 0;
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return false;
	        }
	    }
	    public boolean removeGallery(int galleryId) {
	        String sql = "DELETE FROM Gallery WHERE GalleryID = ?";
	        try (Connection conn = DbConnUtil.getDBConn();
	             PreparedStatement pstmt = conn.prepareStatement(sql)) {
	            pstmt.setInt(1, galleryId);
	            int rowsDeleted = pstmt.executeUpdate();
	            return rowsDeleted > 0;
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return false;
	        }
	    }
	    public List<Gallery> searchGalleries(String keyword) {
	        List<Gallery> galleries = new ArrayList<>();
	        try (Connection conn = DbConnUtil.getDBConn();
	             PreparedStatement ps = conn.prepareStatement("SELECT * FROM Gallery WHERE Name LIKE ? OR Description LIKE ?")) {
	            String searchTerm = "%" + keyword + "%";
	            ps.setString(1, searchTerm);
	            ps.setString(2, searchTerm);
	            try (ResultSet rs = ps.executeQuery()) {
	                while (rs.next()) {
	                    Gallery gallery = new Gallery();
	                    gallery.setGalleryID(rs.getInt("GalleryID"));
	                    gallery.setName(rs.getString("Name"));
	                    gallery.setDescription(rs.getString("Description"));
	                    gallery.setLocation(rs.getString("Location"));
	                    gallery.setCurator(rs.getInt("Curator"));
	                    gallery.setOpeningHours(rs.getString("OpeningHours"));
	                    galleries.add(gallery);
	                }
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return galleries;
	    }





}
	  
	