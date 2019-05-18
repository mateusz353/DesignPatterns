package pl.com.ugeon.chainofresponsibility.logger.logger;

/**
 * @author Mateusz Nowakowski.
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}