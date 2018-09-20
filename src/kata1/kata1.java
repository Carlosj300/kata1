package kata1;

import java.util.Date;

/**
 * @author Carlos Javier Matín Perdomo
 */
public class kata1 {
    
    public static void main (String[] args){
        Person Carlos = new Person("Carlos", new Date(98,9,13));
        System.out.println(Carlos.getName() + " tiene " + Carlos.getAge() +
                           " años");
    }
}
