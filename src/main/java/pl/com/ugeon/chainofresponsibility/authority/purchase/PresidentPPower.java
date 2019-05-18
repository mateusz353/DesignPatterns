package pl.com.ugeon.chainofresponsibility.authority.purchase;

/**
 * @author Mateusz Nowakowski.
 */
public class PresidentPPower extends PurchasePower {

    protected double getAllowable() {
        return BASE * 60;
    }

    protected String getRole() {
        return "President";
    }
}