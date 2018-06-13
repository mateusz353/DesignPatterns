package pl.com.ugeon.visitor.computer;

import pl.com.ugeon.visitor.visitor.ComputerPartVisitor;

/**
 * @author Mateusz Nowakowski, Capgemini Technology Services.
 */
public class Mouse implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}