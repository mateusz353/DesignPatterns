package pl.com.ugeon.nullobject.customer;

/**
 * @author Mateusz Nowakowski, Capgemini Technology Services.
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}