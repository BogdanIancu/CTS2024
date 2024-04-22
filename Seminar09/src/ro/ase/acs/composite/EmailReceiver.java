package ro.ase.acs.composite;

import java.util.List;

public interface EmailReceiver {
    void receive(String email);
    void addReceiver(EmailReceiver emailReceiver);
    void deleteReceiver(EmailReceiver emailReceiver);
    List<EmailReceiver> getAllReceivers();
}
