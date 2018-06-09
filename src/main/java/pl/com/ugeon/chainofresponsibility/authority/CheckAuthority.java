package pl.com.ugeon.chainofresponsibility.authority;

import pl.com.ugeon.chainofresponsibility.authority.purchase.DirectorPPower;
import pl.com.ugeon.chainofresponsibility.authority.purchase.ManagerPPower;
import pl.com.ugeon.chainofresponsibility.authority.purchase.PresidentPPower;
import pl.com.ugeon.chainofresponsibility.authority.purchase.PurchasePower;
import pl.com.ugeon.chainofresponsibility.authority.purchase.PurchaseRequest;
import pl.com.ugeon.chainofresponsibility.authority.purchase.VicePresidentPPower;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Mateusz Nowakowski, Capgemini Technology Services.
 */
public class CheckAuthority {

    public static void main(String[] args) {
        PurchasePower manager = new ManagerPPower();
        PurchasePower director = new DirectorPPower();
        PurchasePower vp = new VicePresidentPPower();
        PurchasePower president = new PresidentPPower();
        manager.setSuccessor(director);
        director.setSuccessor(vp);
        vp.setSuccessor(president);

        // Press Ctrl+C to end.
        try {
            while (true) {
                System.out.println("Enter the amount to check who should approve your expenditure.");
                System.out.print(">");
                double d = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
                manager.processRequest(new PurchaseRequest(d, "General"));
            }
        } catch (Exception exc) {
            System.exit(1);
        }
    }
}