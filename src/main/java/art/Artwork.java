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

    public float getPrice() {
        return price;
    }

//    title, an artist, a price and an nft.,

}
