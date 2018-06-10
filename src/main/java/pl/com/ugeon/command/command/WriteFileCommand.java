package pl.com.ugeon.command.command;

import pl.com.ugeon.command.model.FileSystemReceiver;

/**
 * @author Mateusz Nowakowski, Capgemini Technology Services.
 */
public class WriteFileCommand implements Command {

    private FileSystemReceiver fileSystem;

    public WriteFileCommand(FileSystemReceiver fs){
        this.fileSystem=fs;
    }
    @Override
    public void execute() {
        this.fileSystem.writeFile();
    }

}