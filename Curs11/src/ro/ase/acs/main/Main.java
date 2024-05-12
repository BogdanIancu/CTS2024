package ro.ase.acs.main;

import ro.ase.acs.memento.InvoiceApp;
import ro.ase.acs.memento.Product;
import ro.ase.acs.obsever.User;
import ro.ase.acs.obsever.Website;
import ro.ase.acs.state.TouristicWebsite;
import ro.ase.acs.template.AirportBoarding;
import ro.ase.acs.template.BoardingProcedure;

public class Main {
    public static void main(String[] args) {
        TouristicWebsite website = new TouristicWebsite();
        website.reserveHoliday();
        website.doBookings();

        Website web = new Website();
        User john = new User("John");
        User maria = new User("Maria");
        web.subscribe(john);
        web.subscribe(maria);
        web.subscribe(new User("George"));
        web.setProductPrice(30);
        //...
        web.setProductPrice(20);
        web.unsubscribe(maria);
        web.setProductPrice(18);

        InvoiceApp app = new InvoiceApp();
        app.setSupplier("Dertour SRL");
        app.setClient("Ion Popescu PFA");
        app.addProduct(new Product("Transport", 1, 300));
        app.addProduct(new Product("Cazare", 2, 350));
        app.issueInvoice();
        app.save();
        app.addProduct(new Product("Demipensiune", 2, 100));
        app.setClient("Maria Popescu PFA");
        app.issueInvoice();
        app.undo();
        app.issueInvoice();

        BoardingProcedure boarding = new AirportBoarding();
        boarding.executeProcedure();
    }
}
