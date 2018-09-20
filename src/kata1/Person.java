package kata1;

import java.time.LocalDate;
import static java.time.LocalDate.now;
import java.time.Period;
import static java.time.Period.between;



/**
 * @author Carlos Javier Matín Perdomo
 */
public class Person {
    private final String name;
    private final LocalDate birthday;
    
    public Person(String name, LocalDate birthday){
        this.name = name;
        this.birthday = birthday;
    }
    
    public String getName(){
        return name;
    }
    
    public LocalDate getBirthday(){
        return birthday;
    }
    
    public int getAge(){
        LocalDate today = now();
        Period diferencia = between(birthday, today);
        return diferencia.getYears();
    }
}
