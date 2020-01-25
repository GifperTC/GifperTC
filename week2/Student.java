import java.beans.ConstructorProperties;
import java.util.Date;
import java.time.LocalDate;
import jdk.internal.org.objectweb.asm.tree.VarInsnNode;

public class Student{
    private long id;
    private String name;
    private LocalDate birthday;

    public String getName(){
        return this.name;
    }

    /**
     * Get the student's birthday.*/
    public Date getBirthday(){
        // this.birthday.getYear();
        // this.birthday.getDayOfMonth();
        // this.birthday.getMonthValue();
        // Date birthday = new Date(this.birthday.getYear(), this.birthday.getDayOfMonth(), this.birthday.getMonthValue())
        // return birthday;
        LocalDate localDate = LocalDate.of(this.birthday.getYear(), this.birthday.getDayOfMonth(), this.birthday.getMonthValue());
        Date date = Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());
    }

    /**
     * Set the student's birthday.
     * @param year ia the year of birth, e.g. 2001
     * @param month is the birth month, 1=January, .., 12=December.
     * @param day is the day of the month
     */
    public void setBirthday(int year, int month, int day){
        //
        //
        //
        this.birthday = new Date(year-1900, month-1, day);
    }

    public void setName(String newname){
        if (newname == null) return;
        if (newname.trim().isEmpty()) return;
        this.name = newname;
    }

    Student(String name, long id) {
        this.name = name;
        this.id = id;
    }
    /**
     * Test if two students are equal.
     * @param obj is another object to compare to this one
     * @return true if obj is a Student with same id as this Student*/
    public boolean equals(Object obj){
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Student other = (Student) obj;
        return this.id.equals(other.id);
    }

    /**
     * Return a string representation, such as "Cat [5610541234]"
     */
    public String toString(){
        return this.name + " [" + this.id + "]";
    }


    
    // public static void main( String [] args ) {
    //     long Id = 123456789L;
    //     Student pee = new Student("Pirawat", Id);
    //     System.out.println(pee.name);
    //     System.out.println(pee.id);
    // }

}



