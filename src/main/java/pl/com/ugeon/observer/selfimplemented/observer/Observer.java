package pl.com.ugeon.observer.selfimplemented.observer;

import pl.com.ugeon.observer.selfimplemented.subject.Subject;

/**
 * @author Mateusz Nowakowski.
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}