package kata1;

import java.time.LocalDate;
import static java.time.LocalDate.of;


/**
 * @author Carlos Javier Matín Perdomo
 */
public class kata1 {
    
    public static void main (String[] args){
        LocalDate fecha = of(1998,10,13);
        Person Carlos = new Person("Carlos", fecha);
        System.out.println(Carlos.getName() + " tiene " + Carlos.getAge() +
                           " años");
    }
}
