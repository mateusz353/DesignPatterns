package pl.com.ugeon.mediator.chat.mediator;

import pl.com.ugeon.mediator.chat.user.User;

/**
 * @author Mateusz Nowakowski.
 */
public interface ChatMediator {

    public void sendMessage(String msg, User user);

    void addUser(User user);
}
