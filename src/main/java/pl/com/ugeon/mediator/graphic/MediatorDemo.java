package pl.com.ugeon.mediator.graphic;

import pl.com.ugeon.mediator.graphic.command.BtnBook;
import pl.com.ugeon.mediator.graphic.command.BtnSearch;
import pl.com.ugeon.mediator.graphic.command.BtnView;
import pl.com.ugeon.mediator.graphic.command.Command;
import pl.com.ugeon.mediator.graphic.command.LblDisplay;
import pl.com.ugeon.mediator.graphic.mediator.Mediator;
import pl.com.ugeon.mediator.graphic.mediator.ParticipantMediator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Mateusz Nowakowski, Capgemini Technology Services.
 */
public class MediatorDemo extends JFrame implements ActionListener {

    Mediator med = new ParticipantMediator();

    MediatorDemo() {
        JPanel p = new JPanel();
        p.add(new BtnView(this, med));
        p.add(new BtnBook(this, med));
        p.add(new BtnSearch(this, med));
        getContentPane().add(new LblDisplay(med), "North");
        getContentPane().add(p, "South");
        setSize(400, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        Command comd = (Command) ae.getSource();
        comd.execute();
    }

    public static void main(String[] args) {
        new MediatorDemo();
    }

}