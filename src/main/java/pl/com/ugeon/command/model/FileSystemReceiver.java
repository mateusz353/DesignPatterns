package pl.com.ugeon.command.model;

/**
 * @author Mateusz Nowakowski.
 */
public interface FileSystemReceiver {

    void openFile();
    void writeFile();
    void closeFile();
}