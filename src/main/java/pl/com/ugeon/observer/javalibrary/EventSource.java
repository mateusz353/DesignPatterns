package pl.com.ugeon.observer.javalibrary;

import java.util.Observable;
import java.util.Scanner;

/**
 * @author Mateusz Nowakowski.
 */
class EventSource extends Observable implements Runnable {
    public void run() {
        while (true) {
            String response = new Scanner(System.in).next();
            setChanged();
            notifyObservers(response);
        }
    }
}