import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        List<Person> human = new ArrayList<Person>();
        human.add(new Person("John", "Silver Junior", 23));
        human.add(new Person("Glad", "Sokoban", 36));
        human.add(new Person("Stan", "Li", 45));
        human.add(new Person("Vera", "Dark", 20));
        human.add(new Person("Svetla", "Bassist", 10));

        human.sort((o1, o2) -> {
            StringTokenizer strToken = new StringTokenizer(o1.getSurname());
            StringTokenizer strToken1 = new StringTokenizer(o2.getSurname());

            if (strToken.countTokens() < strToken1.countTokens()) {
                return -1;
            } else if (strToken.countTokens() > strToken1.countTokens()) {
                return 1;
            } else {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        });
        System.out.println(human);
    }
}