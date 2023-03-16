import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> human = new ArrayList<Person>();
        human.add(new Person("John", "Silver", 23));
        human.add(new Person("Glad", "Sokoban", 36));
        human.add(new Person("Stan", "Li", 45));
        human.add(new Person("Vera", "Dark", 20));
        human.add(new Person("Svetla", "Bassist", 10));

        Predicate<Person> personPredicate = person -> person.getAge() > 30;
        human.removeIf(personPredicate);
        System.out.println(human);
    }
}