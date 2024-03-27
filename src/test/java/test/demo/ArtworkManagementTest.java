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

    @Test
   public void testAddArtwork() {
        Artwork artwork = new Artwork(4, "Test", "Description","2022-01-01", "english", "image.jpg");
        assertTrue(gallery.addartwork(artwork));
    }

    /*@Test
    public void testUpdateArtwork() {
        Artwork artwork = new Artwork(2, "Updated", "UDescription", "2022-01-01", "emglish", "updated_image.jpg");
        assertTrue(gallery.addartwork(artwork));
    }

    @Test
    public void testRemoveArtwork() throws ArtWorkNotFoundException {
        assertTrue(gallery.removeartworkbydb(4));
    }*/

    @Test
    public void testSearchArtworks() {
        List<Artwork> searchResults = gallery.searchArtworksfromdb("by");
        assertFalse(searchResults.isEmpty());
    }
    
    
   /* @Test
   public void testAddGallery() {
       
    	assertTrue(gallery.addGallery(6,"abc", "abv", "NY", 1, "9:30-10:30"));
    }

    @Test
    public void testUpdateGallery() {
       
        assertTrue(gallery.updateGallery(3, "yxy", "abc", "ehue", 1, "9:30-12:30"));
    }

    @Test
    public void testRemoveGallery() {
        
        
        assertTrue(gallery.removeGallery(4));
    }

    @Test
    public void testSearchGalleries() {
        // Test searching galleries
        // Assuming method signature is similar to searchArtworks() in VirtualArtGalleryImpl
        List<Gallery> searchResults = gallery.searchGalleries("Test");
        assertFalse(searchResults.isEmpty());
    }*/

}
