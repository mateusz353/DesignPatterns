package pl.com.ugeon.visitor.visitor;

import pl.com.ugeon.visitor.computer.Computer;
import pl.com.ugeon.visitor.computer.Keyboard;
import pl.com.ugeon.visitor.computer.Monitor;
import pl.com.ugeon.visitor.computer.Mouse;

/**
 * @author Mateusz Nowakowski.
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
}