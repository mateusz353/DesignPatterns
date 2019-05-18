package pl.com.ugeon.adapter.german;

/**
 * @author Mateusz Nowakowski.
 */
public class GermanPlugConnectorImpl implements GermanPlugConnector {
    @Override
    public void giveElectricity() {
        System.out.println("240V");
    }
}