import java.util.Comparator;
import java.util.StringTokenizer;

public class ComparatorMoreOlder implements Comparator<Person> {
    private int maxValue;

    public ComparatorMoreOlder(int maxValue) {
        this.maxValue = maxValue;
    }

    @Override
    public int compare(Person o1, Person o2) {
        StringTokenizer pers1 = new StringTokenizer(o1.getSurname());
        StringTokenizer pers2 = new StringTokenizer(o2.getSurname());
        if (pers1.countTokens() >= maxValue || pers2.countTokens() >= maxValue) {
            if (pers1.countTokens() < pers2.countTokens()) {
                return -1;
            } else if (pers1.countTokens() > pers2.countTokens()) {
                return 1;
            }
        }
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
