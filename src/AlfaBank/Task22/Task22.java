package AlfaBank.Task22;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Task22 {
    public static void main (String[] args){
        long tempsecond = System.currentTimeMillis()/1000;
        long tempminutes = tempsecond/60;
        long temphours = tempminutes/60;
        long tempdays = temphours/24;
        long tempyears = tempdays % 365;
        //SimpleDateFormat curdate = new SimpleDateFormat("dd-mm-yy HH:MM:SS");
        //DateFormat startdate = ("yyyy.MM.dd","1970.01.01");
        System.out.println("tempsecond " +tempsecond);
        System.out.println("tempminutes " +tempminutes);
        System.out.println("temphours " +temphours);
        System.out.println("tempdays " +tempdays);
        System.out.println("tempyears  " +tempyears );
        //curdate = startdate + tempdays;
        //System.out.println(curdate);
        //ZonedDateTime.now()

    }

}
