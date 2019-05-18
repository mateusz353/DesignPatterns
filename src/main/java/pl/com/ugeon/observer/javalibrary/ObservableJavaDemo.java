package pl.com.ugeon.observer.javalibrary;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Mateusz Nowakowski.
 */
public class ObservableJavaDemo {

    public static void main(String[] args) {
        System.out.println("Enter Text: ");
        EventSource eventSource = new EventSource();

        eventSource.addObserver(new Observer() {
            public void update(Observable obj, Object arg) {
                System.out.println("Received response: " + arg);
            }
        });

        new Thread(eventSource).start();
    }
}