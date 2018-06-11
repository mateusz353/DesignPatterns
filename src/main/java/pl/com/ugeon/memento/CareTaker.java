package pl.com.ugeon.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mateusz Nowakowski, Capgemini Technology Services.
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}