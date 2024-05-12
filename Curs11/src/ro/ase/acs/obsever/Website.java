package ro.ase.acs.obsever;

public class Website extends Observable {
    private double productPrice;

    public void setProductPrice(double productPrice) {
        if(productPrice <  this.productPrice) {
            sendNotification("The product price just decreased");
        }
        this.productPrice = productPrice;
    }
}
