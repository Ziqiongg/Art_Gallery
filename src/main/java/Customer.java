import java.util.ArrayList;

public class Customer extends Gallery {

    private String customerName;
    private double customerWallet;
    private ArrayList<Artwork> customerList = new ArrayList<>();

    public Customer(String customerName, double customerWallet) {
        this.customerName = customerName;
        this.customerWallet = customerWallet;
    }


    void addIBuy(Artwork artwork){
        customerList.add(artwork);
    }

     void removeMoney(Artwork artwork){
        customerWallet -= artwork.getPrice();
    }


    public String purchase(Artwork artwork){
        if (artwork.getPrice() <= this.customerWallet){
            addIBuy(artwork);
            removeMoney(artwork);
            super.addMoneyToTill(artwork.getPrice());
            super.deleteArtworkToGallay(artwork);
            return "Purchased successfully";
        } else {
            return "Maybe next time!";
        }

    }







    //getter and setter
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getCustomerWallet() {
        return customerWallet;
    }

    public void setCustomerWallet(double customerWallet) {
        this.customerWallet = customerWallet;
    }

    public ArrayList<Artwork> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Artwork> customerList) {
        this.customerList = customerList;
    }
}
