import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondMaxValue1 {

    public Integer findSecondMaxValue(List<Integer> inList) {
        if(inList.size() != 0) {
            Collections.sort(inList);
            return inList.get(inList.size() - 2);
        } else {
            return 0;
        }
    }

}