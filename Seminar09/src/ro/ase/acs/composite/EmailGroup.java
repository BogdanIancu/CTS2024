package ro.ase.acs.composite;

import java.util.ArrayList;
import java.util.List;

public class EmailGroup implements EmailReceiver {
    private List<EmailReceiver> receivers = new ArrayList<>();

    @Override
    public void receive(String email) {
        for (EmailReceiver receiver : receivers) {
            receiver.receive(email);
        }
    }

    @Override
    public void addReceiver(EmailReceiver emailReceiver) {
        receivers.add(emailReceiver);
    }

    @Override
    public void deleteReceiver(EmailReceiver emailReceiver) {
        receivers.remove(emailReceiver);
    }

    @Override
    public List<EmailReceiver> getAllReceivers() {
        return List.copyOf(receivers);
    }
}
