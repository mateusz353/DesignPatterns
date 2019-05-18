package pl.com.ugeon.observer.selfimplemented.observer;

import pl.com.ugeon.observer.selfimplemented.subject.Subject;

/**
 * @author Mateusz Nowakowski.
 */
public class HexaObserver extends Observer{

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}