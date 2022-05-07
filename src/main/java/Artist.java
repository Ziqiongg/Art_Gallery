import java.util.ArrayList;

public class Artist extends Gallery {
    private String artistName;
    private ArrayList<Artwork> myartwork;

    public void getMyArtwork(){
        super.artworkList.forEach(artwork -> {
            if (artwork.getArtist().equals(artistName)){
                myartwork.add(artwork);
            }
        });
        System.out.println("That's all masterpieces from " + artistName);
    }




}
