import java.text.NumberFormat;

public class Employee extends Person{
    private double salary;
    public Employee(String firstName, String lastName, Byte age, Integer ssn, double salary){
        super(firstName, lastName, age, ssn);
        this.salary = salary;
    }
    public String speak(){
        return "Name: "+this.getFirstName() + " " + this.getLastName() + " Salary: " + NumberFormat.getCurrencyInstance().format(this.salary);
    }
}
