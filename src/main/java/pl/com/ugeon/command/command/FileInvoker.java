package pl.com.ugeon.command.command;

/**
 * @author Mateusz Nowakowski, Capgemini Technology Services.
 */
public class FileInvoker {

    public Command command;

    public FileInvoker(Command c){
        this.command=c;
    }

    public void execute(){
        this.command.execute();
    }
}