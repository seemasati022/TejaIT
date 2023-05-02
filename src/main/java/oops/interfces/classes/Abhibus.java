package oops.interfces.classes;

import oops.interfces.Phonepe;
import oops.interfces.RazorPAy;
import oops.interfces.ScanGen;

public class Abhibus implements Phonepe, RazorPAy, ScanGen {       //to create rel b/w Interface & Class, implements keyword is used

    @Override
    public void Busbooking() {
        System.out.println("implemented method in child class -abhibus meth");
        System.out.println(Phonepe.i);
        System.out.println(Phonepe.j);
    }

    @Override
    public int TicketNum(int ticket) {
        return ticket + 10;
    }

    @Override
    public void payment() {
        System.out.println("payment method");
    }

    @Override
    public void serialID() {
        System.out.println("scan method");
    }

    public static void main(String[] args) {
        Abhibus abhibus = new Abhibus();
        abhibus.Busbooking();
        abhibus.payment();
        abhibus.serialID();
    }



}
