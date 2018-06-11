package pl.com.ugeon.mediator.graphic.command;

import pl.com.ugeon.mediator.graphic.mediator.Mediator;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * @author Mateusz Nowakowski, Capgemini Technology Services.
 */
public class BtnBook extends JButton implements Command {

    Mediator med;

    public BtnBook(ActionListener al, Mediator m) {
        super("Book");
        addActionListener(al);
        med = m;
        med.registerBook(this);
    }

    public void execute() {
        med.book();
    }

}