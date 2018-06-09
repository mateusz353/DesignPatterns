package pl.com.ugeon.chainofresponsibility.logger.logger;

/**
 * @author Mateusz Nowakowski, Capgemini Technology Services.
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}