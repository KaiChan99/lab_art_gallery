package art;

import java.util.ArrayList;

public class Gallery {
    private ArrayList<Artwork> artworks;
    private String galleryName;
    private float till;




    public Gallery(String galleryName, float till){
        this.artworks = new ArrayList<>();
        this.galleryName = galleryName;
        this.till = 0;

    }

//    public void payGallery() {
//        if(Customer.getWallet() > artworks.getPrice()) {
//            Customer.getWallet() -= artworks.getPrice();
//            till += artworks.getPrice();
//        } else {
//            System.out.println("You are broke!");
//        }
//    }
}

