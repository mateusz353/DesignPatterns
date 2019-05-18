package pl.com.ugeon.memento;

/**
 * @author Mateusz Nowakowski.
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}