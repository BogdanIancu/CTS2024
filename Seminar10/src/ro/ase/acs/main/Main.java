package ro.ase.acs.main;

import ro.ase.acs.chain.CallCenterHandler;
import ro.ase.acs.chain.CallCenterManager;
import ro.ase.acs.chain.CallCenterOfficer;
import ro.ase.acs.chain.CallCenterOperator;
import ro.ase.acs.decorator.Car;
import ro.ase.acs.decorator.CarWithAlarm;
import ro.ase.acs.decorator.CarWithSportSeats;
import ro.ase.acs.decorator.Vehicle;
import ro.ase.acs.strategy.*;

public class Main {
    public static void main(String[] args) {

        Vehicle car = new Car();
        car.start();
        CarWithAlarm carWithAlarm = new CarWithAlarm(car);
        carWithAlarm.activateAlarm();

        CarWithSportSeats carWithSportSeatsAndAlarm =
                new CarWithSportSeats(carWithAlarm);
        carWithSportSeatsAndAlarm.setSeatProducer("Recaro");
        System.out.println(carWithSportSeatsAndAlarm.getSeatProducer());
        carWithSportSeatsAndAlarm.stop();

        CallCenterHandler operator = new CallCenterOperator();
        CallCenterHandler officer = new CallCenterOfficer();
        CallCenterHandler manager = new CallCenterManager();
        operator.setNextHandler(officer);
        officer.setNextHandler(manager);
        operator.refund(200);
        operator.refund(700);
        operator.refund(90);

        Calculator calculator = new Calculator();
        Operation operation = new SumOperation();
        calculator.setOperation(operation);
        operation=new ProductOperation();
        calculator.setOperation(operation);
        calculator.setOperation(l->{
            double result=l.get(0);
            for(int i=1;i<l.size();i++){
                result = Math.pow(result, l.get(i));
            }
            return result;
        });
        try {
            System.out.println(calculator.compute(1, 23, 4, 5));
        } catch (OperationNotSetException e) {
            throw new RuntimeException(e);
        }
    }
}
