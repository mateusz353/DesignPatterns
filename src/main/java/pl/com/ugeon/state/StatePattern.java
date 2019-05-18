package pl.com.ugeon.state;

import pl.com.ugeon.state.mobile.AlertStateContext;
import pl.com.ugeon.state.mobile.Silent;
import pl.com.ugeon.state.mobile.Vibration;

/**
 * @author Mateusz Nowakowski.
 */
class StatePattern
{
    public static void main(String[] args)
    {
        AlertStateContext stateContext = new AlertStateContext();
        stateContext.alert();
        stateContext.alert();
        stateContext.setState(new Silent());
        stateContext.alert();
        stateContext.alert();
        stateContext.alert();
        stateContext.setState(new Vibration());
        stateContext.alert();
        stateContext.alert();
        stateContext.alert();
    }
}