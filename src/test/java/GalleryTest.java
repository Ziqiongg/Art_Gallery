import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GalleryTest {

    private Gallery newGallery;

    @BeforeEach
    void setup(){

        Artwork one = new Artwork("Sunshine","Carol",100);
        Artwork two = new Artwork("Upisy","Carol",200);
        Artwork three = new Artwork("Daisy","Carol",300);
        Artwork ten = new Artwork("Mao","Hellin",100);
        Artwork nine = new Artwork("Big","Hellin",700);

        newGallery = new Gallery();
        newGallery.addArtworkToGallary(one);
        newGallery.addArtworkToGallary(two);
        newGallery.addArtworkToGallary(three);
        newGallery.addArtworkToGallary(ten);
        newGallery.addArtworkToGallary(nine);
    }



    @Test
    @DisplayName("add artwork to gallery")
    void testAddArtworkToGallery(){

        assertEquals(5,newGallery.artworkList.size());
    }

    @Test
    void stocktakeMoney(){


        String sentence = newGallery.stock_take();
        assertEquals("The stock take £1400.0", sentence);
    }






}