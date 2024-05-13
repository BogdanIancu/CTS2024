package ro.ase.acs.main;

import ro.ase.acs.command.*;
import ro.ase.acs.memento.VideoEditor;
import ro.ase.acs.observer.YoutubeChannel;
import ro.ase.acs.observer.YoutubeSubscriber;
import ro.ase.acs.state.VendingMachine;
import ro.ase.acs.template.PartMover;
import ro.ase.acs.template.RoboticArm;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.insertMoney(10);
        vendingMachine.selectProduct(7);

        Chef chef = new Chef();
        Waiter waiter = new Waiter();
        FoodOrder pizzaOrder = new PizzaOrder(chef);
        FoodOrder burgerOrder = new BurgerOrder(chef);
        waiter.addOrder(pizzaOrder);
        waiter.addOrder(burgerOrder);
        waiter.sendOrdersToKitchen();

        YoutubeChannel youtubeChannel = new YoutubeChannel("Recorder");
        YoutubeSubscriber subscriber1 = new YoutubeSubscriber();
        youtubeChannel.subscribe(subscriber1);
        YoutubeSubscriber subscriber2 = new YoutubeSubscriber();
        youtubeChannel.subscribe(subscriber2);
        youtubeChannel.uploadVideo("Cartelul din Carpati");
        youtubeChannel.unsubscribe(subscriber2);
        youtubeChannel.uploadVideo("Marele Alb");

        VideoEditor videoEditor = new VideoEditor();
        System.out.println(videoEditor);
        videoEditor.edit(5);
        videoEditor.save();
        System.out.println(videoEditor);
        videoEditor.edit(3);
        System.out.println(videoEditor);
        videoEditor.undo();
        System.out.println(videoEditor);

        PartMover partMover = new RoboticArm();
        partMover.move();
    }
}
