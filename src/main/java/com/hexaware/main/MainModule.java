package com.hexaware.main;
import java.util.List;


import java.util.Scanner;

import com.hexaware.dao.*;
import com.hexaware.exception.ArtWorkNotFoundException;
import com.hexaware.exception.UserNotFoundException;
import com.hexaware.model.Artwork;


/**
 * MainModule class for managing the virtual art gallery system.
 */

public class MainModule {
	
	 /**
     * Main method to run the virtual art gallery system.
     * @param args the command line arguments
     * @throws ArtWorkNotFoundException if an artwork is not found
     */
	
	public static void main(String[] args) throws ArtWorkNotFoundException {
		IVirtualArtGallery ag = new ImplementationVirtualArtGallery();
		Artwork art=new Artwork();
		Scanner sc = new Scanner(System.in);
		String ch = null;
		do {

			System.out.println("Enter your choice:");
			System.out.println("1. Create Artwork");
			System.out.println("2. Update Artwork");
			System.out.println("3. Remove Artwork");
			System.out.println("4. View Artwork By ID");
			System.out.println("5. Add to Favourites");
			System.out.println("6. Delete from Favourites");
			System.out.println("7. Get User Favourite Artwork");
			System.out.println("8. Search Artwork");
			

			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				ag.addartwork(art);
	
				
					break;
			}
			case 2: {
				ag.updateartwork(art);
				
				break;
			}
			case 3: {
				ag.removeartwork();
				break;
		}
			case 4: {
			
				 ag.getartworkbyid();
				    break;
			}
			case 5: {
					ag.addArtworkToFavourite();
				break;
			}
			case 6: {
				    ag.removeArtworkFromFavorite();		
			break;
		}
			
			case 7: {
			    try {
					ag.getUserFavoriteArtworks();
				} catch (UserNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}		
		   break;
     	}
			
			case 8:{
				System.out.println("Enter keyword to search artworks:");
            String keyword = sc.next();
            List<Artwork> searchResults = ag.searchArtworks();
            if (!searchResults.isEmpty()) {
                System.out.println("Search Results:");
                for (Artwork artwork : searchResults) {
                    System.out.println(artwork); 
                }
            } else {
                System.out.println("No artworks found matching the keyword.");
            }
            break;

			}
			
			
			
			default: {
				System.out.println("Enter the right choice. ");
			}
			}
			System.out.println("Do you want to continue? Y or y");
			ch = sc.next();
		} while (ch.equals("Y") || ch.equals("y"));
		System.out.println("Thanks for using our system !!!");
		System.exit(0);
	}
}
	


