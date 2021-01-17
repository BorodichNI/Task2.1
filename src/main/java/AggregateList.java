import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class AggregateList {

    public ArrayList<Integer> AggregateList() {

        ArrayList<Integer> list = new ArrayList<>();
        for (int index = 0; index < 10; index++) {
            int number = (int) (Math.random() * 10 + 1);
            list.add(number);
        }

        Set<Integer> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);
       // list = null;

        return list;
    }
}
