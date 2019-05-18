package pl.com.ugeon.observer.selfimplemented;

import pl.com.ugeon.observer.selfimplemented.observer.BinaryObserver;
import pl.com.ugeon.observer.selfimplemented.observer.HexaObserver;
import pl.com.ugeon.observer.selfimplemented.observer.OctalObserver;
import pl.com.ugeon.observer.selfimplemented.subject.Subject;

/**
 * @author Mateusz Nowakowski.
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}