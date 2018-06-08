package pl.com.ugeon.proxy.command;

import pl.com.ugeon.proxy.command.executor.CommandExecutor;
import pl.com.ugeon.proxy.command.executor.CommandExecutorProxy;

/**
 * @author Mateusz Nowakowski, Capgemini Technology Services.
 */
public class ProxyPatternTest {

    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutorProxy("Pankaj", "wrong_pwd");
        try {
            executor.runCommand("cmd.exe /c dir");
            executor.runCommand("cmd.exe /c ls -ltr");
            executor.runCommand("cmd.exe /c  rm -rf abc.pdf");
        } catch (Exception e) {
            System.out.println("Exception Message::" + e.getMessage());
        }
    }
}