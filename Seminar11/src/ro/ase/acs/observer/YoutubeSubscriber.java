package ro.ase.acs.observer;

public class YoutubeSubscriber implements Observer {
    @Override
    public void receiveNotification(String message) {
        System.out.println(message);
    }
}
