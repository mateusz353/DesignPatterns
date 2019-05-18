package pl.com.ugeon.facade;

import pl.com.ugeon.facade.travel.BookingInfo;
import pl.com.ugeon.facade.travel.TravelFacade;

/**
 * @author Mateusz Nowakowski.
 */
public class TravelFacadeDemo {
    public static void main( String[] args ){
        TravelFacade facade = new TravelFacade();
        facade.book(TravelFacade.BookingType.Flight,new BookingInfo());
    }
}