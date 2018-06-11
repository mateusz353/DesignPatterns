package pl.com.ugeon.memento;

/**
 * @author Mateusz Nowakowski, Capgemini Technology Services.
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