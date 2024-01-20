public class Person  implements Payable, Comparable<Person>{

    static int idCounter = 1;
    int id;
    String name;
    String surname;

    public Person(){
        this.id = idCounter++;
    }
    public Person(String name, String surname){
        this();
        this.name = name;
        this.surname = surname;
    }
    public int getId(){
        return id;
    }

    public void setName(){
        this.name = name;
    }

    public void setSurname(){
        this.surname = surname;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return  surname;
    }

    public  String getPosition(){
        return "Person";
    }
    public String toString(){
        return  String.format("%s: %d. %s %s", getPosition(), id, name, surname);
    }
    public double getPaymentAmount(){
        return 0.0;
    }

    public int compareTo(Person person){
        return Double.compare(this.getPaymentAmount(), person.getPaymentAmount());
    }
}
