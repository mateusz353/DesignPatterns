package pl.com.ugeon.command.model;

/**
 * @author Mateusz Nowakowski, Capgemini Technology Services.
 */
public interface FileSystemReceiver {

    void openFile();
    void writeFile();
    void closeFile();
}