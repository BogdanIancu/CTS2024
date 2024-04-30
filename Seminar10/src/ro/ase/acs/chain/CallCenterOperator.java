package ro.ase.acs.chain;

public class CallCenterOperator extends CallCenterHandler {

    public static final int OPERATOR_THRESHOLD = 100;

    @Override
    public void refund(float sum) {
        if(sum < OPERATOR_THRESHOLD) {
            System.out.println("The operator processed the refund");
        }
        else {
            if(nextHandler != null) {
                nextHandler.refund(sum);
            }
        }
    }
}
