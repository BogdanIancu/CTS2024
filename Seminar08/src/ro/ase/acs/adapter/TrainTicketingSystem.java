package ro.ase.acs.adapter;

public class TrainTicketingSystem implements AbstractTrainTicketingSystem {
    private int numberOfWagons = 5;
    private int numberOfSeatsPerWagons = 100;

    @Override
    public void buyTicket(int wagonNo, int seatNo){
        boolean isWagonValid = wagonNo >= 1 && wagonNo <= numberOfWagons;
        boolean isSeatValid = seatNo >=1 && seatNo <= numberOfSeatsPerWagons;
        if (isWagonValid && isSeatValid){
            System.out.println("Ticket issued for wagon " +
                   wagonNo + " and seat " + seatNo);
        }
    }
}
