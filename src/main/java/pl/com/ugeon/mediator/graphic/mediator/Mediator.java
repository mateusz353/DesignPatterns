package pl.com.ugeon.mediator.graphic.mediator;

import pl.com.ugeon.mediator.graphic.command.BtnBook;
import pl.com.ugeon.mediator.graphic.command.BtnSearch;
import pl.com.ugeon.mediator.graphic.command.BtnView;
import pl.com.ugeon.mediator.graphic.command.LblDisplay;

/**
 * @author Mateusz Nowakowski, Capgemini Technology Services.
 */
public interface Mediator {
    void book();
    void view();
    void search();
    void registerView(BtnView v);
    void registerSearch(BtnSearch s);
    void registerBook(BtnBook b);
    void registerDisplay(LblDisplay d);
}