package ro.ase.acs.chain;

public class CallCenterOfficer extends CallCenterHandler {

    public static final int OFFICER_THRESHOLD = 500;

    @Override
    public void refund(float sum) {
        if(sum < OFFICER_THRESHOLD) {
            System.out.println("The officer processed the refund");
        }
        else {
            if(nextHandler != null) {
                nextHandler.refund(sum);
            }
        }
    }
}
