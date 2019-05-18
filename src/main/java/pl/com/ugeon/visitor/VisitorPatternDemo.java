package pl.com.ugeon.visitor;

import pl.com.ugeon.visitor.computer.Computer;
import pl.com.ugeon.visitor.computer.ComputerPart;
import pl.com.ugeon.visitor.visitor.ComputerPartDisplayVisitor;

/**
 * @author Mateusz Nowakowski.
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}