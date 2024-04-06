package test.demo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.hexaware.dao.ImplementationVirtualArtGallery;

import com.hexaware.model.Gallery;

/**
 * Test class for Gallery management operations.
 */
public class GalleryManagementTest {

    private ImplementationVirtualArtGallery gallery;

    /**
     * Set up the test environment before each test method is run.
     */
    @Before
    public void setUp() {
        gallery = new ImplementationVirtualArtGallery();
    }

    /**
     * Tear down the test environment after each test method has run.
     */
    @After
    public void tearDown() {
        gallery = null;
    }
    
    // Add JavaDoc comments for individual test cases
    
    /**
     * Test adding a new gallery.
     */
    @Test
    public void testAddGallery() {
        boolean result = gallery.addGallery(4, "Gallery1", "Description1", "Location1", 1, "9am-5pm");
        assertTrue(result);
    }

    @Test
    public void testUpdateGallery() {
        boolean result = gallery.updateGallery(1, "Updated Gallery", "Updated Description", "Updated Location", 2, "10am-6pm");
        assertTrue(result);
    }


    @Test
    public void testSearchGalleries() {
        List<Gallery> galleries = gallery.searchGalleries("Gallery");
        assertFalse(galleries.isEmpty());
    }
    

    @Test
    public void testRemoveGallery() {
        boolean result = gallery.removeGallery(4);
        assertTrue(result);
    }

    
    
}
    
    
