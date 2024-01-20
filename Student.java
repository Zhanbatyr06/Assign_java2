public class Student  extends Person{
    double gpa;
    static  final double STIPENDIA = 36660.00;
    public Student(){
        super();
    }
    public Student(String name, String surname, double gpa){
        super(name, surname);
        this.gpa = gpa;
    }
    public String toString(){
        return String.format("Student: %s %s earns %.2f tenge", super.getName(), super.getSurname(), getPaymentAmount());
    }

    public void setGpa(double gpa){
        this.gpa = gpa;
    }

    public double getGpa(){
        return gpa;
    }

    public double getPaymentAmount(){
        return gpa > 2.67 ? STIPENDIA : 0.0;
    }

}