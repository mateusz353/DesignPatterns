package pl.com.ugeon.prototype;

import java.util.List;

/**
 * Created by mateusz on 01.06.18.
 */
public class EmployeesTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        long startCreating = System.nanoTime();
        Employees emps = new Employees();
        emps.loadData();
        long creatingTime = System.nanoTime() - startCreating;
        System.out.println("emps List: "+emps.getEmpList() + " Time: " + creatingTime);

        //Use the clone method to get the Employee object
        long startCloning = System.nanoTime();
        Employees empsNew = (Employees) emps.clone();
        long cloningTime = System.nanoTime() - startCloning;
        System.out.println("emps List cloned: "+empsNew.getEmpList() + " Time: " + cloningTime);

        Employees empsNew1 = (Employees) emps.clone();
        List<String> list = empsNew.getEmpList();
        list.add("John");
        List<String> list1 = empsNew1.getEmpList();
        list1.remove("Pankaj");

        System.out.println("emps List: "+emps.getEmpList());
        System.out.println("empsNew List: "+list);
        System.out.println("empsNew1 List: "+list1);
    }

}