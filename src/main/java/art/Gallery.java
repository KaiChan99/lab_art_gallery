package art;

import java.util.ArrayList;

public class Gallery {
    private ArrayList<Artwork> artwork;
    private String galleryName;
    private float till;




    public Gallery(String galleryName, float till){
        this.artwork = new ArrayList<>();
        this.galleryName = galleryName;
        this.till = 0;

    }



    public void payGallery() {
        if(Customer.getWallet() > artwork.getPrice()) {
            Customer.getWallet() -= artwork.getPrice();
            till += artwork.getPrice();
        } else {
            System.out.println("You are broke!");
        }
    }

}

