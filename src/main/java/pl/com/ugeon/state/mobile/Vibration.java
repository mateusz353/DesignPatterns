package pl.com.ugeon.state.mobile;

/**
 * @author Mateusz Nowakowski.
 */
public class Vibration implements MobileAlertState
{
    @Override
    public void alert(AlertStateContext ctx)
    {
        System.out.println("vibration...");
    }

}