package pl.com.ugeon.mediator.graphic.command;

import pl.com.ugeon.mediator.graphic.mediator.Mediator;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * @author Mateusz Nowakowski.
 */
public class BtnView extends JButton implements Command {

    Mediator med;

    public BtnView(ActionListener al, Mediator m) {
        super("View");
        addActionListener(al);
        med = m;
        med.registerView(this);
    }

    public void execute() {
        med.view();
    }

}