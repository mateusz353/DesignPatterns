package pl.com.ugeon.proxy.command.executor;

/**
 * @author Mateusz Nowakowski.
 */
public interface CommandExecutor {

    public void runCommand(String cmd) throws Exception;
}