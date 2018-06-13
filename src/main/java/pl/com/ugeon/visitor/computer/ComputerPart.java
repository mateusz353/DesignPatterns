package pl.com.ugeon.visitor.computer;

import pl.com.ugeon.visitor.visitor.ComputerPartVisitor;

/**
 * @author Mateusz Nowakowski, Capgemini Technology Services.
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}