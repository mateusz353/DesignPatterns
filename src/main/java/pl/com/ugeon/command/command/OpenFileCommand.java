package pl.com.ugeon.command.command;

import pl.com.ugeon.command.model.FileSystemReceiver;

/**
 * @author Mateusz Nowakowski, Capgemini Technology Services.
 */
public class OpenFileCommand implements Command {

    private FileSystemReceiver fileSystem;

    public OpenFileCommand(FileSystemReceiver fs){
        this.fileSystem=fs;
    }
    @Override
    public void execute() {
        //open command is forwarding request to openFile method
        this.fileSystem.openFile();
    }

}