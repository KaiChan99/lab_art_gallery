import art.Customer;
import art.Artist;
import art.Artwork;
import art.Gallery;

public class App {

    public static void main(String[] args) {
       //A Customer should be able to buy an Artwork
       // from the Gallery, reducing the money in their wallet
       //and increasing the money in the Gallery till.
       Customer customer1 = new Customer("Bob", 2000);
       Artist artist1 = new Artist("Anna");
       Artwork artwork1 = new Artwork("Heaven", artist1,100,1);
       Gallery gallery1 = new Gallery("London Museum", 0);

        System.out.println(customer1);
        System.out.println(artist1);
        System.out.println(artwork1);
        System.out.println(gallery1);

    }



}
