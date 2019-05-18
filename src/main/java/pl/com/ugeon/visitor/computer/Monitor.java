package pl.com.ugeon.visitor.computer;

import pl.com.ugeon.visitor.visitor.ComputerPartVisitor;

/**
 * @author Mateusz Nowakowski.
 */
public class Monitor implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}