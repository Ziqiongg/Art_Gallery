public class Artwork {

    private String title;
    private String artist;
    private double price;

    public Artwork(String title, String artist, double price) {
        this.title = title;
        this.artist = artist;
        this.price = price;
    }



    //getter and setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
