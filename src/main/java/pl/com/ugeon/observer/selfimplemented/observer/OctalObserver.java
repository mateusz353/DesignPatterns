package pl.com.ugeon.observer.selfimplemented.observer;

import pl.com.ugeon.observer.selfimplemented.subject.Subject;

/**
 * @author Mateusz Nowakowski, Capgemini Technology Services.
 */
public class OctalObserver extends Observer{

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) );
    }
}