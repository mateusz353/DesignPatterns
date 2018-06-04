package pl.com.ugeon.adapter.german;

/**
 * @author Mateusz Nowakowski, Capgemini Technology Services.
 */
public class GermanPlugConnectorImpl implements GermanPlugConnector {
    @Override
    public void giveElectricity() {
        System.out.println("240V");
    }
}