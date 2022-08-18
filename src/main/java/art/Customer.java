package art;

public class Customer {

  private String CustomerName;

  private float wallet;

    public Customer(String CustomerName, float wallet){
        this.CustomerName = CustomerName;
        this.wallet = wallet;

    }

    public String getCustomerName(){
        return CustomerName;
    }

    public float getWallet(){
        return wallet;
    }

    public void setWallet(){
        this.wallet = wallet;
    }


}
