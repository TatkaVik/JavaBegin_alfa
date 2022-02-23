package AlfaBank.Task24;

public class Task24 {
    public static void main (String[] args){
        int val  = 123;
        int a = 10;
        int tval = val/a;
        int fval = tval/a;
        int sval = tval - fval*a;
        int thval = val - tval*a;
        //System.out.println("temp number = " +tval);
        System.out.println("first number = " +fval);
        System.out.println("second number = " +sval);
        System.out.println("third number = " +thval);
        tval = val - (thval+sval+fval);
        System.out.println(" number - number1 = " +val+" - "+thval+sval+fval+" = "+tval);

    }
}
