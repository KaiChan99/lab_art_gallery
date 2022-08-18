package art;

public class Artwork{

    private String title;
    private Artist artist;
    private float price;
    private int NFT;

    public Artwork(String title, Artist artist, float price, int NFT){

        this.title = title;
        this.artist = artist;
        this.price = price;
        this.NFT = NFT;

    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public float getPrice() {
       return price;
    }

    public void setPrice() {
        this.price = price;
    }



//    title, an artist, a price and an nft.,

}
