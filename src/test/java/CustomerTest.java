import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void purchaseArtwork(){
        Artwork one = new Artwork("Sunshine","Carol",100);
        Artwork two = new Artwork("Upisy","Carol",200);
        Artwork three = new Artwork("Daisy","Carol",300);
        Artwork ten = new Artwork("Mao","Hellin",100);
        Artwork nine = new Artwork("Big","Hellin",700);
        Gallery newGallery = new Gallery();
        newGallery.addArtworkToGallary(one);
        newGallery.addArtworkToGallary(two);
        newGallery.addArtworkToGallary(three);
        newGallery.addArtworkToGallary(ten);
        newGallery.addArtworkToGallary(nine);

        Customer newCustomer = new Customer("KK", 2900);
        assertEquals("Purchased successfully",newCustomer.purchase(one));




    }

}