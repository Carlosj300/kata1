package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author Carlos Javier Matín Perdomo
 */
public class kata1 {
    
    public static void main (String[] args){
        Calendar fecha;
        fecha = GregorianCalendar.getInstance();
        fecha.set(1998,10,13);
        Person Carlos = new Person("Carlos", fecha);
        System.out.println(Carlos.getName() + " tiene " + Carlos.getAge() +
                           " años");
    }
}
