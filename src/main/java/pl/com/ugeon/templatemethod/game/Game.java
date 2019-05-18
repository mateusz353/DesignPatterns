package pl.com.ugeon.templatemethod.game;

/**
 * @author Mateusz Nowakowski.
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //template method - connot override it by use final modificator
    public final void play(){

        //initialize the game
        initialize();

        //start game
        startPlay();

        //end game
        endPlay();
    }
}