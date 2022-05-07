import java.util.ArrayList;

public class Gallery{

    private String galleryName = "Van Gogh";
    private double till = 0.0;
    protected ArrayList<Artwork> artworkList = new ArrayList<>();


    public void addArtworkToGallary(Artwork artwork){
        artworkList.add(artwork);
    }

    public void deleteArtworkToGallay(Artwork artwork){
        artworkList.remove(artwork);
    }

    public double addMoneyToTill(double price){
        return till+= price;
    }

    public String stock_take(){
        double totalValue = 0;
        for (Artwork artwork : artworkList) {
           totalValue += artwork.getPrice();
        }
        return "The stock take £" + totalValue;

    }







}
