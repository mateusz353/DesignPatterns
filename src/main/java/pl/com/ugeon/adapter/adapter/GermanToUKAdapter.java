package pl.com.ugeon.adapter.adapter;

import pl.com.ugeon.adapter.german.GermanPlugConnector;
import pl.com.ugeon.adapter.uk.UKPlugConnector;

/**
 * @author Mateusz Nowakowski.
 */
public class GermanToUKAdapter implements UKPlugConnector {

    private GermanPlugConnector plug;

    public GermanToUKAdapter(GermanPlugConnector plug) {
        this.plug = plug;
    }

    @Override
    public void provideElectricity() {
        plug.giveElectricity();
    }
}