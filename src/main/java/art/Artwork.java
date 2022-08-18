package art;

public class Artwork{

    private String title;
    private Artist artist;
    private float price;
    private int nft;

    public Artwork(String title, Artist artist, float price, int nft){

        this.title = title;
        this.artist = artist;
        this.price = price;
        this.nft = nft;

    }

    public Artist getArtist() {
        return artist;
    }


    public String getTitle(){
        return title;
    }


    public float getPrice() {

        return price;
    }

    public int getNft() {
        return nft;
    }

    //    title, an artist, a price and an nft.,

}
