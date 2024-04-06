package test.demo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.hexaware.dao.ImplementationVirtualArtGallery;
import com.hexaware.model.Artwork;
import com.hexaware.model.Gallery;
import com.hexaware.exception.ArtWorkNotFoundException;
import com.hexaware.exception.UserNotFoundException;

public class ArtworkManagementTest {

    private ImplementationVirtualArtGallery gallery;

    @Before
    public void setUp() {
        gallery = new ImplementationVirtualArtGallery();
    }

    @After
    public void tearDown() {
        gallery = null;
    }

   /* @Test
   public void testAddArtwork() {
        Artwork artwork = new Artwork(7, "Test5", "Descripn5","2022-01-01", "englh", "imge.jpg5");
        assertTrue(gallery.addartwork(artwork));
    }*/

    @Test
    public void testUpdateArtwork() throws ArtWorkNotFoundException {
        Artwork artwork = new Artwork(4, "Updated Title", "Updated Description", "2022-01-01", "Updated Medium", "updated_image.jpg");
        assertTrue(gallery.updateartwork(artwork));
    }

  
   
    

    public void testSearchArtworks() {
        List<Artwork> searchResults = gallery.searchArtworks("by");
        assertFalse(searchResults.isEmpty());
    }
   /* @Test
    public void testRemoveArtwork() throws ArtWorkNotFoundException {
        assertTrue(gallery.removeartworkbydb(7));
    }*/

    
    
    
    
}