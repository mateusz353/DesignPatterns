package pl.com.ugeon.adapter;

import pl.com.ugeon.adapter.adapter.GermanToUKAdapter;
import pl.com.ugeon.adapter.german.GermanPlugConnector;
import pl.com.ugeon.adapter.german.GermanPlugConnectorImpl;
import pl.com.ugeon.adapter.uk.UKElectricalSocket;
import pl.com.ugeon.adapter.uk.UKPlugConnector;

/**
 * @author Mateusz Nowakowski, Capgemini Technology Services.
 */
public class AdapterTest {

    public static void main( String[] args ){
        GermanPlugConnector plugConnector = new GermanPlugConnectorImpl();
        UKElectricalSocket electricalSocket = new UKElectricalSocket();
        UKPlugConnector ukAdapter = new GermanToUKAdapter(plugConnector);
        electricalSocket.plugIn(ukAdapter);
    }
}