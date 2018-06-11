package pl.com.ugeon.mediator.graphic.command;

import pl.com.ugeon.mediator.graphic.mediator.Mediator;

import javax.swing.*;
import java.awt.*;

/**
 * @author Mateusz Nowakowski, Capgemini Technology Services.
 */
public class LblDisplay extends JLabel {

    Mediator med;

    public LblDisplay(Mediator m) {
        super("Just start...");
        med = m;
        med.registerDisplay(this);
        setFont(new Font("Arial", Font.BOLD, 24));
    }

}