package ro.ase.acs.memento;

public class InvoiceApp {
    private Invoice invoice = new Invoice("", "");
    private HistoryManager historyManager = new HistoryManager();

    public void setClient(String client) {
        invoice.setClient(client);
    }

    public void setSupplier(String supplier) {
        invoice.setSupplier(supplier);
    }

    public void addProduct(Product product) {
        invoice.getProducts().add(product);
    }

    public void issueInvoice() {
        System.out.println("----------------------------------");
        System.out.println("Supplier: " + invoice.getSupplier());
        System.out.println("Client: " + invoice.getClient());
        System.out.println("Product   Quantity   Price");
        for(Product p : invoice.getProducts()) {
            System.out.println(p.name + " " + p.quantity + " " + p.price);
        }
        System.out.println("Total: " + invoice.getTotalValue(19));
    }

    public void save() {
        historyManager.saveState(invoice);
    }

    public void undo() {
        invoice = historyManager.restoreState();
    }
}
