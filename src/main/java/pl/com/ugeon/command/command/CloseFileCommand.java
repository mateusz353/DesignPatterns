package pl.com.ugeon.command.command;

import pl.com.ugeon.command.model.FileSystemReceiver;

/**
 * @author Mateusz Nowakowski.
 */
public class CloseFileCommand implements Command {

    private FileSystemReceiver fileSystem;

    public CloseFileCommand(FileSystemReceiver fs){
        this.fileSystem=fs;
    }
    @Override
    public void execute() {
        this.fileSystem.closeFile();
    }

}