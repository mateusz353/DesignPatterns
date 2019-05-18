package pl.com.ugeon.command;

import pl.com.ugeon.command.command.CloseFileCommand;
import pl.com.ugeon.command.command.Command;
import pl.com.ugeon.command.command.FileInvoker;
import pl.com.ugeon.command.command.OpenFileCommand;
import pl.com.ugeon.command.command.WriteFileCommand;
import pl.com.ugeon.command.model.FileSystemReceiver;
import pl.com.ugeon.command.model.FileSystemReceiverUtil;

/**
 * @author Mateusz Nowakowski.
 */
public class FileSystemClient {

    public static void main(String[] args) {
        //Creating the receiver object
        FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();

        //creating command and associating with receiver
        Command openFileCommand = new OpenFileCommand(fs);

        //Creating invoker and associating with Command
        FileInvoker file = new FileInvoker(openFileCommand);

        //perform action on invoker object
        file.execute();

        Command writeFileCommand = new WriteFileCommand(fs);
        file = new FileInvoker(writeFileCommand);
        file.execute();

        Command closeFileCommand = new CloseFileCommand(fs);
        file = new FileInvoker(closeFileCommand);
        file.execute();
    }
}