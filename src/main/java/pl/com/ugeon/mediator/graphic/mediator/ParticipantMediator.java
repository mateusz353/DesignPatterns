package pl.com.ugeon.mediator.graphic.mediator;

import pl.com.ugeon.mediator.graphic.command.BtnBook;
import pl.com.ugeon.mediator.graphic.command.BtnSearch;
import pl.com.ugeon.mediator.graphic.command.BtnView;
import pl.com.ugeon.mediator.graphic.command.LblDisplay;

/**
 * @author Mateusz Nowakowski, Capgemini Technology Services.
 */
public class ParticipantMediator implements Mediator {

    BtnView btnView;
    BtnSearch btnSearch;
    BtnBook btnBook;
    LblDisplay show;

    //....
    public void registerView(BtnView v) {
        btnView = v;
    }

    public void registerSearch(BtnSearch s) {
        btnSearch = s;
    }

    public void registerBook(BtnBook b) {
        btnBook = b;
    }

    public void registerDisplay(LblDisplay d) {
        show = d;
    }

    public void book() {
        btnBook.setEnabled(false);
        btnView.setEnabled(true);
        btnSearch.setEnabled(true);
        show.setText("booking...");
    }

    public void view() {
        btnView.setEnabled(false);
        btnSearch.setEnabled(true);
        btnBook.setEnabled(true);
        show.setText("viewing...");
    }

    public void search() {
        btnSearch.setEnabled(false);
        btnView.setEnabled(true);
        btnBook.setEnabled(true);
        show.setText("searching...");
    }

}