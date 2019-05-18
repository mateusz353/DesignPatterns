package pl.com.ugeon.templatemethod;

import pl.com.ugeon.templatemethod.game.Cricket;
import pl.com.ugeon.templatemethod.game.Football;
import pl.com.ugeon.templatemethod.game.Game;

/**
 * @author Mateusz Nowakowski.
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}