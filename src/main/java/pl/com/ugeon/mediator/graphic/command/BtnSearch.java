package pl.com.ugeon.mediator.graphic.command;

import pl.com.ugeon.mediator.graphic.mediator.Mediator;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * @author Mateusz Nowakowski, Capgemini Technology Services.
 */
public class BtnSearch extends JButton implements Command {

    Mediator med;

    public BtnSearch(ActionListener al, Mediator m) {
        super("Search");
        addActionListener(al);
        med = m;
        med.registerSearch(this);
    }

    public void execute() {
        med.search();
    }

}