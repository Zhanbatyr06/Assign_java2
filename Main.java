import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> pers = new ArrayList<>();
        pers.add(new Student("Ringo", "Starr", 2.0));
        pers.add(new Employee("John", "Lennon", "Designer", 27045.78));
        pers.add(new Student("Paul", "McCartney", 3.5));
        pers.add(new Employee("George", "Harrison", "Manager", 50000.00));

        Collections.sort(pers);
        printData(pers);
    }

    public static void printData(Iterable<Person> pers){
        for (Person pers1 : pers){
            System.out.println(pers1.toString());
        }
    }
}