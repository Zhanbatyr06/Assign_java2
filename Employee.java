public class Employee extends Person{
    String position;
    double salary;
    public Employee(){
        super();
    }

    public Employee(String name, String surname, String position, double salary){
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }
    public String toString(){
        return String.format("Employee: %s %s earns %.2f tenge", super.getName(), super.getSurname(), getPaymentAmount());
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }
    public String getPosition(){
        return position;
    }
    public double getPaymentAmount(){
        return salary;
    }
}
