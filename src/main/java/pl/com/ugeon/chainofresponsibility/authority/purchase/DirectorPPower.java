package pl.com.ugeon.chainofresponsibility.authority.purchase;

/**
 * @author Mateusz Nowakowski.
 */
public class DirectorPPower extends PurchasePower {

    protected double getAllowable() {
        return BASE * 20;
    }

    protected String getRole() {
        return "Director";
    }

}