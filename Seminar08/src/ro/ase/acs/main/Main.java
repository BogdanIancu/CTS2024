package ro.ase.acs.main;

import ro.ase.acs.adapter.*;
import ro.ase.acs.facade.CarFacade;
import ro.ase.acs.proxy.AbstractAuthenticationService;
import ro.ase.acs.proxy.AuthenticationService;
import ro.ase.acs.proxy.AuthenticationServiceProxy;

public class Main {
    public static void main(String[] args) {
        CarFacade carFacade = new CarFacade();
        carFacade.start();
        carFacade.emergencyBrake();
        carFacade.park();

        AbstractTrainTicketingSystem trainTicketingSystem = new TrainTicketingSystem();
        trainTicketingSystem.buyTicket(3, 34);
        AbstractBusTicketingSystem busTicketingSystem = new BusTicketingSystem();
        busTicketingSystem.reservedSeat();

        trainTicketingSystem = new BusToTrainObjectAdapter(
                busTicketingSystem);
        trainTicketingSystem.buyTicket(2, 56);

        trainTicketingSystem = new BusToTrainClassAdapter();
        trainTicketingSystem.buyTicket(1, 85);

        AbstractAuthenticationService authenticationService = new AuthenticationService();
        AbstractAuthenticationService authenticationServiceProxy =
                new AuthenticationServiceProxy(authenticationService);

        boolean loggedIn = authenticationService.login("admin", "admin");
        System.out.println(loggedIn);

        for (int i = 0; i < 5; i++) {
            authenticationServiceProxy.login("wrong username", "wrong pass");
        }

        loggedIn = authenticationServiceProxy.login("admin", "admin");
        System.out.println(loggedIn);
    }

}
