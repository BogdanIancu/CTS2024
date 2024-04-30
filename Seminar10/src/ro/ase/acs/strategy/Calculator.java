package ro.ase.acs.strategy;

import java.util.List;

public class Calculator {
    private Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public double compute(Integer... values) throws OperationNotSetException {
        if(this.operation!=null){
            List<Integer> list = List.of(values);
            return this.operation.doOperation(list);
        }
        else{
            throw new OperationNotSetException();
        }
    }
}
