package ro.ase.acs.composite;

import java.util.List;

public class EmailAddress implements EmailReceiver{
    private String address;

    public EmailAddress(String address) {
        this.address = address;
    }

    @Override
    public void receive(String email) {
        System.out.println(address + ": " + email);
    }

    @Override
    public void addReceiver(EmailReceiver emailReceiver) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteReceiver(EmailReceiver emailReceiver) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<EmailReceiver> getAllReceivers() {
        throw new UnsupportedOperationException();
    }
}
