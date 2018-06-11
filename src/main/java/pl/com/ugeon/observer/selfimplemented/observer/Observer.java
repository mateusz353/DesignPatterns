package pl.com.ugeon.observer.selfimplemented.observer;

import pl.com.ugeon.observer.selfimplemented.subject.Subject;

/**
 * @author Mateusz Nowakowski, Capgemini Technology Services.
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}