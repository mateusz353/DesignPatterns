package pl.com.ugeon.visitor.visitor;

import pl.com.ugeon.visitor.computer.Computer;
import pl.com.ugeon.visitor.computer.Keyboard;
import pl.com.ugeon.visitor.computer.Monitor;
import pl.com.ugeon.visitor.computer.Mouse;

/**
 * @author Mateusz Nowakowski, Capgemini Technology Services.
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}