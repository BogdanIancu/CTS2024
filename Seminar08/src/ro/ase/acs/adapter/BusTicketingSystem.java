package ro.ase.acs.adapter;

public class BusTicketingSystem implements AbstractBusTicketingSystem {
    private int numberOfSeats = 50;
    private int numberOfReservedSeats = 0;

    @Override
    public void reservedSeat(){
        if(numberOfReservedSeats < numberOfSeats){
            numberOfReservedSeats++;
            System.out.println("Seat reserved");
        } else {
            System.out.println("The bus is full");
        }
    }
}
